package bl.shipment.Service;

import bill.TransportBill_Plane;

/**
 * ״̬�������
 * �ɻ�װ�˹���
 * @author �߳��
 *
 */
public interface AirTransportBLService {
	/**
	 * 
	 * @param planeBill ��ת��-�ɻ�
	 * @return �õ������л������˷ѣ��������ֵΪ-1��������������������Ӵ��󡪡����������쳣��
	 */
	public double submitBills(TransportBill_Plane planeBill);
}
