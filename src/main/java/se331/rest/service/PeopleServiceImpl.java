package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.dao.PeopleDao;
import se331.rest.dao.VaccineDao;
import se331.rest.entity.patient.People;

import javax.transaction.Transactional;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    PeopleDao peopleDao;

    @Autowired
    VaccineDao vaccineDao;

    @Override
    public Integer getPeopleSize() {
        return peopleDao.getPeopleSize();
    }

    @Override
    public Page<People> getPeoples(Integer pageSize, Integer page) {
        return peopleDao.getPeoples(pageSize, page);
    }

    @Override
    public People getPeople(Long id) {
        return peopleDao.getEvents(id);
    }

    @Override
    @Transactional
    public People save(People people) {
        return peopleDao.save(people);
    }

    @Override
    public Page<People> getPeoples(String title, Pageable pageable) {
        return peopleDao.getEvents(title,pageable);
    }
}

