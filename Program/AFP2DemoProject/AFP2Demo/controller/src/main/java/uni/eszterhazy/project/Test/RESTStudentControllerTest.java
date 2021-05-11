package uni.eszterhazy.project.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RESTStudentControllerTest {
    RESTStudentController rESTStudentController;
    @BeforeEach
    void setUp() {
        rESTStudentController = new RESTStudentController();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getStudentById() {
        String id = "123ABC";
        Student resust = rESTStudentController.getStudentById(id);
        assertEquals(result,"123ABC");
    }

    @Test
    void getAllStudentOfDepartment() {

    }

    @Test
    void addStudent() {
        Student student = new Student();

    }
}