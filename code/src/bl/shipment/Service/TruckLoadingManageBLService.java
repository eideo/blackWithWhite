package bl.shipment.Service;

import bill.BusShipmentBill_Shop;

/**
 * ����װ������(��Ӫҵ������
 * @author �߳��
 *
 */
public interface TruckLoadingManageBLService {
	
	/**
	 * 
	 * @param shop װ����
	 * @return �õ������л������˷ѣ��������ֵΪ-1��������������������Ӵ��󡪡����������쳣��
	 */
	public double submitBills(BusShipmentBill_Shop shop);
}
