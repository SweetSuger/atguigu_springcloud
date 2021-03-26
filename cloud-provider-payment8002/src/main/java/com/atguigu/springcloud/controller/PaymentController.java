package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yinhao
 * @date 2021/1/20 18:41
 */
@Slf4j
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult insertPayment(@RequestBody Payment payment){
        int result = paymentService.insertPayment(payment);
        log.info("=============插入结果====="+result);
        if(result > 0){
            return new CommonResult(200,"插入数据库成功！serverPort"+serverPort,result);
        }else{
            return new CommonResult(201,"插入数据库失败！",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult selectPaymentById(@PathVariable("id") Integer id){
        Payment payment = paymentService.selectPaymentById(id);
        log.info("==========查询结果========="+payment);
        if(payment != null){
            return new CommonResult(200,"查询成功！serverPort"+serverPort,payment);
        }else{
            return new CommonResult(201,"没有记录！",null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        for (String s : list) {
            log.info("**********discovery.element:" + s);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getInstanceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;
    }

    /**
     * 手写负载均衡服务端接口
     * @return
     */
    @GetMapping("/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

}
