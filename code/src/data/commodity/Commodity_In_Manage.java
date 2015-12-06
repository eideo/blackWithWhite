package data.commodity;
import java.rmi.*;
import java.util.ArrayList;

import remoteInterface.Client_Helper;
import bill.StockBill_In;
public interface Commodity_In_Manage extends Client_Helper {
	/**
	 * ������ⵥ,IDΪ��ת���ı��
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public ArrayList<StockBill_In> insert(ArrayList<StockBill_In> bill,String ID) throws RemoteException;
	
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
}
