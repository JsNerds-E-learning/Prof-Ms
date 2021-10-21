package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Prof;
import tn.esprit.spring.repository.ProfRepository;
@Service
public class ProfServiceImpl implements ProfService {
	@Autowired
	ProfRepository profRepository ;
	private static final Logger l = LogManager.getLogger(ProfServiceImpl.class);
	
	@Override
	public List<Prof> retrieveAllUsers() {
		List<Prof> profs=(List<Prof>) profRepository.findAll();
		for(Prof prof: profs){
			l.info("user list : "+ prof);
		}
		return profs;
	}

	@Override
	public Prof addUser(Prof u) {
		// TODO Auto-generated method stub
		return profRepository.save(u);
	}

	@Override
	public void deleteUser(String id_user) {
		profRepository.deleteById(Long.parseLong(id_user));
		
	}

	@Override
	public Prof updateUser(Prof u) {
		return profRepository.save(u);
	}

	@Override
	public Prof retrieveUser(String id_user) {
		return null;

	}

	public ProfServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

}
