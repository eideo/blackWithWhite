package bl.staff.service;

import vo.StaffVO;

/**
 * ����Ա���û�����
 * @author �߳��
 *
 */
public interface UserManageBLService {

	/**
	 * ����ID���ظö���
	 * @return
	 */
	public StaffVO getStaff(String ID);
	
	
	
	/**
	 * �����û�����Ϣ
	 */
	public boolean changeStaffInfo(String competence,String passwords,String age,String name);
}
