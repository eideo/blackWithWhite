package bl.information.Service;

import vo.PackageVO;

public interface InformationBLService {
	
	/**
	 * ����ID��ѯ������Ϣ
	 * @param id �����������
	 * @return
	 */
	public PackageVO inquireTransMesg(String id);
	
	
	/**
	 * ����������Ϣ
	 * @param id �����������
	 * @param position λ��
	 * @param time ʱ��
	 * @return
	 */
	public boolean refreshMesg(String id,String position,String time);
}
