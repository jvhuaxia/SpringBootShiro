package com.example.demo62.pojo;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class TbProduct {
    private String id;
    private String name;
    private String num;
    private BigDecimal price;
    private String time;
}
