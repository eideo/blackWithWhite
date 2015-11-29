package bl.report.service;

import bl.report.impl.*;

public interface ProfitSheetControllerService {
	
	/**
	 * ����һ��PSReport����
	 * @return �Ƿ�ɹ�
	 */
	public boolean creatPSReport();
	
	/**
	 * ���þ�Ӫ�����Ŀ�ʼ�ͽ���ʱ��
	 * @param time ��ʼʱ��
	 * @return �Ƿ�ɹ�
	 */
	public boolean SetDate(String time);
	
	
	/**
	 * ���سɱ������VO
	 * @return �ɱ������VO
	 */
	public ProfitSheetVO show ();
	
	
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
