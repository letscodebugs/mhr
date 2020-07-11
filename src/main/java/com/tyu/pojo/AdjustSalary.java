package com.tyu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class AdjustSalary {

    private Integer id;
    private Integer eid;
    private Date asdate;
    private Integer beforesalary;
    private Integer aftersalary;
    private String reason;
    private String remark;

}
