package com.jiyun.eb_demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * @ClassNameqianmaiPay
 * @Description
 * @Author lijing
 * @Date2018/11/27 21:52
 * @Version V1.0
 **/


public class qianmaiPay {
    //商户请求
    String requestNo="";
    //商户编号
    String merchanNo="";
    //商户用户标识
    String merchantUserId="";
    //订单金额
    String orderAmount="";
    //需支付金额
    String fundAmount="";
    //上午下单时间DateTime类型
    String merchantOrderDate="";
    //后台服务器通知地址
    String serverCallbackUrl="";
    //前端页面通知地址
    String webCallbackUrl="";
    //行业类别码
    String mcc="";
    //产品类别码
    String productCatalog="";
    //商品名称
    String productName="";
    //payTool



    //返回参数
    //请求成功

    public void pay(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

    }

}
