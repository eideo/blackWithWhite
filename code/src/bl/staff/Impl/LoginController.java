package bl.staff.Impl;

import java.rmi.Naming;

import po.StaffPO;
import vo.StaffVO;

public class LoginController {
	StaffPO thisStaff;
	
	public StaffVO checkLogin(String ID,String password){
		
		String passwordFromCloud=thisStaff.passwords;
		if(password==passwordFromCloud){
			return new StaffVO(thisStaff); //�����֤�ɹ������ظö����VO���������Զ�ȡ���û���Ϣ
		}else{
			return new StaffVO();//����޷���֤��ݣ�����һ���յ�StaffVO����
		}
	}
}
