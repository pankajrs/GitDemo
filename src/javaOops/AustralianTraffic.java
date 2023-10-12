package javaOops;

import coreJava.CentralTraffic;

public class AustralianTraffic implements CentralTraffic {

	public static void main(String[] args) {
		
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.greenGo();
		a.FlashYellow();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("grrenGo implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementation");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("FlashYellow implementation");
	}

}
