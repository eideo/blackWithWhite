package bl.commoditybl.Service;

import java.util.ArrayList;

import po.bills.StockBill_Out;
/**
 * ����
 * @author �߳��
 *
 */
public interface OutDepotBLService {

	/**
	 * ����
	 * @param stock_out ������Ϣ
	 * @return �Ƿ񴴽��ɹ�
	 */
	public boolean outDepot(StockBill_Out stock_out);
	
	public ArrayList<StockBill_Out> getUnmarkingBills();
}
