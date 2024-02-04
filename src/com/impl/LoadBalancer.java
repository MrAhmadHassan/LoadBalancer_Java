package com.impl;

public class LoadBalancer implements HashAble {
	Request request;
	int currentIndex;
	String list[] = {"S1","S2","S3"};
	
	public LoadBalancer() {
	}
	
	public String getNextServer(Request request) {
		
			return list[hash(request)];	
	}

	@Override
	public int hash(Request request) {
		int hashed = request.id%list.length;
			
		return hashed;
	}
}
