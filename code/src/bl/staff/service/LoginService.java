package bl.staff.service;
/**
 * �ṩ�˵�½�Ĺ���
 * @author �߳��
 *
 */
public interface LoginService {
	
	/**
	 * ����û�������˺������Ƿ�һ�£���Ч��
	 * @param ID �˺�
	 * @param passwords ����
	 * @return
	 */
	public boolean validUser(String ID,String passwords);

}
