package bl.shipment.Service;

import bill.TransportBill_Train;

/**
 * �ɻ�װ�˹���
 * @author �߳��
 *
 */
public interface TrainTransportBLService {
	/**
	 * 
	 * @param planeBill ��ת��-��
	 * @return
	 */
	public boolean submitBills(TransportBill_Train Train);
}
