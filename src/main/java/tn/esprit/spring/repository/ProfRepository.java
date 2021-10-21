package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.service.*;
import tn.esprit.spring.entity.Prof;
@Repository("userRepository")
public interface ProfRepository extends CrudRepository<Prof, Long>
{
	List<Prof> findByFirstName(String firstName);
	List<Prof> findByLastName(String lastName);

}
