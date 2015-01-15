package com.aj.iyou.entity;

public class Attraction extends Point{
	private long id;
	private int city;
	private String name;
	private String pic;
	private String url;
	private String description;
	private double cost;
	private float open;
	private float close;
	
	/**
	 * Get {@link Attraction} GUID
	 * @return
	 */
	public long getGUID(){
		return id;
	}
	
	/**
	 * Set {@link Attraction} GUID
	 * @param guid
	 */
	public void setGUID(long id){
		this.id = id;
	}
	
	/**
	 * Get {@link City} which {@link Attraction} locate at
	 * @return {@link City} id
	 */
	public int getCity(){
		return city;
	}
	
	/**
	 * Set {@link City} where {@link Attraction} locate at
	 * @param city
	 */
	public void setCity(int city){
		this.city =city;
	}
	
	/**
	 * Get {@link Attraction} name
	 * @return {@link Attraction} name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Set {@link Attraction} name
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Get time cost, which means average time spend on {@link Attraction}
	 * @return time cost
	 */
	public double getCost(){
		return cost;
	}
	
	/**
	 * Set time cost, which means average time spend on {@link Attraction}
	 * @param cost
	 */
	public void setCost(double cost){
		this.cost = cost;
	}
	
	/**
	 * Get {@link Attraction} open time,
	 * while return value equals -1, it means this {@link Attraction} open for 24 hours/day, 7 days/week
	 * it employ 24-hour system
	 * @return open time
	 */
	public float getOpenTime(){
		return open;
	}
	
	/**
	 * Set {@link Attraction} open time
	 * while {@link Attraction} open for 24hours/day, 7 days/week, set this value as -1
	 * it employ 24-hour system
	 * @param open time
	 */
	public void setOpenTime(float open){
		this.open = open;
	}
	
	/**
	 * Get {@link Attraction} close time
	 * while return value equals -1, it means this {@link Attraction} open for 24 hours/day, 7 days/week
	 * it employ 24-hour system
	 * @return close time
	 */
	public float getCloseTime(){
		return close;
	}
	
	/**
	 * Set {@link Attraction} close time
	 * while {@link Attraction} open for 24 hours/day, 7 days/week, set this value as -1
	 * it employ 24-hour system
	 * @param close
	 */
	public void setCloseTime(float close){
		this.close = close;
	}
	
	public boolean isOpeningNight(){
		//To do ...
		return true;
	}
}
