package bl.report.service;

import vo.ProfitSheetVO;

public interface ProfitSheetBLService {
	
	/**
	 * �鿴�ɱ������
	 * @return
	 */
	public ProfitSheetVO show ();
	
	
	/**
	 * ����Ϊexcel�ļ�
	 * @return �Ƿ�ɹ�
	 */
	public boolean export();
	

}
