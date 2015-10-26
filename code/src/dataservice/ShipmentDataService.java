package dataservice;

public interface ShipmentDataService {

/*
 * ����ID����װ����
 */
	public ShipmentBillPO findTruck(long id) throws RemoteException;
	
/*
 * �����ݿ�������һ��װ����
 */
	public void insertTruck(ShipmentBillPO po) throws RemoteException;
	
/*
 * �����ݿ���ɾ��һ��װ����
 */
	public void deleteTruck(ShipmentBillPO po) throws RemoteException;
	
/*
 * �����ݿ��и���һ��װ����
 */
	public void updateTruck(ShipmentBillPO po) throws RemoteException;
	
/*
 * ���������ݿ��ʹ��
 */
	public void finishTruck() throws RemoteException;
	
/*
 * ����ID������ת��
 */
	public ShipmentBillPO findFreight(long id) throws RemoteException;
	
/*
 * �����ݿ�������һ����ת��
 */
	public void insertFreight(ShipmentBillPO po) throws RemoteException;
	
/*
 * �����ݿ���ɾ��һ����ת��
 */
	public void deleteFreight(ShipmentBillPO po) throws RemoteException;
	
/*
 * �����ݿ��и���һ����ת��
 */
	public void updateFreight(ShipmentBillPO po) throws RemoteException;
	
/*
 * ���������ݿ��ʹ��
 */
	ublic void finishFreight() throws RemoteException;
	
/*
 * ����ID������ת���ܵ�
 */
	public ShipmentBillPO findReceive(long id) throws RemoteException;
	
/*
 * �����ݿ�������һ����ת���ܵ�
 */
	public void insertReceive(ShipmentBillPO po) throws RemoteException;
	
/*
 * �����ݿ���ɾ��һ����ת���ܵ�
 */
	public void deleteReceive(ShipmentBillPO po) throws RemoteException;
	
/*
 * �����ݿ��и���һ����ת���ܵ�
 */
	public void updateReceive(ShipmentBillPO po) throws RemoteException;
	
/*
 * ���������ݿ��ʹ��
 */
	public void finishReceive() throws RemoteException;
	
/*
 * �õ�����ID
 */
	public String getID();
	
/*
 * �������п�浥�ݵ�����
 */
	public ArrayList<ShipmentBillPO> show();


}
