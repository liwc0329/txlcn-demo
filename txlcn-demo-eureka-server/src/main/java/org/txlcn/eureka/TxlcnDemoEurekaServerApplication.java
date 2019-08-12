package org.txlcn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lwc
 */
@EnableEurekaServer
@SpringBootApplication
@EnableDiscoveryClient
public class TxlcnDemoEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxlcnDemoEurekaServerApplication.class, args);
    }

}
