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
	 * @return
	 */
	public boolean submitBills(TransportBill_Truck truckBill);
	
	/**
	 * 
	 * @param planeBill װ��������ת���ĵ�Ӫҵ��
	 * @return
	 */
	public boolean submitBills(BusShipmentBill_Center truckBill);
}
