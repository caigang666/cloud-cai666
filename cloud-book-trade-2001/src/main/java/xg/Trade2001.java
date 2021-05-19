package xg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 86176
 */
@SpringBootApplication
@MapperScan("xg.dao")
public class Trade2001 {
    public static void main(String[] args) {
        SpringApplication.run(Trade2001.class,args);
    }
}

