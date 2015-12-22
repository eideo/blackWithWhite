package bl.receivement.Impl;

import java.util.ArrayList;

import bill.AllocateBill;
import bill.ArrivementBill_Shop;
import bl.information.Impl.InformationController;
import data.shipment.Allocate;
import data.shipment.Arrive_Shop;
import tools.DepartmentHelper;
import tools.TimeHelper;

public class Distribution {
	public boolean distribution(ArrayList<AllocateBill> bills) {
		// TODO Auto-generated method stub
		Allocate allocate=new Allocate();
		boolean result=true;
		try {
			for(int i=0;i<bills.size();i++){
				result=result&&allocate.insert(bills.get(i));
			}
			//����������̬
			InformationController IC=new InformationController();
			for(int j=0;j<bills.size();j++)	{
				for(int i=0;i<bills.get(j).list.size();i++){
					result=result&&IC.refreshMesg(bills.get(j).list.get(i),"���������ɴ���Ϊ"+bills.get(j).numID+"������Ա��������", TimeHelper.getTime());
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return result;	
	}
	
	public boolean receive(ArrivementBill_Shop arrive) {
		// TODO Auto-generated method stub
		Arrive_Shop arriveHelper=new Arrive_Shop();
		boolean result=true;
		result=result&&arriveHelper.insert(arrive);
		//����������̬
		InformationController IC=new InformationController();
		for(int i=0;i<arrive.showAllID().size();i++){
			result=result&&IC.refreshMesg(arrive.showAllID().get(i), "�����ѵ���"+DepartmentHelper.getDepartment(), TimeHelper.getTime());
		}
		return result;
	}
}
