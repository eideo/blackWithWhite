package tools;

import vo.StaffVO;

/**
 * �������ڱ�ǵ�ǰ��½�����һЩ��Ϣ
 * @author �߳��
 *
 */
public class DepartmentHelper {
	/**
	 * ��ǰ��¼���û��������Ĳ���
	 */
	private static String thisDepartment;
	/**
	 * ��ǰ��½���û��������Ĳ��Ŵ���
	 */
	private static String thisDepartmentID;
	private static StaffVO staff;//��ŵ�ǰ��¼���˵���Ϣ

	
	public DepartmentHelper(StaffVO staff){
		this.staff=staff;
		thisDepartment=staff.department;
	}
	
	public static StaffVO getStaff(){
		return staff;
	}
	
	public static String getDepartment(){
		return thisDepartment;
	}
}
