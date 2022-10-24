package se331.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import se331.rest.entity.patient.People;

import java.util.List;

public interface PeopleRepository extends JpaRepository<People,Long> {
    List<People> findAll();
    Page<People> findByName(String name, Pageable pageRequest);
//    Page<People> findByTitleContaining(String name, Pageable pageRequest);
//    Page<People> findByTitleContainingOrDescriptionContaining(String name, String description, Pageable pageRequest);
//    Page<People> findByTitleContainingOrDescriptionContainingOrOrganizer_NameContaining(String title, String description, String organizerName, Pageable pageRequest);
//    Page<People> findByTitleIgnoreCaseContainingOrDescriptionIgnoreCaseContainingOrOrganizer_NameIgnoreCaseContaining(String title, String description, String organizerName, Pageable pageRequest);
}
