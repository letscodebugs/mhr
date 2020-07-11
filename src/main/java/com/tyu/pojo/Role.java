package com.tyu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class Role implements Serializable {

    private Integer id;
    private String name;
    private String nameZh;

}
