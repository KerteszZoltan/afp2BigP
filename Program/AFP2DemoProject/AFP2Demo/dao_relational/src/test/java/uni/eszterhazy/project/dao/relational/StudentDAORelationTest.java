package uni.eszterhazy.project.dao.relational;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uni.eszterhazy.project.dao.StudentDAO;
import uni.eszterhazy.project.exceptions.IncorrectNeptunCode;
import uni.eszterhazy.project.exceptions.NameCannotBeEmpty;
import uni.eszterhazy.project.exceptions.TheStudentIsTooOld;
import uni.eszterhazy.project.exceptions.TheStudentIsTooYoung;
import uni.eszterhazy.project.model.Department;
import uni.eszterhazy.project.model.LanguageKnowledge;
import uni.eszterhazy.project.model.Student;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentDAORelationTest {
    StudentDAO sDao;
    Student student;
    @BeforeEach
    void setUp() {
        sDao = new StudentDAORelation();
        student = new Student();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createStudent() throws IncorrectNeptunCode, NameCannotBeEmpty, TheStudentIsTooYoung, TheStudentIsTooOld, IOException {


        student.setId("K7QOP4");
        student.setName("Minta Péter");
        student.setBirth_date(LocalDate.of(1987,11,23));
        student.setPassed_semesters(5);
        student.setDepartment(Department.CS);
        LanguageKnowledge lk = new LanguageKnowledge("Angol","C1");
        LanguageKnowledge lk2 = new LanguageKnowledge("Német","A1");
        List languages = new ArrayList<>();
        languages.add(lk);
        languages.add(lk2);
        student.setLanguageKnowledge(languages);
        assertEquals(student.getId(), "K7QOP4");
    }

    @Test
    void readStudent() throws IncorrectNeptunCode, NameCannotBeEmpty, TheStudentIsTooYoung, TheStudentIsTooOld {
        assertEquals(student.getId(), "K7QOP4");
    }

    @Test
    void updateStudent() throws IncorrectNeptunCode {
        String oldId = student.getId();
        student.setId();
        assertNotEquals(oldId, student.getId());
    }

    @Test
    void removeStudent() throws IncorrectNeptunCode {
        String delID = student.getId();
        assertDoesNotThrow( () -> {sDao.removeStudent(delID);});
    }

    @Test
    void readAllStudentOfDepartment() {
    }
}