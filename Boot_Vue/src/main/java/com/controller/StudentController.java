package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exception.StudentNotFoundException;
/*import com.model.Student;
import com.service.StudentService;*/

@Controller
@RequestMapping("/student")
public class StudentController {
	
	/*@Autowired
	private StudentService studentService;
	
	@RequestMapping(value= "/get/{studentId}", method= RequestMethod.GET)
	public Student getStudentByID(@PathVariable("studentId") long studentId) throws StudentNotFoundException {
		return studentService.getStudentByID(studentId);
	}
	
	@RequestMapping(value= "/add", method= RequestMethod.GET)
	public String addStudent(Model model) {
		model.addAttribute("student", new Student());
		return "addStudent";
	}
	
	@RequestMapping(value= "/add", method= RequestMethod.POST)
	public String addStudent(Student student, Model model) {
		studentService.addStudent(student, model);
		return "addStudent";
	}*/
}
