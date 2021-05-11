package uni.eszterhazy.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;
import uni.eszterhazy.project.exceptions.IncorrectNeptunCode;
import uni.eszterhazy.project.exceptions.NameCannotBeEmpty;
import uni.eszterhazy.project.exceptions.TheStudentIsTooOld;
import uni.eszterhazy.project.exceptions.TheStudentIsTooYoung;
import uni.eszterhazy.project.model.Department;
import uni.eszterhazy.project.model.Student;
import uni.eszterhazy.project.service.studentsService;

import java.io.IOException;

@Controller
public class StudentController {
    //DI különbésgek, mikor kerül be

    @Autowired
    @Qualifier("studentsService")
    studentsService service;

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
        return "redirect:student/"+student.getId();
    }


    //Delete
    @GetMapping(value="deleteStudent")
    public String deleteStudentForm(Model model){
        return "studentFormDelete.jsp";
    }

    @PostMapping(value = "deleteStudent")
    public String deleteStudent(@ModelAttribute("student") Student student, Model model) throws Exception, IncorrectNeptunCode {
        try{
            service.deleteStudent(student.getId());
            return "redirect:students/";
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Student with the following ID isn't avaliable: "+e.getMessage(),e);
        }
    }


    //Update
    @GetMapping(value = "/updateStudent")
    public String updateStudentForm(Model model){
        model.addAttribute("Departments", Department.values());
        return "studentFormUpdate.jsp";
    }

    @PostMapping(value = "updateStudent")
    public String updateStudent(@ModelAttribute("student") Student student, Model model) throws TheStudentIsTooOld, NameCannotBeEmpty, TheStudentIsTooYoung, IncorrectNeptunCode, Exception {
        try {
            service.updateStudent(student.getName(), student.getId(), student.getBirth_date(), student.getDepartment(), student.getPassed_semesters(), student.getLanguageKnowledge());
            return "redirect:students/";
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Student with the following ID isn't avaliable: "+e.getMessage(),e);
        }
    }

    //List by departments
    @GetMapping(value="/listByDep")
    public ModelAndView listByDep(){
        ModelAndView mav = new ModelAndView("studentFormlistByDep.jsp");
        mav.addObject("students",service.readAllStudentOfDepartment(Department.CS));
        return mav;
    }

    @GetMapping(value="/listByDepBI")
    public ModelAndView listByDepBI(){
        ModelAndView mav = new ModelAndView("studentFormlistByDep.jsp");
        mav.addObject("students",service.readAllStudentOfDepartment(Department.BI));
        return mav;
    }

    @GetMapping(value="/listByDepTM")
    public ModelAndView listByDepTM(){
        ModelAndView mav = new ModelAndView("studentFormlistByDep.jsp");
        mav.addObject("students",service.readAllStudentOfDepartment(Department.TM));
        return mav;
    }

    @GetMapping(value="/listByDepITL")
    public ModelAndView listByDepITL(){
        ModelAndView mav = new ModelAndView("studentFormlistByDep.jsp");
        mav.addObject("students",service.readAllStudentOfDepartment(Department.ITL));
        return mav;
    }



}
