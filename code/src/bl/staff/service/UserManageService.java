package bl.staff.service;

import po.StaffPO;
import vo.StaffVO;

public interface UserManageService {
	
	
	
	/**
	 * ����ID���ظö���
	 * @return
	 */
	public StaffVO getStaff(String ID);
	
	
	
	/**
	 * �����û�����Ϣ
	 */
	public boolean changeStaff(String competence,String passwords,String age,String name);
}
