package settings;

import java.io.Serializable;
import java.util.ArrayList;

public class City implements Serializable{

	public String name;//��������
	String ID;//���б��
	ArrayList<TransportCenter> transportCenter;//��Ͻ��ת����
	
	
	public City(String name,String ID){
		this.name=name;
		this.ID=ID;
		this.transportCenter=new ArrayList<TransportCenter>();
		
		//�������������ɾ��ת���Ĺ��ܣ����´������޸�
		TransportCenter aTransportCenter=new TransportCenter(this.name+"��ת����", ID+"1");
		this.transportCenter.add(aTransportCenter);
	}
	
	/**
	 * ������ת���ġ�
	 * �ù�����δ���
	 * @param aTransportCenter
	 * @return
	 */
	public boolean addTransportCenter(TransportCenter aTransportCenter){
		return false;
	}
	
	
}
