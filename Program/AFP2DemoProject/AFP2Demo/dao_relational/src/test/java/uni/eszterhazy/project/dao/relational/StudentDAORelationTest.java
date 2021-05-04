package uni.eszterhazy.project.dao.relational;

import org.junit.Test;
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

public class StudentDAORelationTest {
    @Test
    public void test() throws NameCannotBeEmpty, TheStudentIsTooYoung, TheStudentIsTooOld, IncorrectNeptunCode, IOException {
        StudentDAO sDao = new StudentDAORelation();
        Student student = new Student();
        student.setName("Minta Péter");
        student.setBirth_date(LocalDate.of(1987,11,23));
        student.setPassed_semesters(5);
        student.setDepartment(Department.CS);
        student.setId();
        LanguageKnowledge lk = new LanguageKnowledge("Angol","C1");
        LanguageKnowledge lk2 = new LanguageKnowledge("Német","A1");
        List languages = new ArrayList<>();
        languages.add(lk);
        languages.add(lk2);
        student.setLanguageKnowledge(languages);
        sDao.createStudent(student);
        System.out.println(sDao.readAllStudentOfDepartment(Department.CS));
        System.out.println(sDao.readStudent(student.getId()));
        System.out.println(student.getName());
    }

    /*
    @Test
    public void DeleteStudentTest(){
        StudentDAO sDao = new StudentDAORelation();
        sDao.removeStudent("K7QOP4");
    }

    @Test
    public void ModifyStudentTest() throws TheStudentIsTooOld, NameCannotBeEmpty, TheStudentIsTooYoung, IncorrectNeptunCode {
        List<LanguageKnowledge> languageKnowledge = new ArrayList<>();
        LanguageKnowledge l1 = new LanguageKnowledge("English","B2");
        languageKnowledge.add(l1);
        StudentDAO sDao = new StudentDAORelation();
        sDao.updateStudent("Random Roland","K7QOP5",LocalDate.of(1997,03,21),
                            Department.BI,4,languageKnowledge);

    }*/

}