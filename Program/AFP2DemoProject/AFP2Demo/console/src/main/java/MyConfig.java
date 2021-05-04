import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import uni.eszterhazy.project.dao.StudentDAO;
import uni.eszterhazy.project.dao.relational.StudentDAORelation;
import uni.eszterhazy.project.service.studentsService;
import uni.eszterhazy.project.service.impl.studentsServiceImpl;

@Configuration
@ComponentScan({"uni.eszterhazy.project.controller"})
public class MyConfig {

    //Bean-eket vissza adó metódusok
    @Bean
    public StudentDAO mysql(){
        return new StudentDAORelation();
    }

    @Bean
    public studentsService studentsService(StudentDAO sDao){
        return new studentsServiceImpl(sDao);
    }
}
