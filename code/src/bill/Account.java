package bill;
/**
 * ��˾�����˻�
 * @author �߳��
 *
 */
public class Account {

	private String ID;
	public String name;
	private double balance;
	
	Account(String id,String name,double balance){
		this.ID="1000";
		this.balance=balance;
		this.name=name;
	}
	
	public String getID(){
		return this.ID;
	}
}
