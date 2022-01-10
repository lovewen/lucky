package org.wen.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.wen.business.Business;

/**
 * @author loveweni
 * @company: 顼龙科技
 * @date 2022/01/10 17:56:01
 * @description: description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

    @Autowired
    private Business business;

    @Test
    public void test() throws Exception {
        System.out.println("111");
        business.execute();
        System.out.println("222");
    }

}
