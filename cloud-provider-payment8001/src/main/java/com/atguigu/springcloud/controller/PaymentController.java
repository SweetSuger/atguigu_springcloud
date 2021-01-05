package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yh on 2020/12/29.
 */
@Slf4j
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult insertPayment(@RequestBody Payment payment){
        int result = paymentService.insertPayment(payment);
        log.info("=============插入结果====="+result);
        if(result > 0){
            return new CommonResult(200,"插入数据库成功！",result);
        }else{
            return new CommonResult(201,"插入数据库失败！",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult selectPaymentById(@PathVariable("id") Integer id){
        Payment payment = paymentService.selectPaymentById(id);
        log.info("==========查询结果========="+payment);
        if(payment != null){
            return new CommonResult(200,"查询成功！",payment);
        }else{
            return new CommonResult(201,"没有记录！",null);
        }
    }
}
