package bl.shipment.Service;

import bill.BusShipmentBill_Center;
import bill.TransportBill_Truck;

/**
 * ����װ�˹���
 * @author �߳��
 *
 */
public interface TruckTransportManageBLService {
	/**
	 * 
	 * @param truckBill ��ת��-����(Ӫҵ����Ӫҵ��
	 * @return �õ������л������˷ѣ��������ֵΪ-1��������������������Ӵ��󡪡����������쳣��
	 */
	public double submitBills(TransportBill_Truck truckBill);
	
	/**
	 * 
	 * @param planeBill װ��������ת���ĵ�Ӫҵ��
	 * @return �õ������л������˷ѣ��������ֵΪ-1��������������������Ӵ��󡪡����������쳣��
	 */
	public double submitBills(BusShipmentBill_Center truckBill);
}
