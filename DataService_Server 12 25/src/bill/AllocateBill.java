package bill;

import java.io.Serializable;
import java.util.ArrayList;

public class AllocateBill implements Serializable{
	
	/**
	 * �ɼ���
	 */
	private static final long serialVersionUID = 4864493447844671634L;
	public String ID;//���ݵ�ID
	public boolean judged;
	public String[] date;
	public String name;//���Ա������
	public ArrayList<String> list;//���ݵļļ�����
	
	public AllocateBill(String ID,String numID,String[] date){
		this.ID=ID;
		this.name=numID;
		this.date=date;
		list=new ArrayList<String>();
	}
	


}
