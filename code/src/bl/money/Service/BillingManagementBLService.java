package bl.money.Service;

import po.bills.ReceiveMoneyBill;

/**
 * �������
 * @author �߳��
 *
 */
public interface BillingManagementBLService {
	
	/**
	 * �鿴ָ�����ڣ�ָ��Ӫҵ��������տ��Ϣ
	 * Ӫҵ����Ϣ����Ϊnull����ʱ����ʾ��������Ӫҵ�����տ��Ϣ��
	 * @param Date ����
	 * @param businessHall Ӫҵ������
	 * @return �տ
	 */
	public ReceiveMoneyBill[] getBills(String[] Date,String businessHall);
	
	/**
	 * �õ���ǰ���鿴��Ӫҵ�����տ�ĺϼƽ����ߵ�������Ӫҵ�����տ��ܶ
	 * @return �ϼ�
	 * ע���������ֵΪ-1��˵�����쳣
	 */
	public double getTotalMoney();
}
