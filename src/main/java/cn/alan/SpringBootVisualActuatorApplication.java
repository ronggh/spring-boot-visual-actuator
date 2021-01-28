package cn.alan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SpringBootVisualActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootVisualActuatorApplication.class, args);
    }
}
