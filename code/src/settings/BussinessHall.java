package settings;

import java.io.Serializable;

public class BussinessHall extends Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6295457600896574402L;
	public String name;//Ӫҵ������
	public String ID;//Ӫҵ�����
	
	public BussinessHall(String name, String ID) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.ID=ID;
	}
}
