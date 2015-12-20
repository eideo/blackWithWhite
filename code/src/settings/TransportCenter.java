package settings;

import java.io.Serializable;
import java.util.ArrayList;

public class TransportCenter implements Serializable{
	private String name;//��ת��������
	private String ID;//��ת���ı��
	private ArrayList<BussinessHall> bussinessHall;//��ϽӪҵ��
	
	public TransportCenter(String name,String ID){
		this.name=name;
		this.ID=ID;
		bussinessHall=new ArrayList<BussinessHall>();
	}
	
	public String getID(){
		return ID;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean addBussinessHall(){
		
		return false;
	}
	
	public boolean deleteBussinessHall(){
		
		return false;
		
	}
	
	public ArrayList<BussinessHall> getBussinessHall(){
		return bussinessHall;
	}
	/**
	 * ����������ϵͳ��ʼ�����á��κ��˲��õ��á�
	 * @param names ����
	 * @return
	 */
	public void addBussinessHall(String[] names){
		
		for(int i=0;i<names.length;i++){
			if(i<10){
				this.bussinessHall.add(new BussinessHall(names[i],this.ID+"0"+i));
			}else{
				this.bussinessHall.add(new BussinessHall(names[i],this.ID+i));
			}
		}
		
	}
}
