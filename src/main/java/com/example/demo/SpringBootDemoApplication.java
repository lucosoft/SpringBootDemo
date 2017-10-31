package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootDemoApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Puto el que lee!";
    }

 
	@RequestMapping(value = "/app/{comPort}")
	public void findComPort(@PathVariable("comPort") String comPort) {
//		SensorGraph.getCommPorts();
		SensorGraph.findComPortImpl(comPort);	// se testea por ejemplo con http://localhost:8080/app/COM5
//		System.out.println(comPort);
		
	}    
    
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
