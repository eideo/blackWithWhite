package bl.judgement.Service;

import po.OrderBillPO;

public interface JudgementService {
	
/*
 * �鿴��������
 */
	public boolean checkRecord(OrderBillPO record);

/*
 * �޸ĵ�������
 */
	public boolean updateRecord(OrderBillPO record);

/*
 * ���µ���
 */
	public boolean submitRecord(OrderBillPO record);



}
