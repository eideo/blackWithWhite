package tools;

import settings.CompanySettingsController;
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
	private static StaffVO thisStaff;//��ŵ�ǰ��¼���˵���Ϣ

	
	public DepartmentHelper(StaffVO staff){
		this.thisStaff=staff;
		thisDepartment=staff.department;
		this.thisDepartmentID=CompanySettingsController.DeapartmentSearch(thisDepartment);
		if(this.thisDepartmentID.equals("fail")){
			System.out.println("�ڵǼǴ��û��Ĳ�����Ϣʱ���������ò��ſ��ܲ�����");
		}
			
	}
	
	public static StaffVO getStaff(){
		return thisStaff;
	}
	
	public static String getDepartment(){
		return thisDepartment;
	}
}
