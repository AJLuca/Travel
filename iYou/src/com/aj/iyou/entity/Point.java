package com.aj.iyou.entity;

/**
 * Father class of all point related class
 * @author AJLuca
 *
 */
public class Point{
	private long id;
	private double latitude;
	private double longitude;
	
	/**
	 * Get {@link Point} id
	 * @return id
	 */
	public long getID(){
		return id;
	}
	
	/**
	 * Set {@link Point} id
	 * @param id
	 */
	public void setID(long id){
		this.id = id;
	}
	
	/**
	 * Get latitude of {@link Point}
	 * @return latitude
	 */
	public double getLatitude(){
		return latitude;
	}
	
	/**
	 * Set latitude of {@link Point}
	 * @param latitude
	 */
	public void setLatitude(double latitude){
		this.latitude = latitude;
	}
	
	/**
	 * Get longitude of {@link Point}
	 * @return longitude
	 */
	public double getLongitude(){
		return longitude;
	}
	
	/**
	 * Set longitude of {@link Point}
	 * @param longitude
	 */
	public void setLongitude(double longitude){
		this.longitude = longitude;
	}
	
	/**
	 * Compares this object to the specified object.  The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is an {@code Point} object that
     * contains the same {@code latitude} value and {@code longitude} value as this object.
	 * @param obj   the object to compare with.
	 * @return {@code true} if the objects are the same;
     *         {@code false} otherwise.
	 */
	public boolean equals(Object obj){
		return (this.latitude==((Point)obj).getLatitude()&&this.longitude==((Point)obj).getLongitude());
	}
}
