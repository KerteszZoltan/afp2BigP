package uni.eszterhazy.beadando.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import uni.eszterhazy.beadando.model.Department;
import uni.eszterhazy.beadando.model.Student;
import uni.eszterhazy.beadando.service.StudentsService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Collection;

@RestController
@RequestMapping(value = "/rest/")
public class RESTStudentController {

    @Autowired
    StudentsService studentsService;

    /*
    @GetMapping(value = "students")
    public Collection<Student> getAllStudent(){
        return studentsService.getAllStudent();
    }*/

    @GetMapping(value = "students/{id:[A-Za-z0-9]{6}}")
    public Student getStudentById(@PathVariable(name = "id") String id){

        try{
            return studentsService.getStudentById(id);
        }
        catch (StudentNotFound e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student with the following ID is not available: " + e.getMessage(), e)
        }

    }

    @GetMapping(value = "students")
    public Collection<Student> getAllStudentOfDepartment(@RequestParam(value = "department", required = false) Department department){
        if (department != null){
            return studentsService.readAllStudentOfDepartment(department);
        } return  studentsService.getAllStudent();
    }

    /*
    @PostMapping(value = "students", consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json;charset=utf-8")
    public String addStudent(@RequestBody Student student){
        System.out.println("Plus: " + student);
        //studentsService.addStudent(student);
        return "";
    }*/
    
    @PostMapping(value = "students", consumes = MediaType.APPLICATION_JSON_VALUE, produces="application/json;charset=utf-8")
    public String addStudent(@RequestBody Student student) throws IOException, InvalidParams, StudentNotFound {
        try{
            System.out.println("Plus: "+student);
            studentsService.addStudent(student);
            return "A new student has been added, with the following neptun code:  "+student.getId();
        } catch (StudentNotFound e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Student with the following ID already in use: "+e.getMessage(), e);
        }

    }


    /*
    @PostMapping(value = "dolgozok",consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json;charset=utf-8")
    public  String addDolgozo(@RequestBody Dolgozo dolgozo) throws DolgozoAlreadyAdded {
        System.out.println("Hozzaadando: "+dolgozo);
        dolgozoService.addDolgozo(dolgozo);
        return "Új dolgozó került hozzáadásra a köv azonosítóval: "+dolgozo.getId();
    }*/






}
