package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.Payment1Dao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yinhao
 * @date 2021/1/20 18:42
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private Payment1Dao paymentDao;

    @Override
    public int insertPayment(Payment payment) {
        return paymentDao.insertPayment(payment);
    }

    @Override
    public Payment selectPaymentById(Integer id) {
        return paymentDao.selectPaymentById(id);
    }
}
