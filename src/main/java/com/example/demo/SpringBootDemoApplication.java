package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fazecast.jSerialComm.SerialPort;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootDemoApplication {

	@RequestMapping("/")
	@ResponseBody
	String home1() {
		return "Puto el que lee!";
	}

	@RequestMapping(value = "getComPorts", method = RequestMethod.GET)
	public @ResponseBody List<ComPorts> getComPorts() {
		List<ComPorts> list = new ArrayList<>();
		SerialPort[] portNames = SerialPort.getCommPorts();
		for (int i = 0; i < portNames.length; i++)
			list.add(new ComPorts(portNames[i].getSystemPortName()));
		return list;
	}

	public class ComPorts {
		private String comPort;

		public ComPorts(String comPort) {
			this.comPort = comPort;
		}

		public String getComPort() {
			return comPort;
		}

		public void setComport(String comPort) {
			this.comPort = comPort;
		}
	}

	@RequestMapping(value = "/app/getComPort", method = RequestMethod.GET)
	public void getComPort() {
		SensorGraph.getCommPorts();

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
