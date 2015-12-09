package tools;

import java.util.ArrayList;

import bill.StaffPO;
import vo.StaffVO;

/**
 * �������ڱ�ǵ�ǰ��½�����һЩ��Ϣ
 * @author �߳��
 *
 */
public class DepartmentHelper {
	private static String thisDepartment;//��ŵ�ǰ�����Ĳ���
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
