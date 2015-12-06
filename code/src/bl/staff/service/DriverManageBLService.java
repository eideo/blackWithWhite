package bl.staff.service;

import java.util.ArrayList;

import bill.DriverPO;
import bill.TruckPO;

public interface DriverManageBLService {
	/**
	 * ����˾��
	 * @param trucks
	 * @return
	 */
	public boolean addNewDiver (DriverPO[] drivers);
	/**
	 * ɾ��˾��
	 * @param ID
	 * @return
	 */
	public boolean deleteDriver(String ID[]);
	/**
	 * ����˾����Ϣ
	 * @param name
	 * @param ID
	 * @param IDCardNumber
	 * @param birthday
	 * @param isBoy
	 * @param TelNumber
	 * @param validate
	 * @return
	 */
	public boolean ChangeDriverInfo(String name[],String ID[],String IDCardNumber[],
			String birthday[],boolean isBoy[],String TelNumber[],String validate[]);
	/**
	 * ����˾��
	 * @param ID
	 * @return
	 */
	public DriverPO getDriver (String ID);
	/**
	 * ��ʾ����˾����ģ������
	 * @return
	 */
	public ArrayList<DriverPO> getAllDriver (String str);
}
