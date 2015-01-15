package com.aj.iyou.entity.enums;

public enum Continent {
	AFRICA(1),ANTARCTICA(2),ASIA(3),AUSTRALIA(4),EUROP(5), NORTHAMERICA(6),SOUTHAMERICA(7);
	
	private int continent;
	
	private Continent(int continent){
		this.continent = continent;
	}
	
	/**
	 * Get {@link Continent} value
	 * @return value of {@link Continent}
	 */
	public int getContinent(){
		return continent;
	}
}
