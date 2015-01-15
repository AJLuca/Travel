package com.aj.iyou.bll.cluster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.aj.iyou.entity.Point;

public class PointCluster {
	
	public Map<Point,ArrayList<Point>> KMediod(ArrayList<Point> pointList, int k){
		ArrayList<Point> mediods = findSplitPoint(pointList, k);//Initial mediods
		
		mediods = GetMediods(pointList,mediods);
		
		return assignPoint(pointList,mediods);
	}
	
	
	private ArrayList<Point> GetMediods(ArrayList<Point> pointList,ArrayList<Point> mediods){
		ArrayList<Point> result = mediods;
		boolean changed = true;
		
		while(changed){
			Map<Point,ArrayList<Point>> clusters = assignPoint(pointList,result);
			ArrayList<Point> newmediods = new ArrayList<Point>();
			changed = false;
			for(Point m : result){
				Point newmediod = getMediod(clusters.get(m));
				newmediods.add(newmediod);
				if(!m.equals(newmediod))
					changed = true;
			}
			result = newmediods;
		}
		
		return result;
	}
	
	private ArrayList<Point> findSplitPoint(ArrayList<Point> pointList, int k){
		ArrayList<Point> initialPoints = new ArrayList<Point>();
		Point minimum = null;
		Point maximum = null;
		
		//find the minimum and maximum value of latitude and longtitude
		for(Point p : pointList){
			if(minimum==null){
				minimum = new Point();
				minimum.setLatitude(p.getLatitude());
				minimum.setLongitude(p.getLongitude());
			}
			if(maximum==null){
				maximum = new Point();
				maximum.setLatitude(p.getLatitude());
				maximum.setLongitude(p.getLongitude());
			}
			
			if(minimum.getLatitude()>p.getLatitude())
				minimum.setLatitude(p.getLatitude());
			if(minimum.getLongitude()>p.getLongitude())
				minimum.setLongitude(p.getLongitude());
			if(maximum.getLatitude()<p.getLatitude())
				maximum.setLatitude(p.getLatitude());
			if(maximum.getLongitude()<p.getLongitude())
				maximum.setLongitude(p.getLongitude());
		}
		
		//find nearest points of split points which means
		//to be define
		for(int i=1;i<=k;i++){
			Point point = new Point();
			int denominator = k+1;
			point.setLatitude(((maximum.getLatitude()-minimum.getLatitude())*i/denominator)+minimum.getLatitude());
			point.setLongitude(((maximum.getLongitude()-minimum.getLongitude())*i/denominator)+minimum.getLongitude());
			point = findNearestNeigbor(point,pointList);
			initialPoints.add(point);
		}
		
		
		return initialPoints;
	}
	
	private Map<Point,ArrayList<Point>> assignPoint(ArrayList<Point> pointList,ArrayList<Point> mediods){
		Map<Point,ArrayList<Point>> result = new HashMap();
		
		for(Point p : pointList){
			Point mediod = findNearestNeigbor(p,mediods);
			if(!result.containsKey(mediod))
				result.put(mediod, new ArrayList<Point>());
			
			ArrayList<Point> mlst = result.get(mediod);
			mlst.add(p);
			result.replace(mediod, mlst);
		}
		
		return result;
	}
	
	private Point getMediod(ArrayList<Point> pointList){
		ArrayList<Point> splits = findSplitPoint(pointList,1);
		return splits.get(0);
	}
	
	private Point findNearestNeigbor(Point point, ArrayList<Point> pointList){
		Point result = new Point();
		double distance = -1;
		
		for(Point p : pointList){
			double pdistance = Math.pow((p.getLatitude()-point.getLatitude()), 2)+Math.pow((p.getLongitude()-point.getLongitude()), 2);
			if(distance==-1||pdistance<distance){
				distance=pdistance;
				result = p;
			}
		}
		
		return result;
	}
	
}
