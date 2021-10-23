package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Grade;
import tn.esprit.spring.service.GradeService;;
@RestController
public class GradeController {
	@Autowired 
	GradeService gradeService;

	@GetMapping("/retrieve-all-grades")
	@ResponseBody
	public List<Grade> getroles(){
		List<Grade> grade = gradeService.retrieveAllRoles();
		return grade;
	}

	@GetMapping("/retrieve-grade/{id}")
	@ResponseBody
	public Grade getroleById(@PathVariable("id") String id_role){
		return gradeService.retrieveRole(id_role);
	}
	@PostMapping("/add-grade")
	@ResponseBody
	public Grade addrole(@RequestBody Grade u){
		Grade grade= gradeService.addRole(u);
		return grade;
	}

	@DeleteMapping("/delete-grade/{id}")
	@ResponseBody
	public void deleterole(@PathVariable("id") String id_role){
		gradeService.deleteRole(id_role);
	}

	@PutMapping("/update-grade")
	@ResponseBody
	public Grade Updaterole(@RequestBody Grade grade){
		return gradeService.updateRole(grade);
	}

}
