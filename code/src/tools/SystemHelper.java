package tools;

import bl.staff.Impl.StaffManageController;
import settings.City;
import settings.company;
import settings.CompanySettingsController;
import settings.Distance;
import settings.TransportCenter;
import vo.StaffVO;

public class SystemHelper {
	
	public static void initSystem(){
		//1.������ʼ������
		CompanySettingsController companyManage=new CompanySettingsController(new company());
		company company=companyManage.ourCompany;
	
		City beijing=new City("����","010");
		City nanjing=new City("�Ͼ�","025");
		City guangzhou=new City("����","020");
		City shanghai=new City("�Ϻ�","021");
		
		company.citys.add(beijing);
		company.citys.add(nanjing);
		company.citys.add(guangzhou);
		company.citys.add(shanghai);
		
		Distance bn=new Distance(beijing, nanjing,900);
		Distance bs=new Distance(beijing, shanghai,1065);
		Distance bg=new Distance(beijing, guangzhou,1889);
		Distance ns=new Distance(nanjing,shanghai,266);
		Distance ng=new Distance(nanjing,guangzhou,1132);
		Distance sg=new Distance(guangzhou,shanghai,1213);
		
		company.distance.add(bn);
		company.distance.add(bs);
		company.distance.add(bg);
		company.distance.add(ns);
		company.distance.add(ng);
		company.distance.add(sg);
		
		TransportCenter nj=nanjing.transportCenter.get(0);
		TransportCenter sh=shanghai.transportCenter.get(0);
		TransportCenter bj=beijing.transportCenter.get(0);
		TransportCenter gz=guangzhou.transportCenter.get(0);
		
		String[] njnames={"�Ͼ�����ϼ��Ӫҵ��","�Ͼ��й�¥��Ӫҵ��","�Ͼ������ִ�ѧ��Ӫҵ��",
				 "�Ͼ��о�����Ӫҵ��","�Ͼ����¹���Ӫҵ��","�Ͼ��н���Ӫҵ��",
				 "�Ͼ����Ͻ�ɽӪҵ��","�Ͼ�����ɽɭ��Ӫҵ��","�Ͼ��а�����Ӫҵ��",
				 "�Ͼ���������Ӫҵ��"};
		nj.addBussinessHall(njnames);
		String[] bjnames={"01","02","03","04","05","06","07","08","09","10"};
		bj.addBussinessHall(bjnames);
		String[] shnames={"01","02","03","04","05","06","07","08","09","10"};
		bj.addBussinessHall(shnames);
		String[] gznames={"01","02","03","04","05","06","07","08","09","10"};
		bj.addBussinessHall(gznames);
		/*CompanySettingsController.push();*/
		//2.��ӱ�Ҫ��Ա�˺�
		StaffVO administor=new StaffVO();
		administor.ID="00000001";
		administor.passwords="2015";
		administor.department="--";
		administor.pos="����Ա";
		
		StaffVO manage=new StaffVO();
		manage.ID="00000011";
		manage.department="--";
		manage.passwords="2015";
		manage.pos="�ܾ���";
		StaffManageController staffManage=new StaffManageController();
		StaffVO[] staffs={administor,manage};
	/*	staffManage.addNewStaff(staffs);*/
		
		//3.�ڳ�����
		
	}
	
	public static void main(String[] args){
		initSystem();
	}
}
