package bill;

public class PositionInfo{
	public  String ID;//�ļ�����
	public String form;//���䷽ʽ
	public String date;//�������
	public String destination;//Ŀ�ĵ�
	public String zoneID;//����
	public String rowID;//�ź�
	public String frameID;//�ܺ�
	public String positionID;//λ��
	
	public PositionInfo(String ID,String date,String destination){
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
