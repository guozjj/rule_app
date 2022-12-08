package com.fnd.eo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
//@Table(name = "test")
public class Test {

    @Id
    private Long id;

    private String name;

    private String test;

    private String mark;

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", test='" + test + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

}
