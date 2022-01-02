package org.wen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author loveweni
 * @organization coder
 * @create 2022-01-02 21:01
 * @description Application启动类
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        System.out.println("lucky is run ❤");
    }
}
