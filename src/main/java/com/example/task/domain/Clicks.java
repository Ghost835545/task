package com.example.task.domain;

import javax.persistence.*;

@Entity
@Table(name="clck")
public class Clicks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
