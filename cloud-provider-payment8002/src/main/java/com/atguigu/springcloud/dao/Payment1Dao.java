package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author yinhao
 * @date 2021/1/20 18:43
 */
@Mapper
public interface Payment1Dao {
    int insertPayment(Payment payment);

    Payment selectPaymentById(@Param("id") Integer id);
}
