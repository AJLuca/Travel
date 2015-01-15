package com.aj.iyou.entity;

import com.aj.iyou.entity.enums.Continent;

public class Country {
	private int id;
	private String name;
	private Continent continent;
	
	/**
	 * Get {@link Country} id
	 * @return {@link Country} id
	 */
	public int getID(){
		return id;
	}
	
	/**
	 * Set {@link Country} id
	 * @param id of {@link Country}
	 */
	public void setID(int id){
		this.id = id;
	}
	
	/**
	 * Get {@link Country} name
	 * @return name of {@link Country}
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Set {@link Country} name
	 * @param name of {@link Country}
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Get {@link Continent} which {@link Country} belongs to
	 * @return {@link Continent}
	 */
	public Continent getContinent(){
		return continent;
	}
	
	/**
	 * Set {@link Country}'s {@link Continent}
	 * @param continent
	 */
	public void setContinent(Continent continent){
		this.continent = continent;
	}
}
