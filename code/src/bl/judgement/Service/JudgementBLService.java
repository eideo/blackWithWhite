package bl.judgement.Service;

import bill.OrderBillPO;

public interface JudgementBLService {
	
/*
 * �鿴��������
 */
	public boolean getBills();

/*
 * �޸ĵ�������
 */
	public boolean updateRecord(OrderBillPO[] record);

/**
 * 
 * @param record
 * @return
 */
	public boolean submitRecord(OrderBillPO record);



}
