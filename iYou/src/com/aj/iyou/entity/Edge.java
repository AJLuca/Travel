package com.aj.iyou.entity;


public class Edge {
	private String id;
	private Point from;
	private Point to;
	private double cost;
	private double distance;
	
	/**
	 * Get {@link Edge} id
	 * @return id of {@link Edge}
	 */
	public String getID(){
		return id;
	}
	
	/**
	 * Set {@link Edge} id
	 * @param id of {@link Edge}
	 */
	public void setID(String id){
		this.id = id;
	}
	
	/**
	 * Get Stating {@link City}
	 * @return Stating {@link City} id
	 */
	public Point getFromCity(){
		return from;
	}
	
	/**
	 * Set Stating {@link City}
	 * @param from stating {@link City}
	 */
	public void setFromCity(Point from){
		this.from = from;
	}
	
	public Point getToCity(){
		return to;
	}
	
	/**
	 * Set end {@link City}
	 * @param to end {@link City}
	 */
	public void setToCity(Point to){
		this.to = to;
	}
	
	/**
	 * Get time cost of {@link Edge}
	 * @return time cost
	 */
	public double getTimeCost(){
		return cost;
	}
	
	/**
	 * Set time cost of {@link Edge}
	 * @param cost of time
	 */
	public void setTimeCost(double cost){
		this.cost = cost;
	}
	
	/**
	 * Get distance between two {@link City}
	 * @return distance of {@link Edge}
	 */
	public double getDistance(){
		return distance;
	}
	
	/**
	 * Set distance of {@link Edge}
	 * @param distance
	 */
	public void setDistance(double distance){
		this.distance = distance;
	}
}
