package bl.money.Service;

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
	
	
	public boolean getPaidmentBill();
	
}
