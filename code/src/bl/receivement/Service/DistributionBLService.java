package bl.receivement.Service;

import po.bills.AllocateBill;
import po.bills.ArrivementBill;
import po.bills.ArrivementBill_Shop;

/**
 * �������ɼ�
 * @author �߳��
 *
 */
public interface DistributionBLService {

	/**
	 * ����
	 * @param arrive Ӫҵ�����ﵥ
	 * @return
	 */
	public boolean receive(ArrivementBill_Shop arrive);
	
	/**
	 * �ɼ�
	 * @param time ʱ��
	 * @param deliveryMan ���Ա
	 * @param ID  IDs
	 * @return
	 */
	public boolean distribution(AllocateBill[] bills);
}
