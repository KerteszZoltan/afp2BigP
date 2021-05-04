package uni.eszterhazy.project.model;

import org.apache.log4j.Logger;
import org.springframework.format.annotation.DateTimeFormat;
import uni.eszterhazy.project.exceptions.IncorrectNeptunCode;
import uni.eszterhazy.project.exceptions.NameCannotBeEmpty;
import uni.eszterhazy.project.exceptions.TheStudentIsTooOld;
import uni.eszterhazy.project.exceptions.TheStudentIsTooYoung;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    private String name;
    private String id;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birth_date;
    private Department department;
    private int passed_semesters;
    private List<LanguageKnowledge> languageKnowledge;

    Logger logger = Logger.getLogger(this.getClass());

    public Student() {
        logger.info("A new student has been created");
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameCannotBeEmpty {
        if (name.length() == 0 || name.trim().length() == 0){
            throw new NameCannotBeEmpty();
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    //Valamiért egy ilyen setter is kellet neki
    public void setId(String id) throws IncorrectNeptunCode {
        if (id.length() != 6 || id.trim().length() != 6){
            throw new IncorrectNeptunCode();
        }
        this.id = id;
    }

    public void setId() throws IncorrectNeptunCode {
        Random rnd = new Random();
        String id = new String();
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A'); chars.add('B'); chars.add('C'); chars.add('D'); chars.add('E'); chars.add('F'); chars.add('G'); chars.add('H');
        chars.add('I'); chars.add('J'); chars.add('K'); chars.add('L'); chars.add('M'); chars.add('N'); chars.add('O'); chars.add('P');
        chars.add('Q'); chars.add('R'); chars.add('S'); chars.add('T'); chars.add('U'); chars.add('V'); chars.add('W'); chars.add('X');
        chars.add('Y'); chars.add('Z'); chars.add('0'); chars.add('1'); chars.add('2'); chars.add('3'); chars.add('4'); chars.add('5');
        chars.add('6'); chars.add('7'); chars.add('8'); chars.add('9');
        for (int i=0; i < 6; i++){
            id += chars.get(rnd.nextInt(36 - 1) + 1);
        }
        if (id.length() != 6 || id.trim().length() != 6){
            throw new IncorrectNeptunCode();
        }
        this.id = id;
    }


    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate birth_date) throws TheStudentIsTooYoung, TheStudentIsTooOld {
        if (birth_date.isAfter(LocalDate.now().minusYears(18))){
            throw new TheStudentIsTooYoung("The students can't be younger than 18.");
        }
        if (birth_date.isBefore(LocalDate.now().minusYears(100))){
            throw new TheStudentIsTooOld("The students can't be older than 100.");
        }
        this.birth_date = birth_date;

    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getPassed_semesters() {
        return passed_semesters;
    }

    public void setPassed_semesters(int passed_semesters) {
        this.passed_semesters = passed_semesters;
    }

    public List<LanguageKnowledge> getLanguageKnowledge() {
        return languageKnowledge;
    }

    public void setLanguageKnowledge(List<LanguageKnowledge> languageKnowledge) {
        this.languageKnowledge = languageKnowledge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID: ='" + id + '\'' +
                ", birth_date=" + birth_date +
                ", department=" + department +
                ", passed_semesters=" + passed_semesters +
                ", languageKnowledge=" + languageKnowledge +
                '}';
    }
}
