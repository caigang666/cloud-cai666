package xg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 86176
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients(basePackages = "xg.orderService")
public class Order9001 {
        public static void main(String[] args) {
            SpringApplication.run(Order9001.class,args);
        }
}
