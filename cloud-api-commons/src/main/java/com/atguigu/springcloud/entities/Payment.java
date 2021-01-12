package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by yh on 2020/12/28.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable{

    /**
     * 主键
     */
    private Integer id;
    /**
     *
     */
    private String serial;
}
