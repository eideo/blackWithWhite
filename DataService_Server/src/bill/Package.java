package bill;

import java.util.ArrayList;
/**
 * �洢��ϵͳ�еĻ�����������б����λ�õ�״̬��Ϣ��������
 * @author �߳��
 *
 */
public class Package {
	static String ID;//�ļ�����
	private ArrayList<TransMesgPO> state;
	
	public boolean refreshState(TransMesgPO transMesgPO){
		state.add(transMesgPO);
		return true;
	}
}
