package com.kode.jdbc.springjdbc.service;

import com.kode.jdbc.springjdbc.dao.Student;
import com.kode.jdbc.springjdbc.repo.StudentRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public void save(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getStudents() {
        return studentRepo.getStudents();
    }
}
