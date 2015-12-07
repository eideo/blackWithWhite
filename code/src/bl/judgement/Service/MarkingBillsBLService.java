package bl.judgement.Service;

import java.util.ArrayList;

/**
 * ����һ�����ͽӿ�
 * @author �߳��
 *
 * @param <T>
 */
public interface MarkingBillsBLService<T> {
	
	/**
	 * �鿴��������
	 * 
	 * @param type �������͵����֣�Ӣ�ģ�������
	 * @return
	 */
	public ArrayList<T> getBills(String type);

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
