package bl.report.service;

import vo.BussinessSheetVO;

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
