package bl.commoditybl.Service;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.StockBill_In;

/**
 * ������
 * @author �߳��
 *
 */
public interface InDepotBLService {

	/**
	 * ���
	 * @param stock_in �����Ϣ
	 * @return �����λ�õ������Ϣ������UI��ʾλ�ã�
	 */
	public StockBill_In inDepot(StockBill_In stock_in);
	
	
	public ArrayList<StockBill_In> getUnmarkingBills();
		
		
	
}
