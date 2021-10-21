package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Grade;

@Repository("roleRepository")
public interface GradeRepository  extends CrudRepository<Grade, Long> {
	
}
