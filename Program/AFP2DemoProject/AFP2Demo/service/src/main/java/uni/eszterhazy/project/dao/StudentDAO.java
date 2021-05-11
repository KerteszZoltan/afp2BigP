package uni.eszterhazy.project.dao;

import uni.eszterhazy.project.exceptions.IncorrectNeptunCode;
import uni.eszterhazy.project.exceptions.NameCannotBeEmpty;
import uni.eszterhazy.project.exceptions.TheStudentIsTooOld;
import uni.eszterhazy.project.exceptions.TheStudentIsTooYoung;
import uni.eszterhazy.project.model.Department;
import uni.eszterhazy.project.model.LanguageKnowledge;
import uni.eszterhazy.project.model.Student;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public interface StudentDAO {
    void createStudent(Student student) throws IOException;
    Collection<Student> readAllStudent();
    Student readStudent(String id);
    void updateStudent(String name, String id, LocalDate birth_date, Department department, int passed_semesters, List<LanguageKnowledge> languageKnowledge) throws NameCannotBeEmpty, IncorrectNeptunCode, TheStudentIsTooYoung, TheStudentIsTooOld;
    void removeStudent(String id) throws IncorrectNeptunCode;
    Collection<Student> readAllStudentOfDepartment(Department department);
}
