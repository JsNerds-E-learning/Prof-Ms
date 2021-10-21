package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Prof;

public interface ProfService {
	List<Prof> retrieveAllUsers();
	 Prof addUser(Prof u);
	void deleteUser(String id);
	Prof updateUser(Prof u);
	Prof retrieveUser(String id);
}
