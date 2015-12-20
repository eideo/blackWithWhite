package data.commodity;


import remoteInterface.Client_Helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.StockBill_In;
public interface Commodity_In_Manage extends Client_Helper {
	/**
	 * ������ⵥ,IDΪ��ת���ı��
	 * @param bill
	 * @return ���ռ䲻��������null
	 * @throws RemoteException
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public StockBill_In insert(StockBill_In bill,String ID) throws RemoteException, FileNotFoundException, IOException;
	
	/**
	 * ɾ��һ����ⵥ
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public boolean delete(String id) throws RemoteException, FileNotFoundException, IOException;
	
	/**
	 * �޸�һ����ⵥ
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public boolean change(StockBill_In bill) throws RemoteException, FileNotFoundException, IOException;
	
	/**
	 * ȡ��һ����ⵥ
	 * @param bill
	 * @return 
	 * @throws RemoteException
	 */
	public StockBill_In get(String id) throws RemoteException;
	
	/**
	 * ��ʼ�����ݿ�
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
	public ArrayList<StockBill_In> getUnjudged() throws RemoteException;
}
