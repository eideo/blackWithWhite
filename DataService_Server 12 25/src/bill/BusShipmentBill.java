package bill;

import java.io.Serializable;
import java.util.ArrayList;

public class BusShipmentBill implements Serializable{
	String[] date;//����
	public String busshipID;//���˱��
	public boolean judged;
	String destination;
	String busID;//�������
	String Observer;//��װԱ
	String guard;//Ѻ��Ա
	public ArrayList<String> idCollection=new ArrayList<String>();
	double money;
	
	public BusShipmentBill(){}
	public BusShipmentBill(String[] time,String busshipID,String destination,String busID
			,String Observer,String guard,double money){
		this.date=time;
		this.busshipID=busshipID;
		this.destination=destination;
		this.busID=busID;
		this.Observer=Observer;
		this.guard=guard;
		this.money=money;
	}
}
