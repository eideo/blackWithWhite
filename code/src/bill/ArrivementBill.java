package bill;

import java.util.ArrayList;

public class ArrivementBill {
	class struct{
		String id;
		State st;
		struct(String s,State t){
			id=s;
			st=t;
		}
	}
	public String ID;//���ݵ�ID
	String[] date;
	String placeOfDeparture;
	ArrayList<struct> bill=new  ArrayList<struct>();
	
	public ArrivementBill(){}

}
