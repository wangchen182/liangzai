package com.yiwei.liangzai.springbootdubboserver;


import com.yiwei.liangzai.springbootdubboserver.utils.CodeGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {
    @Test
    public void contextLoads() {
        CodeGenerator gse = new CodeGenerator();
        //要给那些表生成 玛德多个表不好使啊 tb_permission,tb_role,tb_role_permission,tb_user,tb_user_role
       gse.generateByTables(true,"tb_user_role");
    }
}