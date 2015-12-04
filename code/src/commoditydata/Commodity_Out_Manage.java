package commoditydata;

import remoteInterface.Client_Helper;

import java.rmi.RemoteException;

import bill.StockBill_Out;
public interface Commodity_Out_Manage extends Client_Helper {
	
	public boolean insert(StockBill_Out bill) throws RemoteException;
	public boolean delete(String id) throws RemoteException;
	public boolean change(StockBill_Out bill) throws RemoteException;
	public StockBill_Out get(String id) throws RemoteException;
	public boolean init() throws RemoteException;
}