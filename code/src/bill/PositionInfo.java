package bill;

public class PositionInfo{
	public  String ID;//�ļ�����
	public String form;//���䷽ʽ
	public String[] date;//�������
	public String destination;//Ŀ�ĵ�
	private String zoneID;//����
	private String rowID;//�ź�
	private String frameID;//�ܺ�
	private String positionID;//λ��
	
	public PositionInfo(String ID,String[]date,String destination){
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
