package xg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 86176
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApp6001 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApp6001.class,args);
    }
}
