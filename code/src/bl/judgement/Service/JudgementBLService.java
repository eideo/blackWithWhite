package bl.judgement.Service;



public interface JudgementBLService {
	
/*
 * �鿴��������
 */
	public ResultMessage checkRecord(OrderBillPO record);

/*
 * �޸ĵ�������
 */
	public ResultMessage updateRecord(OrderBillPO record);

/*
 * ���µ���
 */
	public ResultMessage submitRecord(OrderBillPO record);



}
