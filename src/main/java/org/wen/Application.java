package org.wen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author loveweni
 * @organization coder
 * @create 2022-01-02 21:01
 * @description Application启动类
 */
@SpringBootApplication
@ComponentScan(basePackages = { "org.wen.*" })
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        System.out.println("lucky is run ❤");
    }
}
