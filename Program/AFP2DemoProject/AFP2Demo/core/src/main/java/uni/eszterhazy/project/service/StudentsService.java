package uni.eszterhazy.beadando.service;

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

public interface StudentsService {
    void addStudent(Student student) throws IOException;
    Collection<Student> getAllStudent();
    Student getStudentById(String id);
    void updateStudent(String name, String id, LocalDate birth_date, Department department, int passed_semesters, List<LanguageKnowledge> languageKnowledge) throws TheStudentIsTooOld, NameCannotBeEmpty, TheStudentIsTooYoung, IncorrectNeptunCode;
    void deleteStudent(String id);
    Collection<Student> readAllStudentOfDepartment(Department department);

}
