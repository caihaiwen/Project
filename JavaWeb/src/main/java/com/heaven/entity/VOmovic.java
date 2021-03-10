package com.heaven.entity;

import lombok.Data;

import java.util.List;

@Data
public class VOmovic {
    private Integer code;
    private String msg;
    private Integer count;
    private List<Movic> data;
}
