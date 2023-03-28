package Laptop;

public class LaptopMain {

	public static void main(String[] args) {

		Laotop l1=new Laotop();
		l1.setNoofusBPort(4);
		l1.setProcessorSpeed(100);
		
		System.out.println("No of Usb port=>"+l1.getNoofusBPort());
		System.out.println("processor speed=>"+l1.getProcessorSpeed());
		
	}
}
