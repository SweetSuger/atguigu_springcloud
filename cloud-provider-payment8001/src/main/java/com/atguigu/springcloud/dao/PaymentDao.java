package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yh on 2020/12/28.
 */
@Mapper
public interface PaymentDao {

    int insertPayment(Payment payment);

    Payment selectPaymentById(@Param("id") Integer id);
}
