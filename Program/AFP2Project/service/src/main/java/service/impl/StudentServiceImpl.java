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


}