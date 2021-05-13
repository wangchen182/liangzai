package com.yiwei.liangzai.springbootdubboserver;


import com.yiwei.liangzai.springbootdubboserver.utils.CodeGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {
    @Test
    public void contextLoads() {
        CodeGenerator gse = new CodeGenerator();
        //要给那些表生成
       gse.generateByTables(true,"user");
    }
}