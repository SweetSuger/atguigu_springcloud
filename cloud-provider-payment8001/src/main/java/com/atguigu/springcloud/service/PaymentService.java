package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yh on 2020/12/29.
 */
public interface PaymentService {

    int insertPayment(Payment payment);

    Payment selectPaymentById(Integer id);

}
