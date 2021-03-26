package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yinhao
 * @date 2021/3/24 16:51
 */
@Slf4j
@RestController
public class PaymentFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/paymentfeign/get/{id}")
    public CommonResult<Payment> getPaymentFeign(@PathVariable("id") Integer id){
        return paymentFeignService.selectPaymentById(id);
    }
}
