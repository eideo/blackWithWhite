package vo;

import java.util.ArrayList;

import bill.TransMesgPO;
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
		state=new ArrayList<TransMesgPO>();
	}
	public PackageVO(String ID,ArrayList<TransMesgPO> states){
		this.ID=ID;
		state=states;
	}
	public String getID(){
		return ID;
	}
	public boolean refreshState(TransMesgPO transMesgPO){
		state.add(transMesgPO);
		return true;
	}
	
	public ArrayList<TransMesgPO> getState(){
		return state;
	}
}
