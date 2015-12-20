package bill;

import java.io.Serializable;
import java.util.ArrayList;
public class StockBill_In implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 345001898270272103L;
	public static String billtype="StockBill_In";
	public String ID;
	public boolean judged;
	
	public ArrayList<Info> list;
	
	public int getLength(){
		return list.size();
	}
	
	public String[] getID(){
		String[] s=new String[list.size()];
		for(int i=0;i<list.size();++i){
			s[i]=list.get(i).ID;
		}
		return s;
	}
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
	
	public class Info{
		public  String ID;//�ļ�����
		public String form;//���䷽ʽ
		private String[] date;//�������
		private String destination;//Ŀ�ĵ�
		private String zoneID;//����
		private String rowID;//�ź�
		private String frameID;//�ܺ�
		private String positionID;//λ��
		
		public Info(String ID,String[]date,String destination){
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
