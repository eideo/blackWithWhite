package bl.money.Service;

import java.util.ArrayList;

import bill.Account;

/**
 * �˻��������Թ�˾�˻�����ɾ�Ĳ�
 * @author �߳��
 *
 */
public interface AccountManageBLService {

	/**
	 * �����˻�
	 * @param accounts �˻�
	 * @return
	 */
	public boolean adddAccount(ArrayList<Account> accounts);
	/**
	 * ɾ���˻�
	 * @return
	 */
	public boolean delateAccount(String[] ID);
	
	/**
	 * @param name �˻�����
	 * @return
	 */
	public boolean changeAccountInfo(String[] ID, String[] name);
	
	/**
	 * �����˻�
	 * @param KeyWord_ID �˺Ż����˻��ؼ���
	 * @return
	 */
	public ArrayList<Account> getAccount(String KeyWord_ID);
}
