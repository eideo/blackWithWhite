package bl.shipment.Service;

import bill.TransportBill_Plane;

/**
 * �ɻ�װ�˹���
 * @author �߳��
 *
 */
public interface AirTransportBLService {
	/**
	 * 
	 * @param planeBill ��ת��-�ɻ�
	 * @return
	 */
	public boolean submitBills(TransportBill_Plane planeBill);
}
