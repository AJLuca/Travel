package com.aj.iyou.entity;

public class State {
	private int id;
	private String name;
	private int country;
	
	/**
	 * Get {@link State} id
	 * @return id of {@link State}
	 */
	public int getID(){
		return id;
	}
	
	/**
	 * Set {@link State} id
	 * @param id state id
	 */
	public void setID(int id){
		this.id = id;
	}
	
	/**
	 * Get {@link State} name
	 * @return name of {@link State}
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Set {@link State} name
	 * @param name of {@link State}
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Get country id which {@link State} belongs to
	 * @return country id
	 */
	public int getCountry(){
		return country;
	}
	
	/**
	 * Set {@link State} country id
	 * @param country id
	 */
	public void setCountry(int country){
		this.country = country;
	}
}
