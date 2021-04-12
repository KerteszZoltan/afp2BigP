package uni.eszterhazy.beadando.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import uni.eszterhazy.beadando.model.Department;
import uni.eszterhazy.beadando.model.Student;
import uni.eszterhazy.beadando.service.StudentsService;

import java.io.IOException;

@Controller
public class StudentController {
    //DI különbésgek, mikor kerül be

    @Autowired
    @Qualifier("studentsService")
    StudentsService service;

    @GetMapping(value="/students")
    public ModelAndView getStudents(){
        ModelAndView mav = new ModelAndView("studentsList.jsp");
        System.out.println(service.getAllStudent());
        mav.addObject("students",service.getAllStudent());
        return mav;
    }

    @ModelAttribute(value = "student")
    public Student create(){
        return new Student();
    }

    @GetMapping(value = "/student/{id}")
    public String getStudentById(@PathVariable String id, Model model){
        model.addAttribute("student",service.getStudentById(id));
        return "studentdetails.jsp";
    }

    @GetMapping(value = "addStudent")
    public String addStudentForm(Model model){
        model.addAttribute("Departments", Department.values());
        return "studentForm.jsp";
    }

    @PostMapping(value = "addStudent")
    public String addStudent(@ModelAttribute("student") Student student, Model model) throws IOException {
        System.out.println(student);
        service.addStudent(student);
        return "redirect:dolgozo/"+student.getId();
    }



}
