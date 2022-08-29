package ch.martinelli.demo.hilla.data.service;

import ch.martinelli.demo.hilla.data.entity.SamplePerson;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}