package xg.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 86176
 */
@RestController
public class ConfigClientController {

        @Value("${spring.application.name}")
        private  String applicationName;
        @Value("${server.port}")
        private String port;

        @RequestMapping("/config")
        public String getConfig(){
            String str = "application: " + applicationName +  "\t port: " + port;
            System.out.println("********str: " + str);
            return str;
        }
}
