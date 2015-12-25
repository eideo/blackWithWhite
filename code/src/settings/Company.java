package settings;

import java.io.Serializable;
import java.util.ArrayList;

public class Company implements Serializable {
	public ArrayList<City> citys;
	public ArrayList<Distance> distance;
	
	/**
	 * �÷������õ��ã�
	 */
	public Company(){
		citys=new ArrayList<City>();
		distance=new ArrayList<Distance>();
	}
	public int getDistance(City city1,City city2){
		Distance findDistance;
		for(int i=0;i<distance.size();i++){
			findDistance=distance.get(i);
			if(findDistance.getCity1().equals(city1)&&findDistance.getCity2().equals(city2))
				return findDistance.getDistance();
			if(findDistance.getCity1().equals(city2)&&findDistance.getCity2().equals(city1))
				return findDistance.getDistance();
		}
		return 0;
	}	
	
	public int getDistance(String city1,String city2){
		Distance findDistance;
		for(int i=0;i<distance.size();i++){
			findDistance=distance.get(i);
			if(findDistance.getCity1().name.equals(city1)&&findDistance.getCity2().name.equals(city2))
				return findDistance.getDistance();
			if(findDistance.getCity1().name.equals(city2)&&findDistance.getCity2().name.equals(city1))
				return findDistance.getDistance();
		}
		return 0;
	}	
	public void addCity(City city,ArrayList<Integer> distances){
		Distance thisdistance;
		for(int i=0;i<citys.size();i++){
			thisdistance=new Distance(city,citys.get(i),distances.get(i));
			distance.add(thisdistance);
		}
		citys.add(city);
	}
	public void deleteCity(City city){
		Distance findDistance;
		ArrayList<Distance> distanceToDelete=new ArrayList<Distance>();
		for(int i=0;i<distance.size();i++){
			findDistance=distance.get(i);
			if(findDistance.getCity1().equals(city)||findDistance.getCity2().equals(city))
				distanceToDelete.add(findDistance);
		}
		while(!distanceToDelete.isEmpty()){
			Distance dis=distanceToDelete.get(0);
			distance.remove(dis);
			distanceToDelete.remove(dis);
		}
		citys.remove(city);
	}
	

}
