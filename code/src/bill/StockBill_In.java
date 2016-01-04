package bill;

import java.io.Serializable;
import java.util.ArrayList;

import bill.StockBill_In.Info;
public class StockBill_In implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 345001898270272103L;
	public static String billtype="StockBill_In";
	public String ID;
	public boolean judged;
	

	public ArrayList<Info> list1 = new ArrayList<Info>();

	public ArrayList<PositionInfo> list;

	
	public StockBill_In() {
		// TODO Auto-generated constructor stub
	}

	public int getLength(){
		return list1.size();
	}
	
	public String[] getID(){
		String[] s=new String[list1.size()];
		for(int i=0;i<list1.size();++i){
			s[i]=list1.get(i).ID;
		}
		return s;
	}
	/**
	 * UI�㴴����ⵥ
	 * @param ID
	 * @param date
	 * @param destination
	 */

	
	
	public void addlist(String billID,String ID,String date,String destination){
		    this.ID=billID;
			list1.add(new Info(ID,date,destination));
		
	}
	public StockBill_In(String[] ID,String[][]date,String[] destination){
		for(int i=0;i<ID.length;i++){
			list.add(new PositionInfo(ID[i],date[i],destination[i]));
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
			list1.get(i).allocate(zoneID[i], rowID[i], frameID[i], positionID[i]);
		}
	}
	

	public class Info{
		public  String ID;//�ļ�����
		public String form;//���䷽ʽ
		public String date;//�������
		public String destination;//Ŀ�ĵ�
		public String zoneID;//����
		public String rowID;//�ź�
		public String frameID;//�ܺ�
		public String positionID;//λ��
		
		public Info(String ID,String date,String destination){
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
	
