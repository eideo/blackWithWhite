package bl.send.Impl;

import data.send.SendInfo;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.OrderBillPO;
import bl.information.Impl.InformationController;

public class Send {
	SendInfo si;
	public Send(){
		si=new SendInfo();
	}
	public boolean push(OrderBillPO order) {
		//1.推送到服务器
		boolean result=false;
		try {
			result =si.getInput(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		//2.更新物流动态
		InformationController IC=new InformationController();
		boolean success=IC.refreshMesg(order.ID,"货物从"+order.workplaceOfSender+"寄出，寄件人是"+order.nameOfSender,order.time);
		if(!success)
			return false;
		return result;
	}

	public OrderBillPO inquireSendMesg(String id) {
		// TODO Auto-generated method stub
		try {
			si = new SendInfo();
			return si.getSendMesg(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public ArrayList<OrderBillPO> getUnmarkingBills() {
		// TODO Auto-generated method stub
		ArrayList<OrderBillPO> result;
		try {
			result=si.getUnjudged();
			return result;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}



}
