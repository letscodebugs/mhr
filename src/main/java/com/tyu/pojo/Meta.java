package com.tyu.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Meta implements Serializable {
    private Boolean keepAlive;

    private Boolean requireAuth;
}
