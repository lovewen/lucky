package org.wen.business;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.wen.Application;

@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ComponentScan(basePackages = { "org.wen.*" })
public class BusinessTest {
    @Autowired
    private Business business = new Business();

    @Test
    public void execute() throws Exception {
        System.out.println("开始");
        business.execute();
        System.out.println("结束");

    }
}