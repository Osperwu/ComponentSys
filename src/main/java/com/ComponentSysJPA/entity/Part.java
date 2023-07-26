package com.ComponentSysJPA.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Part {
    public Part() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sno;
    private String pid;
    private String name;
    private String pic;
    private long createTime;
}
