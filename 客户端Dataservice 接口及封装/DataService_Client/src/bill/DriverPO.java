package bill;
/**
 * ��������ݸ�ʽ�Ƿ���ȷ
 * @author nch
 *
 */
public class DriverPO {
	String ID;
	String name;
	String IDNumber;
	String[] birthday;
	boolean isBoy;
	String tel;
	String[] validData;
	

	public DriverPO(String ID,String name,String IDNumber,String[] birthday,
			boolean isBoy,String tel,String[] validData){
		this.ID=ID;
		this.name=name;
		this.IDNumber=IDNumber;
		this.birthday=birthday;
		this.isBoy=isBoy;
		this.tel=tel;
		this.validData=validData;
	}
	
}
