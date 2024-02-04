package com.impl;

public class Main {

	public static void main(String[] args) {
		LoadBalancer lb = new LoadBalancer();
		for(int i = 0;i<100;i++) {
			Request r = new Request();
			r.name = "request_"+i;
			r.id = i;
			
			String serverName = lb.getNextServer(r);
			
			System.out.println(r.name + " is routed to server_"+ serverName);
			
			
			
			
		}
		
	}

}
