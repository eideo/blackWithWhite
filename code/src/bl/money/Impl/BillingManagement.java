package bl.money.Impl;

import bill.ReceiveMoneyBill;
import moneydata.PaidBill;
import tools.TimeHelper;

/**
 * ���������������
 * @author �߳��
 *
 */
public class BillingManagement {
	ReceiveMoneyBill[] bills;
	
	
	public ReceiveMoneyBill[] getBills(String[] Date, String businessHall) {
		//���ʱ���ʽ
		if(!TimeHelper.isValidTime(Date))
			return null;
		//��ȡ�տ
		PaidBill paid=new PaidBill();

		
		
		return null;
	}


	public double getTotalMoney() {
		// TODO Auto-generated method stub
		if(bills==null)
			return -1;
		double sum=0;
		for(int i=0;i<bills.length;i++){
			sum+=bills[i].money;
		}
		return sum;
	}
}
