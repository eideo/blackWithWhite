package vo;

import Stubpackage.numOfTransit;
import po.String;

public class ShipmentBillVO {
	String kindOfBill;
	
	/*
	 * װ������Ϣ
	 */
		int[][][] date;
		String numOfHall;
		String numOfTrain;
		String numOfDestination;
		String numOfBus;
		String nameOfInspection;
		String nameOfEscort;
		String[] numOfOrder;
		
	/*
	 * ��ת����Ϣ
	 */
		
		
		String numOfTransitBill;
		String numOfFlight;
		String starting;
		String destination;
		String nameOfContainer;
		double money;
		
	/*
	 * ��ת���ĵ��ﵥ��Ϣ
	 */
		String numOfTransit;
		int[][][] dateOfArrival;
		String stationOfArrival;
		
		public ShipmentBillVO(){}
		
		public ShipmentrBillVO(String kindOfBill)(int[][][] date,String numOfHall,String numOfTrain,String numOfDestination,
					String numOfBus,String nameOfInspection,String nameOfEscort,String[] numOfOrder,String numOfTransitBill,
					String numOfFlight,String starting,String destination,String nameOfContainer,double money,String numOfTransit;
					int[][][] dateOfArrival,String stationOfArrival){
						
						kindOfBill=shipmentbill.kindOfBill;
						date=shipmentbill.date;
						numOfHall=shipmentbill.numOfHall;
						numOfTrain=shipmentbill.numOfTrain;
						numOfDestination=shipmentbill.numOfDestination;
						numOfBus=shipmentbill.numOfBus;
						nameOfInspection=shipmentbill.nameOfInspection;
						nameOfEscort=shipmentbill.nameOfEscort;
						numOfOrder=shipmentbill.numOfOrder;
						numOfTransitBill=shipmentbill.numOfTransitBill;
						numOfFlight=shipmentbill.numOfFlight;
						starting=shipmentbill.starting;
						destination=shipmentbill.destination;
						nameOfContaine=shipmentbill.nameOfContainer;
						money=shipmentbill.money;
						numOfTransit=shipmentbill.numOfTransit;
						dateOfArrival=shipmentbill.dateOfArrival;
						stationOfArrival=shipmentbill.stationOfArrival;
							
						
					}
}
