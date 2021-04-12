import org.apache.log4j.Logger;
import org.springframework.format.annotation.DateTimeFormat;
import dao.StudentDAO;
import exceptions.IncorrectNeptunCode;
import exceptions.NameCannotBeEmpty;
import exceptions.TheStudentIsTooOld;
import exceptions.TheStudentIsTooYoung;
import model.Department;
import model.LanguageKnowledge;
import model.Student;
import service.StudentsService;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentsService {
    Logger logger = Logger.getLogger(this.getClass());
    private StudentDAO sDao;

    public StudentServiceImpl(StudentDAO sDao) {
        this.sDao = sDao;
    }

    public void addStudent(Student student) throws IOException {
        sDao.createStudent(student);
    }

    public Collection<Student> getAllStudent() {
        Collection<Student> result = sDao.readAllStudent();
        logger.info("The database contains " + result.size() + " student(s)");
        return sDao.readAllStudent();
    }

    @Override
    public Student getStudentById(String id) {
        return sDao.readStudent(id);
    }

    public Student getStudentById() {
        return null;
    }


    public void updateStudent(String name, String id, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate birth_date, Department department, int passed_semesters, List<LanguageKnowledge> languageKnowledge) throws TheStudentIsTooOld, NameCannotBeEmpty, TheStudentIsTooYoung, IncorrectNeptunCode {
        sDao.updateStudent(name,id,birth_date,department,passed_semesters,languageKnowledge);
    }

    public void deleteStudent(String id) {
        sDao.removeStudent(id);
    }


    public Collection<Student> readAllStudentOfDepartment(Department department) {
        Collection<Student> students = getAllStudent();
        Collection<Student> result = students.stream().filter(s -> s.getDepartment() == department).collect(Collectors.toList());
        return result;
    }

}