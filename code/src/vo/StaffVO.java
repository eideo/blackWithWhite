package vo;

import bill.StaffPO;
import tools.TimeHelper;

public class StaffVO {
	public String name;
	public String department;//����
	public String position;//ְλ
	public int age;
	public boolean isBoy;
	
	public String ID;
	public String passwords;
	public String SalaryModel;
	/**
	 * �Ƿ�ӵ��rootȨ�ޣ������Խ��Բ�����Ա�����壬��������ϵͳ�û���û��rootȨ�޸���
	 * ӵ��rootȨ�޵Ĳ�����Ա�ſ��Խ����˻�����
	 */
	public boolean root;
	/**
	 * ��������VO�Ĺ��췽��
	 * @param name 
	 * @param age
	 * @param pos
	 * @param department
	 * @param isBoy
	 */
	public StaffVO(String name,String age,String pos,String department,boolean isBoy){
		this.name=name;
		this.age=Integer.parseInt(age);
		this.position=pos;
		this.department=department;
		this.isBoy=isBoy;
	}
	
	public StaffVO(StaffPO staffPO){
		name=staffPO.name;
		passwords=staffPO.passwords;
		department=staffPO.department;
		position=staffPO.pos;
		ID=staffPO.ID;
		isBoy=staffPO.sex;
		age=Integer.parseInt(TimeHelper.getTime().substring(0, 4))-staffPO.birthyear;
	}	
}
