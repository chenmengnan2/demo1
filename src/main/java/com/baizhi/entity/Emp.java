package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emp")
public class Emp implements Serializable {
    @Id
    private Integer id;
    private String name;
    @JSONField(serialize = false)
    private Integer salary;
    private Integer age;
}
