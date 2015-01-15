package com.aj.iyou.entity;

public class City extends Point{
	
	private long id;
	private String name;
	private int country;
	private int state;
	private String code;
	private float altitude;
	
	/**
	 * Get {@link City}'s id
	 * @return id of {@link City}
	 */
	public long getID(){
		return id;
	}
	
	/**
	 * Set {@link City}'s id
	 * @param id {@link City}'s id
	 */
	public void setID(long id){
		this.id = id;
	}
	
	/**
	 * Get {@link City}'s name
	 * @return name of {@link City}
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Set {@link City}'s name
	 * @param name {@link City}'s name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Get country id which {@link City}'s belongs to
	 * @return 
	 */
	public int getCountry(){
		return country;
	}
	
	/**
	 * Set {@link City}'s country
	 * @param country
	 */
	public void setCountry(int country){
		this.country = country;
	}
	
	/**
	 * Get state id which {@link City} belongs to
	 * @return
	 */
	public int getState(){
		return state;
	}
	
	/**
	 * Set {@link City}'s state
	 * @param state id of state
	 */
	public void setState(int state){
		this.state = state;
	}
	
	/**
	 * Get {@link City}'s zip code
	 * @return zip code
	 */
	public String getZipCode(){
		return code;
	}
	
	/**
	 * Set {@link City}'s zip code
	 * @param code zip code
	 */
	public void setZipCode(String code){
		this.code = code;
	}
	
	/**
	 * Get average altitude of {@link City}
	 * @return altitude of {@link City}
	 */
	public float getAltitude(){
		return altitude;
	}
	
	/**
	 * Set {@link City} altitude
	 * @param altitude of {@link City}
	 */
	public void setAltitude(float altitude){
		this.altitude = altitude;
	}
	
}
