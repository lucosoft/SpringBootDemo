package com.example.demo;

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
