package bl.send.Service;

import java.util.ArrayList;

import bill.OrderBillPO;

public interface SendBLService {
	
	/**
	 * �����ļ���,���Ҹ���������Ϣ
	 * @param order
	 * @return
	 */
	public boolean push(OrderBillPO order);
	
	/**
	 * �鿴�ļ�����Ϣ
	 * @param id
	 * @return
	 */
	public OrderBillPO inquireSendMesg(String id);
	/**
	 * ���δ��������
	 * @return
	 */
	public ArrayList<OrderBillPO> getUnmarkingBills();
	
}
