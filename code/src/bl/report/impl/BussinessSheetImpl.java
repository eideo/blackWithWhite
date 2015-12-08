package bl.report.impl;

import java.util.ArrayList;

import bill.PaymentBill;
import bill.ReceiveMoneyBill;
import bl.money.Impl.PaidController;
import bl.money.Impl.PayController;
import tools.ExcelHelper;
import vo.BussinessSheetVO;

public class BussinessSheetImpl{
	BussinessSheetVO bsVO;
	
	
	
	public boolean export() {
		if(bsVO==null){
			return false;
		}
		return ExcelHelper.export(bsVO);
	}

	public BussinessSheetVO show(String start,String end) {
		// TODO Auto-generated method stub
		if(!this.checkDate(start,end)){
			return null;
		}else{
			PaidController paidController=new PaidController();
			PayController payController=new PayController();
			ArrayList<PaymentBill> pay;
			ArrayList<ReceiveMoneyBill> paid;
			
			try {
				pay=payController.getPaymentBill(timeToArray(start), timeToArray(end));
				paid=paidController.getPaidmentBill(timeToArray(start), timeToArray(end));
				bsVO=new BussinessSheetVO(pay,paid);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("�˴��ǲ�ѯ��Ӫ������޷����ӵ�������");
				return null;
			}
			return bsVO;
		}

	}
	/**
	 * ����Ƿ��и�ʽ����
	 * @param start ��ʼʱ��
	 * @param end  ����ʱ��
	 * @return ��ʽ�ǹ���ȷ
	 */
	
	private boolean checkDate(String start, String end) {
		//�ȼ��������ǲ�������ʱ��
		char[] temp1=start.toCharArray();
		char[] temp2=end.toCharArray();
		
		if(temp1.length!=8||temp2.length!=8)
			return false;
		
		boolean isNum=true;//
		for(int i=0;i<8;i++){
			if(temp1[i]<'0'||temp1[i]>'9'){
				isNum=false;
				break;
			}
			if(temp2[i]<'0'||temp2[i]>'9'){
				isNum=false;
				break;
			}
		}
		if(!isNum)
			return false;
		
		if(Integer.parseInt(start)>Integer.parseInt(end)){
			return false;
		}
		return true;
	}
	
	private String[] timeToArray(String time){
		try {
			String year=time.substring(0,4);
			String month=time.substring(4,6);
			String day=time.substring(6,8);
			
			String[] out={year,month,day};
			return out;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}



}

	

