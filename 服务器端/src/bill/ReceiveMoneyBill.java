package bill;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * �տ
 * @author �߳��
 *
 */
public class ReceiveMoneyBill implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4485009681134619444L;
	public static String billtype="ReceiveMoney";
	public String ID;
	public boolean judged;
	public String[] date;
	public double money;
	public String transactor;//�տ�Ŀ��Ա
	public String bussinessHallCode;//�տ��Ӫҵ�����
	public ArrayList<String> list=new ArrayList<String>();
	
	/**
	 * ���Եõ�����19960218���ַ���
	 * @return
	 */
	public String getDate(){
		String result="";
		result+=date[0]+date[1]+date[2];
		return result;	
	}
	
	public ReceiveMoneyBill(String ID,String[] time,double money,String transactor
			,String bussinessHallCode){
		this.ID=ID;
		this.date=time;
		this.money=money;
		this.transactor=transactor;
		this.bussinessHallCode=bussinessHallCode;
	}
	
	public ReceiveMoneyBill(){
		
	}
}
