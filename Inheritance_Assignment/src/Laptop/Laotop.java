package Laptop;

public class Laotop {

//	Create Class Laptop which has variables noOfUSBPort, processorSpeed of
//	type int. Create getter, setter methods for the variables. In main method,
//	1> create Laptop object 2> set values of variables noOfUSBPort,
//	processorSpeed using setter methods. 3> print variables noOfUSBPort,
//	processorSpeed using getter methods.

	private int noofusBPort;
	private int processorSpeed;

	public int getNoofusBPort() {
		return noofusBPort;
	}

	public void setNoofusBPort(int noofusBPort) {
		this.noofusBPort = noofusBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

}
