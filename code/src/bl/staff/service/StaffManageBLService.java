package bl.staff.service;

import vo.StaffVO;

/**
 * �ܾ������Ա��������
 * @author �߳��
 *
 */
public interface StaffManageBLService {

	/**
	 * ����Ա��
	 * @param staffs ����㴫������staffVO����
	 * @return �����ɹ������û�м�¼����������
	 */
	public boolean addNewStaff (StaffVO[] staffs);

	/**
	 * ɾ��Ա��
	 * @param ID ����㴫������Ա����ID
	 * @return
	 */
	public boolean deleteStaff (String[] ID);

	/**
	 * ����Ա����ְλ
	 * @param ID Ա����ID
	 * @param newPosition Ա���µ�ְλ
	 * @param newDepartment Ա���µĲ���
	 * @return
	 */
	public boolean changePosition (String ID[],String newPosition[],String newDepartment[]);
	
	/**
	 * ����Ա����нˮ����
	 * @param ID Ա����ID
	 * @param salaryModel нˮ����
	 * @return
	 */
	public boolean changesalarymodel (String ID[],String salaryModel[]);
	
	/**
	 * ����Ա������Ϣ
	 * @param name ����
	 * @param age ����
	 * @param authority Ȩ��
	 * @param password	����
	 * @return
	 */
	public boolean changeStaffInfo (String name,int age,String authority,String password);
	
	/**
	 * ����Ա��
	 * @param ID
	 * @return
	 */
	public StaffVO getStaff (String ID);
	
	/**
	 * ��ʾ����Ա��
	 * @return
	 */
	public StaffVO[] getStaff ();


}
