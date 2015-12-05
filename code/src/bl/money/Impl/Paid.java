package bl.money.Impl;

import java.util.ArrayList;

import bill.ReceiveMoneyBill;
import data.money.PaidBill;
/**
 * ��д�տ���������
 * @author �߳��
 *
 */
public class Paid {
	PaidBill paid;
	
	public Paid(){
		paid=new PaidBill();
	}
	public boolean addPaidmentBill(ReceiveMoneyBill[] bills) {
		if(bills==null)
			return false;
		try {
			for(int i=0;i<bills.length;i++){
				paid.insert(bills[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�տ����ʧ��");
			return false;
		}
		return true;
	}
	public ArrayList<ReceiveMoneyBill> getPaidmentBill(String[] start, String[] end) {
		ArrayList<ReceiveMoneyBill> receiveMoneyBill;
		try {
			receiveMoneyBill=paid.getall(start,end);		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��ȡ�տʧ��");
			return null;
		}
		return receiveMoneyBill;
	}
	
	public ArrayList<ReceiveMoneyBill> getPaidmentBill(String[] time) {
		ArrayList<ReceiveMoneyBill> receiveMoneyBill;
		try {
			receiveMoneyBill=paid.getall(time);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��ȡ�տʧ��");
			return null;
		}
		return receiveMoneyBill;
	}
}
