package com.kode.jdbc.springjdbc.repo;

import com.kode.jdbc.springjdbc.dao.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    List<Student> students = new ArrayList<>();
    public static final String insertQuery = "insert into student(id,name,age) values(?,?,?)";

    public static final String fetch = "select * from student";

    public void save(Student student) {
        jdbcTemplate.update(insertQuery,student.getId(),student.getName(),student.getAge());
       // students.add(student);
    }

    public List<Student> getStudents() {
        return jdbcTemplate.query(fetch, (rs, rowNum) -> new Student(rs.getInt(1),rs.getString(2),rs.getInt(3)));
    }
}
