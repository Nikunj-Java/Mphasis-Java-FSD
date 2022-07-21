package com.simplilearn.synchronization;

public class Sender {
	
	void send(String msg) {
		System.out.println("Sending msg...:"+msg);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error while sending: "+e);
		}
		
		System.out.println("Message Sent Successfully");
	}

}
