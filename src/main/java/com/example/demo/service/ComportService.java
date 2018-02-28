/**
 * 
 */
/**
 * @author Lucas Guerrero
 *
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Comport;
import com.fazecast.jSerialComm.SerialPort;

public interface ComportService {

	List<Comport> getComPort();
	boolean openComPort(String portNumber);
	boolean closeComPort(String portNumber);
}