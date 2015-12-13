package vo;

import java.util.ArrayList;
import bill.PaymentBill;
import bill.ReceiveMoneyBill;
import tools.TimeHelper;

public class ProfitSheetVO {
	
		public double totalGet;
		public double totalPay;
		public double profit;
		public String time;
		public ProfitSheetVO(ArrayList<PaymentBill> pay,ArrayList<ReceiveMoneyBill> paid){
			for(int i=0;i<pay.size();i++){
				totalPay+=pay.get(i).money;
			}
			for(int i=0;i<paid.size();i++){
				totalGet+=paid.get(i).money;
			}
			profit=totalGet;
			time=TimeHelper.getTime();
		}
	
		/*//����Ϊ������
		public ProfitSheetVO(double a,double b,double c){
			this.totalGet=a;
			this.totalPay=b;
			this.profit=c;
		}*/
}
