package commoditydata;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Dataservice.FileHelper;
import bill.StockBill_Out;
import data.commodity.Commodity_Out_Manage;
import database.Database_StockBill_Out;

public class Commodity_OutImpl extends UnicastRemoteObject implements Commodity_Out_Manage {
	/**
	 * commodity���������ṩ��
	 */
	public static Database_StockBill_Out database;//���ݴ洢����
	public static boolean ready=false;//�����Ƿ��Ѿ���ʼ��
	final static String dir="ser/StockBill_Out.ser";//��ȡ���ݵ�Ŀ¼
	
	protected Commodity_OutImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		super();
		//�������û�г�ʼ�������ȡ֮ǰ�洢�Ķ���
		if(!ready){
			ready=true;
			database=(Database_StockBill_Out) FileHelper.read(dir);
		}
		// TODO Auto-generated constructor stub
	}

	public static void save() throws FileNotFoundException, IOException{
		FileHelper.write(dir, database);
	}
	@Override
	//������ת���ı�ź͵��Ŵ洢���ⵥ
	public synchronized boolean insert(StockBill_Out bill,String id) {
		// TODO Auto-generated method stub
		CommodityManageImpl.freePosition(bill, id);
		System.out.println("insert here");
		boolean bool=database.add(bill);
		System.out.println(bool);
		try {
			this.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	//ɾ��һ�����ⵥ
	public synchronized boolean delete(String id) {
		// TODO Auto-generated method stub
		boolean bool=database.delete(id);
		try {
			this.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	//�޸�һ�����ⵥ
	public synchronized boolean change(StockBill_Out bill) {
		// TODO Auto-generated method stub
		boolean bool=database.change(bill);
		try {
			this.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bool;
	}

	@Override
	//���һ�����ⵥ
	public StockBill_Out get(String id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

	@Override
	//��տ�����Ϣ
	public boolean init() {
		// TODO Auto-generated method stub
		database=new Database_StockBill_Out();
		return true;
	}

	@Override
	public void ping() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	//�������δ��������
	public synchronized ArrayList<StockBill_Out> getUnjudged() throws RemoteException {
		// TODO Auto-generated method stub
		return database.getUnjudged();
	}

}
