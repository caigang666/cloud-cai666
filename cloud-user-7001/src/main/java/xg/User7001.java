package xg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xg.dao")
public class User7001 {
    public static void main(String[] args) {
        SpringApplication.run(User7001.class,args);
    }
}
