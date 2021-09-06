package fi.server2021.ModelView.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.server2021.ModelView.domain.Student;

@Controller
public class StudentController {
	
	ArrayList<Student> students = new ArrayList<>();

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String studentList(Model model) {
		students.add(new Student("Kate", "Cole"));
		students.add(new Student("Dan", "Brown"));
		students.add(new Student("Mike", "Mars"));
		model.addAttribute("students", students);
		
		return "studentlist";
	}
}
