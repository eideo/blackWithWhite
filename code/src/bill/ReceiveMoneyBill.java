package bill;

import java.util.ArrayList;
/**
 * �տ
 * @author �߳��
 *
 */
public class ReceiveMoneyBill {
	public static String billtype="ReceiveMoney";
	public String ID;
	public String[] date;
	public double money;
	public String transactor;//�տ�Ŀ��Ա
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
}
