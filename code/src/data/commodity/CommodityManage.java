package data.commodity;

import java.rmi.RemoteException;

import bill.StockBlockInfo;
import bill.StockFillmentInfo;
import remoteInterface.Client_Helper;

public interface CommodityManage extends Client_Helper{
	/**
	 * num��ʾ�źţ�block��ʾ�����������
	 * @param num
	 * @param block
	 * @return
	 * @throws RemoteException
	 */
	public boolean adjustCommodity(String num,String block) throws RemoteException;
	
	public boolean init(String id) throws RemoteException;
	
	public StockFillmentInfo checkCommodity(String id) throws RemoteException;
}
