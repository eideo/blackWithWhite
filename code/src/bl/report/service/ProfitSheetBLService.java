package bl.report.service;

import bl.report.Impl.*;

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
