package bl.receivement.Service;

import java.util.ArrayList;

import vo.ReceiveInformationVO;

/**
 * �ռ���Ϣ��д
 * @author �߳��
 *
 */
public interface TransportFinishedBLService {
	
	/**
	 * �ռ���Ϣ����
	 * @param ID �ļ�����
	 * @param nameOfReceiver �ռ�������
	 * @param date �ռ�����
	 * @return 
	 */
	public boolean billFilled(ArrayList<ReceiveInformationVO> info);
}
