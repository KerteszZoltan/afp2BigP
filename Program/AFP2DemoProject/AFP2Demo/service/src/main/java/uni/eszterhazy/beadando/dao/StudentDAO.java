package uni.eszterhazy.beadando.dao;

import org.springframework.format.annotation.DateTimeFormat;
import uni.eszterhazy.beadando.exceptions.IncorrectNeptunCode;
import uni.eszterhazy.beadando.exceptions.NameCannotBeEmpty;
import uni.eszterhazy.beadando.exceptions.TheStudentIsTooOld;
import uni.eszterhazy.beadando.exceptions.TheStudentIsTooYoung;
import uni.eszterhazy.beadando.model.Department;
import uni.eszterhazy.beadando.model.LanguageKnowledge;
import uni.eszterhazy.beadando.model.Student;

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
