package bl.information.Service;

public interface InformationBLService {
	
	/**
	 * ����ID��ѯ������Ϣ
	 * @param id �����������
	 * @return
	 */
	public boolean inquireTransMesg(String id);
	/**
	 * ����������Ϣ
	 * @param id �����������
	 * @param position λ��
	 * @param time ʱ��
	 * @return
	 */
	public boolean refreshMesg(String id,String position,String time);
}
