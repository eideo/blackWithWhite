package bl.receivement.Service;

import bill.AllocateBill;
import bill.ArrivementBill;
import bill.ArrivementBill_Shop;

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
