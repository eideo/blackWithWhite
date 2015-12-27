package bl.staff.service;

import java.util.ArrayList;

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
	public boolean changeStaffInfo(String competence, String passwords, String age, String name,String ID,String power);
	
	/**
	 * ��ʾ����Ա������ģ����������Ա��
	 * src=""ʱ����ʾ����Ա��
	 * @return
	 */
	public ArrayList<StaffVO> getAllStaff (String src);
}
