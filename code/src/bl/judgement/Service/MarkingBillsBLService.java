package bl.judgement.Service;

import java.util.ArrayList;


public interface MarkingBillsBLService<T> {
	
/*
 * �鿴��������
 */
	public ArrayList<T> getBills();

/*
 * �޸ĵ�������
 */
	public boolean updateRecord(ArrayList<T> bills);

/**
 * 
 * @param record
 * @return
 */
	public boolean submitRecord(ArrayList<T> bills);



}
