package bl.report.service;

import bl.report.impl.BussinessSheetVO;

public interface BussinessSheetControllerService {
	
	/**
	 * ����һ��BSReport����
	 * @return �Ƿ�ɹ�
	 */
	public boolean creatBSReport();
	
	/**
	 * ���þ�Ӫ�����Ŀ�ʼ�ͽ���ʱ��
	 * @param ��ʼʱ��
	 * @param ����ʱ��
	 * @return �Ƿ�ɹ�
	 */
	public boolean SetDate(String start,String end);
	
	
	/**
	 * ���ؾ�Ӫ�����VO
	 * @return ��Ӫ�����VO
	 */
	public BussinessSheetVO show ();
	
	
	/**
	 * ����Ϊexcel�ļ�
	 * @return �Ƿ�ɹ�
	 */
	public boolean export();
	
	/**
	 * �˳��������ٶ�Ӧ����
	 * @return �Ƿ�ɹ�
	 */
	public boolean exit();
}
