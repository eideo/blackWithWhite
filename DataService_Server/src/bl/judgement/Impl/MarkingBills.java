package bl.judgement.Impl;

import java.util.ArrayList;

import bl.commoditybl.Impl.InDepotController;
import bl.commoditybl.Impl.OutDepotController;
import bl.money.Impl.PaidController;
import bl.money.Impl.PayController;
import bl.send.Impl.SendController;

public class MarkingBills<T> {
	
	public ArrayList<T> getBills(String type) {
		// TODO Auto-generated method stub
		ArrayList<T> list;
		switch(type){
		case "OrderBill"://�ļ���
			SendController sendController=new SendController();
			list=(ArrayList<T>) sendController.getUnmarkingBills();
			break;
		case "PaymentBill"://���
			PayController payController=new PayController();
			list=(ArrayList<T>) payController.getUnmarkingBills();
			break;
		case "ReceiveMoneyBill"://�տ
			PaidController paidController=new PaidController();
			list=(ArrayList<T>) paidController.getUnmarkingBills();
			break;
		case "StockBill_In"://��ⵥ
			InDepotController inDepotController=new InDepotController();
			list=(ArrayList<T>) inDepotController.getUnmarkingBills();
			break;
		case "StockBill_out"://���ⵥ
			OutDepotController outDepotController=new OutDepotController();
			list=(ArrayList<T>) outDepotController.getUnmarkingBills();
			break;
			
/*		case "Buss":
			
			break;
		case "":
			
			break;
		case "":
			
			break;*/
			
			
			
		default:
			return null;
		}
		return list;
	}

	
	public boolean updateRecord(ArrayList<T> bills) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean submitRecord(ArrayList<T> bills) {
		// TODO Auto-generated method stub
		return false;
	}

}
