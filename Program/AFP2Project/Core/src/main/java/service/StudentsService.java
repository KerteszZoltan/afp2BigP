package service;

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

public interface StudentsService {
    void addStudent(Student student) throws IOException;
    Collection<Student> getAllStudent();
    Student getStudentById(String id);
    void updateStudent(String name, String id, LocalDate birth_date, Department department, int passed_semesters, List<LanguageKnowledge> languageKnowledge) throws TheStudentIsTooOld, NameCannotBeEmpty, TheStudentIsTooYoung, IncorrectNeptunCode;
    void deleteStudent(String id);
    Collection<Student> readAllStudentOfDepartment(Department department);

}
