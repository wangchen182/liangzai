package com.yiwei.liangzai.springbootdubboserver.dao.controller;

import org.apache.activemq.filter.FunctionCallExpression;

public class Test {
    public static void main(String[] args)  {
        try {
            aaa();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e+"2222");
        }
    }
    public static void aaa() throws FunctionCallExpression.invalidFunctionExpressionException {


        try {
            throw new FunctionCallExpression.invalidFunctionExpressionException("bbb");
        } catch (FunctionCallExpression.invalidFunctionExpressionException e) {
            e.printStackTrace();
        }


        System.out.println("333");



    }
}
