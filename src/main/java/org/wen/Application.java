package org.wen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wen.business.Business;

/**
 * @author loveweni
 * @organization coder
 * @create 2022-01-02 21:01
 * @description Application启动类
 */
@SpringBootApplication
@MapperScan(basePackages = "org.wen.data.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        System.out.println("lucky is run ❤");
        System.out.println("执行方法进入此url即可: http://127.0.0.1:3001/execute");
    }

    @Autowired
    private Business business;

    @RestController
    class hello{
        /**
         * 启动方法，访问即可启动此功能
         * @return
         * @throws Exception
         */
        @RequestMapping("/execute")
        public String execute() throws Exception {
            return business.execute();
        }

    }
}
