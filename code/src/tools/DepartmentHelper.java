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
	public static String thisDepartment;
	public static StaffVO thisStaff;//��ŵ�ǰ��¼���˵���Ϣ
	public static String pos;
	
	public DepartmentHelper(StaffVO staff){
		this.thisStaff=staff;
		thisDepartment=staff.department;
		pos=staff.pos;
		
	}
	
	public static StaffVO getStaff(){
		return thisStaff;
	}
	
	public static String getDepartment(){
		return thisDepartment;
	}


}
