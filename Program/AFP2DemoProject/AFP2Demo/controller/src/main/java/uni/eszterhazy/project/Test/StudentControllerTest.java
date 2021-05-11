package uni.eszterhazy.project.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uni.eszterhazy.project.model.Department;
import uni.eszterhazy.project.model.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest{
    StudentController studentController;
    @BeforeEach
    void setUp() {
        studentController = new StudentController();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getStudentById() {
        String resust = studentController.getStudentById("123ABC");
        assertEquals(result,"studentdetails.jsp");
    }

    @Test
    void addStudentForm() {
        String result = studentController.addStudentForm(Model model)
        assertEquals(result,"studentForm.jsp");
    }

    @Test
    void addStudent() {
        Student student = new Student();
        String result = studentController.addStudent(student);
        assertEquals(result,"redirect:student/"+student.getId());
    }
}