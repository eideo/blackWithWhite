package bill;

import java.util.ArrayList;

public class AllocateBill {
	public String ID;//���ݵ�ID
	public boolean judged;
	String[] date;
	public String numID;//���Ա��ID
	public ArrayList<String> list;//���ݵļļ�����
	
	public AllocateBill(){}
	public AllocateBill(String a,String[] b){
		numID=a;
		date=b;
		list=new ArrayList<String>();
	}
	


}
