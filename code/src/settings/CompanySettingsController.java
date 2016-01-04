package settings;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.util.ArrayList;

import data.staff.AgencyInfo;

public class CompanySettingsController {
	
	public Company ourCompany;
	

	public CompanySettingsController(Company company){
		ourCompany=company;
	}
	
	public CompanySettingsController(){
		pull();
	}
	
	public String[] getCityName(){
		int size=ourCompany.citys.size();
		String[] names=new String[size];
		for(int i=0;i<size;i++){
			names[i]=ourCompany.citys.get(i).name;
		}
		return names;
	}
	public TransportCenter[] getTransportCenters(String city){
		ArrayList<City> citys=ourCompany.citys;
		ArrayList<TransportCenter> transportCenters = null;
		TransportCenter[] t;
		for(int i=0;i<citys.size();i++){		
			if(citys.get(i).name.equals(city)){
				transportCenters=citys.get(i).transportCenter;
				break;
			}
		}
		t=new TransportCenter[transportCenters.size()];
		for(int j=0;j<transportCenters.size();j++){
			t[j]=transportCenters.get(j);
		}
		return t ;	
	}
	public BussinessHall[] getBussinessHalls(String city){

		return ourCompany.getBussinessHalls(city);	
	}
	/**
	 * ���������Ĺ�˾����ͬ��������
	 * @return
	 */
	public boolean pull(){
		AgencyInfo agencyInfo=new AgencyInfo();
		try {
			ourCompany=agencyInfo.pull();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	/**
	 * �����صĹ�˾����ͬ����������
	 * @return
	 */
	public boolean push(){		
		AgencyInfo agencyInfo=new AgencyInfo();
		try {
			return agencyInfo.push(ourCompany);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;	
		}	
	}
	
	public boolean addCity(City city,ArrayList<Integer> distances){
		ourCompany.addCity(city, distances);
		boolean result=push();
		return result;
	}
	
	public boolean deleteCity(String city){
		ArrayList<City> citys=ourCompany.citys;
		City cityToDelete=null;
		for(int i=0;i<citys.size();i++){
			if(citys.get(i).name.equals(city)){
				cityToDelete=citys.get(i);
				break;
			}
		}
		ourCompany.deleteCity(cityToDelete);
		boolean result=push();
		return result;
	}
	public boolean deleteCity(City city){
		ourCompany.deleteCity(city);
		boolean result=push();
		return result;
	}
	public boolean deleteTrans(String city,String trans){
		ArrayList<City> citys=ourCompany.citys;
		City cityToDelete=null;
		for(int i=0;i<citys.size();i++){
			if(citys.get(i).name.equals(city)){
				cityToDelete=citys.get(i);
				break;
			}
		}
		ArrayList<TransportCenter> t=cityToDelete.transportCenter;
		int n=0;
		for(int i=0;i<t.size();i++){
			if(t.get(i).getName().equals(trans)){
				n=i;
				break;
			}
		}
		t.remove(n);
		boolean result=push();
		return result;
		
	}
	public boolean deleteBussiness(String city,String trans,String hall){
		ArrayList<City> citys=ourCompany.citys;
		City cityToDelete=null;
		for(int i=0;i<citys.size();i++){
			if(citys.get(i).name.equals(city)){
				cityToDelete=citys.get(i);
				break;
			}
		}
		ArrayList<TransportCenter> t=cityToDelete.transportCenter;
		int n=0;
		for(int i=0;i<t.size();i++){
			if(t.get(i).getName().equals(trans)){
				n=i;
				break;
			}
		}
		TransportCenter tr=t.get(n);
		ArrayList<BussinessHall> b=tr.getBussinessHall();
		int n2=0;
		for(int i=0;i<b.size();i++){
			if(b.get(i).name.equals(hall)){
				n2=i;
				break;
			}
		}
		b.remove(n2);
		boolean result=push();
		
		return result;
		
	}
	public  boolean saveInThisComputer(){
		//���´���ʵ�����л�
	        try{
	            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CompanySettings.out"));//�����������ļ���Ϊ my.out ��ObjectOutputStream�ܰ�Object�����Byte��
	            oos.writeObject(ourCompany); 
	            oos.flush();  //������ 
	            oos.close(); //�ر���
	            System.out.println("wancheng");
	            return true;
	        } catch (FileNotFoundException e){        
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			return false;
	}
	 
	public  boolean loadFromThisComputer(){    
	         ObjectInputStream oin = null;//�ֲ���������Ҫ��ʼ��
	        try{
	            oin = new ObjectInputStream(new FileInputStream("CompanySettings.out"));
	        } catch (FileNotFoundException e1){        
	            e1.printStackTrace();
	            return false;
	        } catch (IOException e1){
	            e1.printStackTrace();
	            return false;
	        }      
	        try {
	        	ourCompany= (Company) oin.readObject();//��Object��������ת��ΪMyTest����
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            return false;
	        } catch (IOException e) {
	            e.printStackTrace();
	            return false;
	        } 
	        return true;
	}
	
	public String DeapartmentSearch(String name){
		int citySize=ourCompany.citys.size();
		for(int i=0;i<citySize;i++){
			City city=ourCompany.citys.get(i);
			
			for(int k=0;k<city.transportCenter.size();k++){
				TransportCenter transportCenter=city.transportCenter.get(0);
				if(name==transportCenter.getName())
					return transportCenter.getID();
				
				for(int j=0;j<transportCenter.getBussinessHall().size();j++){
					BussinessHall bussinessHall=transportCenter.getBussinessHall().get(i);
					if(name==bussinessHall.name)
						return bussinessHall.ID;
				}
			}
		}
		return "fail";
	}
}
