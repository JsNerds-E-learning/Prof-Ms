package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Grade;
import tn.esprit.spring.entity.Prof;
import tn.esprit.spring.service.GradeService;
import tn.esprit.spring.service.ProfService;

@RestController
public class ProfController {
@Autowired 
ProfService profService;
@Autowired
GradeService gradeService;
@RequestMapping(value = "/actuator/info")
@GetMapping("/retrieve-all-users")
@ResponseBody
public List<Prof> getUsers(){
	List<Prof> prof = profService.retrieveAllUsers();
	return prof;
}

@GetMapping("/retrieve-prof/{id}")
@ResponseBody
public Prof getUserById(@PathVariable("id") String id_user){
	return profService.retrieveUser(id_user);
}
@PostMapping("/add-prof")
@ResponseBody
public String addUser(@RequestBody Prof u){
	Grade r= gradeService.addRole(u.getRole());
	Prof prof= profService.addUser(u);
	return "this is prof:"+prof+"and this is his prof:"+r ;
}

@DeleteMapping("/delete-prof{id}")
@ResponseBody
public void deleteUser(@PathVariable("id") String id_user){
	profService.deleteUser(id_user);
}

@PutMapping("/update-prof")
@ResponseBody
public Prof UpdateUser(@RequestBody Prof prof){
	return profService.updateUser(prof);
}




}
