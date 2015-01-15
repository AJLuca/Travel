package com.aj.iyou.entity.enums;

public enum Transport {
	CAR(1),FLIGHT(2),SHIP(3),TRAIN(4);
	
	private int type;
	
	private Transport(int type){
		this.type = type;
	}
	
	public int getTransport(){
		return type;
	}
}
