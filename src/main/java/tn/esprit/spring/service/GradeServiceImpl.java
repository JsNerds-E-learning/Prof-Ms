package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Grade;
import tn.esprit.spring.repository.GradeRepository; ;
@Service
public class GradeServiceImpl  implements GradeService{
	@Autowired
	GradeRepository GradeRepository ;
	private static final Logger l = LogManager.getLogger(GradeServiceImpl.class);
	
	@Override
	public List<Grade> retrieveAllRoles() {
		List<Grade> Grades=(List<Grade>) GradeRepository.findAll();
		for(Grade Grade: Grades){
			l.info("Role list : "+ Grade);
		}
		return Grades;
	}

	@Override
	public Grade addRole(Grade u) {
		// TODO Auto-generated method stub
		return GradeRepository.save(u);
	}

	@Override
	public void deleteRole(String id_role) {
		GradeRepository.deleteById(Long.parseLong(id_role));
		
	}

	@Override
	public Grade updateRole(Grade u) {
		return GradeRepository.save(u);
	}

	@Override
	public Grade retrieveRole(String id_Role) {
		return null;

	}

	public GradeServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
}
