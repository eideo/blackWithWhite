package bill;

import java.util.ArrayList;

public class AllocateBill {
	public String ID;//���ݵ�ID
	boolean judged;
	String[] date;
	String numID;//���Ա��ID
	ArrayList<String> list;
	
	public AllocateBill(){}
	public AllocateBill(String a,String[] b){
		numID=a;
		date=b;
		list=new ArrayList<String>();
	}

}
