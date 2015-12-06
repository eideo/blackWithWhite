package data.commodity;
import java.rmi.*;

import remoteInterface.Client_Helper;
import bill.StockBill_In;
public interface Commodity_In_Manage extends Client_Helper {
	/**
	 * ����һ����ⵥ
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public boolean insert(StockBill_In bill) throws RemoteException;
	
	/**
	 * ɾ��һ����ⵥ
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public boolean delete(String id) throws RemoteException;
	
	/**
	 * �޸�һ����ⵥ
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public boolean change(StockBill_In bill) throws RemoteException;
	
	/**
	 * ȡ��һ����ⵥ
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public StockBill_In get(String id) throws RemoteException;
	
	/**
	 * ��ʼ������
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public boolean init() throws RemoteException;
	
	/**
	 * ������λ�ã�����Ϊ�����������ͣ��ɻ����𳵣��������ֱ�Ϊ"plane","train","bus"
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public String[] getPosition(String str) throws RemoteException;
}
