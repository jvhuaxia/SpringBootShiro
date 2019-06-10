package com.example.demo62.dto;

import lombok.Data;

import java.util.List;

@Data
public class Page<T> {
    private List<T> records;
    private long total;
}
