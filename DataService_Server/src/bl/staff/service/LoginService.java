package bl.staff.service;

import vo.StaffVO;

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
	 * @return �������ֵΪnull����ζ���û������ڻ������������û������ID������һ�£������ظ���Ա��VO
	 */
	public StaffVO validUser(String ID,String passwords);

}
