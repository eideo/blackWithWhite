package bl.report.service;

import bl.report.impl.BussinessSheetVO;

public interface BussinessSheetBLService {

	/**
	 * �鿴��Ӫ�����
	 * @param start ��ʼʱ��
	 * @param end ����ʱ��
	 * @return
	 */
	public BussinessSheetVO show (String start,String end);
	
	
	/**
	 * ����Ϊexcel�ļ�
	 * @return �Ƿ�ɹ�
	 */
	public boolean export();
	


}