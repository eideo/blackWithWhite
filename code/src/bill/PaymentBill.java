package bill;
/**
 * ���
 * @author �߳��
 *
 */
public class PaymentBill {
	public String ID;
	public String[] date;
	public double money;
	public String payer;//������
	public String type;//����Ŀ������˷ѡ���Ա���ʡ�������
	public String remarks;//�������ݡ��˵��š���ע�����·ݣ�
	
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
