package bill;

import java.util.ArrayList;
/**
 * �洢��ϵͳ�еĻ�����������б����λ�õ�״̬��Ϣ��������
 * @author �߳��
 *
 */
public class PackageVO {
	private String ID;//�ļ�����
	private ArrayList<TransMesgPO> state;
	
	public PackageVO(String ID){
		this.ID=ID;
	}
	
	public String getID(){
		return ID;
	}
	public boolean refreshState(ArrayList<TransMesgPO> transMesgPO){
		state=transMesgPO;
		return true;
	}
	
	public ArrayList<TransMesgPO> getState(){
		return state;
	}
}
