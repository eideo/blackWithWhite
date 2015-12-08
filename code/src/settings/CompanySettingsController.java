package settings;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;

import data.staff.AgencyInfo;

public class CompanySettingsController {
	static Company ourCompany;
	
	/**
	 * ���������Ĺ�˾����ͬ��������
	 * @return
	 */
	public static boolean pull(){
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
	public static boolean push(){		
		AgencyInfo agencyInfo=new AgencyInfo();
		try {
			return agencyInfo.push(ourCompany);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;	
		}	
	}
	
	public static boolean saveInThisComputer(){
		//���´���ʵ�����л�
	        try{
	            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CompanySettings.out"));//�����������ļ���Ϊ my.out ��ObjectOutputStream�ܰ�Object�����Byte��
	            oos.writeObject(ourCompany); 
	            oos.flush();  //������ 
	            oos.close(); //�ر���
	            return true;
	        } catch (FileNotFoundException e){        
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			return false;
	}
	 
	public static boolean loadFromThisComputer(){    
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
	
}
