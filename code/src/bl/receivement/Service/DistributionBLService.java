package bl.receivement.Service;

import bill.ArrivementBill;

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
	public boolean receive(ArrivementBill arrive);
	
	/**
	 * �ɼ�
	 * @param time ʱ��
	 * @param deliveryMan ���Ա
	 * @param ID  IDs
	 * @return
	 */
	public boolean distribution(String[][] time,String[] deliveryMan,String[] ID);
}
