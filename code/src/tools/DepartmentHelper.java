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
	public static String thisDepartment;
	/**
	 * ��ǰ��½���û��������Ĳ��Ŵ���
	 */
 	public static String thisDepartmentID;
	public static StaffVO thisStaff;//��ŵ�ǰ��¼���˵���Ϣ
	public static String pos;
	
	public DepartmentHelper(StaffVO staff){
		this.thisStaff=staff;
		thisDepartment=staff.department;
		pos=staff.pos;
		//this.thisDepartmentID=CompanySettingsController.DeapartmentSearch(thisDepartment);
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
