package xg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xg.dao")
public class Bookorder8010 {
    public static void main(String[] args) {
        SpringApplication.run(Bookorder8010.class,args);
    }
}
