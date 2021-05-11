package uni.eszterhazy.project.model;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uni.eszterhazy.project.exceptions.IncorrectNeptunCode;
import uni.eszterhazy.project.exceptions.NameCannotBeEmpty;
import uni.eszterhazy.project.exceptions.TheStudentIsTooOld;
import uni.eszterhazy.project.exceptions.TheStudentIsTooYoung;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() throws NameCannotBeEmpty {
        student.setName("Minta Péter");
        student.getName();
        assertEquals(student.getName(), "Minta Péter");
    }

    @Test
    void setName() throws NameCannotBeEmpty {
        String oldName = student.getName();
        student.setName("Valami");
        assertNotEquals(student.getName(), oldName);
    }

    @Test
    void getId() throws IncorrectNeptunCode {
        student.setId("123ABC");
        assertEquals(student.getId(), "123ABC");
    }

    @Test
    void setId() throws IncorrectNeptunCode {
        String oldId = student.getId();
        student.setId("Valami");
        assertNotEquals(student.getId(), oldId);
    }

    @Test
    void setId2() throws IncorrectNeptunCode {
        assertThrows(IncorrectNeptunCode.class, () -> { student.setId("Valami1");});
    }


    @Test
    void getBirth_date() throws TheStudentIsTooYoung, TheStudentIsTooOld {
        student.setBirth_date(LocalDate.of(1997,11,11));
        assertEquals(student.getBirth_date(), LocalDate.of(1997,11,11));
    }

    @Test
    void setBirth_date() throws TheStudentIsTooYoung, TheStudentIsTooOld {
        LocalDate oldBirth = student.getBirth_date();
        student.setBirth_date(LocalDate.of(1997,11,11));
        assertNotEquals(student.getBirth_date(), oldBirth);
    }

    @Test
    void getDepartment() {
        student.setDepartment(Department.BI);
        assertEquals(student.getDepartment(),Department.BI);
    }

    @Test
    void setDepartment() {
        Department oldDep = student.getDepartment();
        student.setDepartment(Department.CS);
        assertNotEquals(student.getDepartment(), oldDep);
    }

    @Test
    void getPassed_semesters() {
        student.setPassed_semesters(3);
        assertEquals(student.getPassed_semesters(),3);
    }

    @Test
    void setPassed_semesters() {
        int oldSem = student.getPassed_semesters();
        student.setPassed_semesters(2);
        assertNotEquals(student.getPassed_semesters(), oldSem);
    }

}