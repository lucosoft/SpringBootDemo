package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fazecast.jSerialComm.SerialPort;

@RestController
public class ComportController {
		
    @CrossOrigin(origins = "http://localhost:8000")
    @GetMapping("/getComPort")
	public @ResponseBody List<Comport> getComPort() {
		List<Comport> list = new ArrayList<>();
		SerialPort[] portNames = SerialPort.getCommPorts();
		for (int i = 0; i < portNames.length; i++) {
			list.add(new Comport(portNames[i].getSystemPortName()));
		}
        return list;
    }

    public class Comport {

        private String comPort;

        public Comport() {
            this.comPort = "";
        }

        public Comport(String comPort) {
            this.comPort = comPort;
        }

        public String getComport() {
            return comPort;
        }

        public void setComport(String comPort) {
        	this.comPort = comPort;
        }
    }

}
