import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uni.eszterhazy.project.service.studentsService;

public class StudentApp {
    public static void main(String[] args) {
        /*ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        //StudentDAO sDao = (StudentDAO) context.getBean("mysql");
        studentsService service = (studentsService) context.getBean("studentsService");
        System.out.println(service.getAllStudent());*/

        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        studentsService service = (studentsService) context.getBean("studentsService");
        System.out.println(service.getAllStudent());
    }
}
