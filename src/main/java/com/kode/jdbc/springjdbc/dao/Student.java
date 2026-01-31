package com.kode.jdbc.springjdbc.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    int id;
    String name;
    int age;

    @Override
    public String toString() {
        return this.id + " - "+ this.name+ " - "+this.age;
    }
}
