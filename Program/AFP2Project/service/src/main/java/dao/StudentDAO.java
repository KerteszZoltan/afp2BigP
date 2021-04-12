package dao;

import org.springframework.format.annotation.DateTimeFormat;
import exceptions.IncorrectNeptunCode;
import exceptions.NameCannotBeEmpty;
import exceptions.TheStudentIsTooOld;
import exceptions.TheStudentIsTooYoung;
import model.Department;
import model.LanguageKnowledge;
import model.Student;


import java.io.IOException;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public interface StudentDAO {
    void createStudent(Student student) throws IOException;
    Collection<Student> readAllStudent();
    Student readStudent(String id);
    void updateStudent(String name, String id, LocalDate birth_date, Department department, int passed_semesters, List<LanguageKnowledge> languageKnowledge) throws NameCannotBeEmpty, IncorrectNeptunCode, TheStudentIsTooYoung, TheStudentIsTooOld;
    void removeStudent(String id);
    Collection<Student> readAllStudentOfDepartment(Department department);
}