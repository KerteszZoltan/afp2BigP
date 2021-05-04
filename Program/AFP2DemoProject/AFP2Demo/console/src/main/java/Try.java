import uni.eszterhazy.project.dao.StudentDAO;
import uni.eszterhazy.project.dao.relational.StudentDAORelation;
import uni.eszterhazy.project.service.studentsService;
import uni.eszterhazy.project.service.impl.studentsServiceImpl;

public class Try {
    public static void main(String[] args) {
        StudentDAO sDao = new StudentDAORelation();
        studentsService service = new studentsServiceImpl(sDao);
        System.out.println(service.getAllStudent());

    }
}
