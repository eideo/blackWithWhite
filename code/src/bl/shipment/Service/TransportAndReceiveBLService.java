package bl.shipment.Service;

import bill.ArrivementBill_Center;

/**
 * ��ת����
 * @author �߳��
 *
 */
public interface TransportAndReceiveBLService {

	/**
	 * ��ת����ҵ��Ա��д��ת���ĵ��ﵥ
	 * @param bill
	 * @return �õ������л������˷ѣ��������ֵΪ-1��������������������Ӵ��󡪡����������쳣��
	 */
	public boolean submitBills(	ArrivementBill_Center bill);
	
}
