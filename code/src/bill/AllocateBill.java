package bill;

import java.io.Serializable;
import java.util.ArrayList;

public class AllocateBill implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4864493447844671634L;
	public String ID;//���ݵ�ID
	public boolean judged;
	public String[] date;
	public String numID;//���Ա��ID
	public ArrayList<String> list;//���ݵļļ�����
	
	public AllocateBill(){}
	public AllocateBill(String a,String[] b){
		numID=a;
		date=b;
		list=new ArrayList<String>();
	}
	


}
