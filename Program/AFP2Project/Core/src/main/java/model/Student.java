package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

public class Student {
    private String name;
    private String id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birth_date;


    private int passed_semesters;


    Logger logger = Logger.getLogger(String.valueOf(this.getClass()));

    public Student() {
        logger.info("A new student has been created");
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.length() == 0 || name.trim().length() == 0){
            throw new Exception("Error", null);
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        if (id.length() != 6 || id.trim().length() != 6){
            throw new Exception("Error", null);
        }
        this.id = id;
    }

    public void setId() throws Exception {
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
            throw new Exception("Error", null);
        }
        this.id = id;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public void setPassed_semesters(int passed_semesters) {
        this.passed_semesters = passed_semesters;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID: ='" + id + '\'' +
                ", birth_date=" + birth_date +
                ", passed_semesters=" + passed_semesters +
                '}';
    }
}
