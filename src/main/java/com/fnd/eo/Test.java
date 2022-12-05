package com.fnd.eo;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "test")
@ToString
public class Test {

    @Id
    private Long id;

    private String name;

    private String test;

    private String mark;

}
