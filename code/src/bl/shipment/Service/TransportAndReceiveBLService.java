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
	 * @return
	 */
	public boolean submitBills(	ArrivementBill_Center bill);
	
}
