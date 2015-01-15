package com.aj.iyou.bll;

import java.util.ArrayList;
import java.util.Map;

import com.aj.iyou.bll.cluster.PointCluster;
import com.aj.iyou.entity.Attraction;
import com.aj.iyou.entity.City;
import com.aj.iyou.entity.Point;

public class Directions {
	
	public ArrayList<Attraction> getSubRoute(City city, ArrayList<Attraction> attractionList){
		double nightTime = 0;//initiate total time cost spend at night
		double dayTime = 0;//initial total time cost spend at daytime
		ArrayList<Point> nal = new ArrayList<Point>();//night attraction list
		ArrayList<Point> dal = new ArrayList<Point>();//daytime attraction list
		//Dividing attractions into two groups
		//Daytime and night
		for(Attraction a : attractionList){
			if(!a.isOpeningNight()){
				dayTime += a.getCost();
				dal.add((Point)a);
			}
			else{
				nightTime += a.getCost();
				nal.add((Point)a);
			}
		}
		
		int days = getDays(dayTime);
		int nights = getNights(nightTime);
		
		Map<Point,ArrayList<Point>> daysClusters = new PointCluster().KMediod(dal, days);
		Map<Point,ArrayList<Point>> nightsClusters = new PointCluster().KMediod(nal, nights);
		
		for(int i=0;i<daysClusters.size();i++){
			
		}
		
		return null;
	}
	
	private int getDays(double cost){
		double days = cost/8;
		String strDays = String.valueOf(days);
		String[] values = strDays.split(".");
		int result = Integer.parseInt(values[0]);
		while(values.length>2){
			result += 1;
		}
		return result;
	}
	
	private int getNights(double cost){
		double nights = cost/8;
		String strNights = String.valueOf(nights);
		String[] values = strNights.split(".");
		int result = Integer.parseInt(values[0]);
		while(values.length>2){
			result += 1;
		}
		return result;
	}
}
