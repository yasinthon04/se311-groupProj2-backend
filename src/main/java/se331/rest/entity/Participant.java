package se331.rest.entity;

import lombok.*;
import se331.rest.entity.patient.People;
import se331.rest.entity.vaccine.Vaccine;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String name;
    String telNo;
    @ManyToMany
    List<People> peopleListHistory;
    @ManyToMany
    List<Vaccine> vaccineListHistory;
}
