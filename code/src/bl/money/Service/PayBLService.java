package bl.money.Service;

import bill.PaymentBill;

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
	public boolean addPaymentBill(PaymentBill[] bills);
}
