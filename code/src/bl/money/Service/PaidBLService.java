package bl.money.Service;

import java.util.ArrayList;

import bill.ReceiveMoneyBill;

/**
 * �տ��д
 * @author �߳��
 *
 */
public interface PaidBLService {

	/**
	 * �ύ�տ
	 * @param bills
	 * @return
	 */
	public boolean addPaidmentBill(ReceiveMoneyBill[] bills);
	
	
	/**
	 * ���ָ��ʱ�������ڵ��տ
	 * @param start
	 * @param end
	 * @return
	 */
	public ArrayList<ReceiveMoneyBill> getPaidmentBill(String[] start,String[] end);
	
	/**
	 * ��ý�����endTime���տ
	 * @param endTime
	 * @return
	 */
	public ArrayList<ReceiveMoneyBill> getPaidmentBill(String[] endTime);
	
}
