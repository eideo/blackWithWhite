package bill;

import java.util.ArrayList;
public class StockBill_In {

	public String ID;
	ArrayList<Info> list;
	
	/**
	 * UI�㴴����ⵥ
	 * @param ID
	 * @param date
	 * @param destination
	 */
	public StockBill_In(String[] ID,String[][]date,String[] destination){
		for(int i=0;i<ID.length;i++){
			list.add(new Info(ID[i],date[i],destination[i]));
		}
	}
	
	/**
	 * ҵ���߼������λ��
	 * @param zoneID
	 * @param rowID
	 * @param frameID
	 * @param positionID
	 */
	public void allocate(String[] zoneID,String[] rowID,String[] frameID,String[] positionID){
		for(int i=0;i<zoneID.length;i++){
			list.get(i).allocate(zoneID[i], rowID[i], frameID[i], positionID[i]);
		}
	}
	
	class Info{
		private String ID;//�ļ�����
		private String[] date;//�������
		private String destination;
		private String zoneID;//����
		private String rowID;//�ź�
		private String frameID;//�ܺ�
		private String positionID;//λ��
		
		Info(String ID,String[]date,String destination){
			this.ID=ID;
			this.destination=destination;
			this.date=date;
		}
		void allocate(String zoneID,String rowID,String frameID,String positionID){
			this.zoneID=zoneID;
			this.rowID=rowID;
			this.frameID=frameID;
			this.positionID=positionID;
		}
	}

}
