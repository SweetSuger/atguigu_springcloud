package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @author yinhao
 * @date 2021/1/20 18:42
 */
public interface PaymentService {

    int insertPayment(Payment payment);

    Payment selectPaymentById(Integer id);
}
