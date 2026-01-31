package com.kode.jdbc.springjdbc;

import com.kode.jdbc.springjdbc.dao.Student;
import com.kode.jdbc.springjdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringJdbcApplication.class, args);

       StudentService studentService =  run.getBean(StudentService.class);
       Student student = run.getBean(Student.class);

       student.setId(2);
       student.setName("kode");
       student.setAge(29);

       studentService.save(student);

        System.out.println(studentService.getStudents());



    }

}
