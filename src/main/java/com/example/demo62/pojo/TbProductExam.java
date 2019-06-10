package com.example.demo62.pojo;

import lombok.Data;

@Data
public class TbProductExam {
    private String id;
    private String name;
    private String time;

    public void init() {
        if (id == null) {
            this.id = "%%";
        } else {
            this.id = "%" + id + "%";
        }
        if (name == null) {
            this.name = "%%";
        } else {
            this.name = "%" + name + "%";
        }
        if (time == null) {
            this.time = "%%";
        } else {
            this.time = "%" + time + "%";
        }
    }
}
