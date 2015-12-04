package bl.staff.service;

import bill.TruckPO;

public interface TruckManageBLService {
	
	/**
	 * ���ӻ���
	 * @param trucks
	 * @return
	 */
	public boolean addNewTruck (TruckPO[] trucks);
	/**
	 * ɾ������
	 * @param ID
	 * @return
	 */
	public boolean deleteTruck(String ID[]);
	/**
	 * ���Ļ�����Ϣ
	 * @param truckID
	 * @param licensePlate
	 * @param inTime
	 * @return
	 */
	public boolean ChangeTruckInfo(String truckID[],String licensePlate [],String inTime[]);
	/**
	 * ���һ���
	 * @param ID
	 * @return
	 */
	public TruckPO getTruck (String ID);
	/**
	 * ��ʾ���л���
	 * @return
	 */
	public TruckPO[] getTruck ();

}
