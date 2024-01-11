package com.Inheritance;
//4. Create Class Laptop which has variables noOfUSBPort, processorSpeed of 
//type int. Create getter, setter methods for the variables. In main method, 
//1> create Laptop object 2> set values of variables noOfUSBPort, 
//processorSpeed using setter methods. 3> print variables noOfUSBPort, 
//processorSpeed using getter methods.
public class Laptop {
	int noOfUSBPort;
	int processorSpeed;
	
	Laptop(){
		noOfUSBPort=0;
		processorSpeed=0;
	}
	Laptop(int noOfUSBPort, int processorSpeed){
		this.noOfUSBPort=noOfUSBPort;
		this.processorSpeed=processorSpeed;
	}
	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	public String toString() {
		return " noOfUSBPort " + noOfUSBPort  + " processorSpeed " + processorSpeed;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop(12,234);
		System.out.println(l1);
	}

}
