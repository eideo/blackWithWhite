package bl.shipment.Service;

import po.bills.TransportBill_Train;

/**
 * �ɻ�װ�˹���
 * @author �߳��
 *
 */
public interface TrainTransportBLService {
	/**
	 * 
	 * @param Train ��ת��-��
	 * @return �õ������л������˷ѣ��������ֵΪ-1��������������������Ӵ��󡪡����������쳣��
	 */
	public double submitBills(TransportBill_Train Train);
}
