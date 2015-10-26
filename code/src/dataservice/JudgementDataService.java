package dataservice;

import po.OrderBillPO;

public interface JudgementDataService {
	
/*
 * g����ID���Ҷ���
 */
	public OrderBillPO find(long id) throws RemoteException;
	
/*
 * ����һ������
 */
	public void update(OrderBillPO po) throws RemoteException;
	
/*
 * �����־û����ݿ��ʹ��
 */
	public void finish() throws RemoteException;
	
/*
 * �õ�����ID
 */
	public string getID();
	
/*
 * �������п�浥�ݵ�����
 */
	public ArrayList<OrderBillPO> show();

}
