package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Grade;

public interface GradeService {
	List<Grade> retrieveAllRoles();
	 Grade addRole(Grade u);
	void deleteRole(String id);
	Grade updateRole(Grade u);
	Grade retrieveRole(String id);

}
