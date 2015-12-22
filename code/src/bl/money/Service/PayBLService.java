package bl.money.Service;

import java.util.ArrayList;

import bill.PaymentBill;
import bill.ReceiveMoneyBill;

/**
 * ��д���������Ĵ�����
 * @author �߳��
 *
 */
public interface PayBLService {
	/**
	 * �ύ���
	 * @param bills
	 * @return
	 */
	public boolean addPaymentBill(ArrayList<PaymentBill> bills);
	
	/**
	 * ���ָ��ʱ�������ڵĸ��
	 * @param start
	 * @param end
	 * @return
	 */
	public ArrayList<PaymentBill> getPaymentBill(String[] start,String[] end);
	
	/**
	 * ��ý�����endTime�ĸ��
	 * @param endTime
	 * @return
	 */
	public ArrayList<PaymentBill> getPaymentBill(String[] endTime);
	/**
	 * ���δ�����ĵ���
	 * @return
	 */
	public ArrayList<PaymentBill> getUnmarkingBills();
}
