package com.tyu.pojo;

import lombok.Data;

import java.util.List;

@Data
public class RespPageBean {
    private Long total;
    private List<?> data;
}
