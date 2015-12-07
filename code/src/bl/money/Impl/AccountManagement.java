package bl.money.Impl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import bill.Account;
import data.money.AccountManage;
/**
 * ��˾�����˻����˻������������
 * @author �߳��
 *
 */
public class AccountManagement {
	/*ArrayList<Account> accounts;*/
	AccountManage accountManage;
	
	public AccountManagement(){
		accountManage=new AccountManage();
	}
	public boolean adddAccount(Account[] accounts) {
		try {
			for(int i=0;i<accounts.length;i++){
				accountManage.insert(accounts[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�����˻�����");
			return false;
		}
		return true;
	}

	public boolean delateAccount(String[] ID) {
		try {
			for(int i=0;i<ID.length;i++){
				accountManage.delete(ID[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ɾ���˻�����");
			return false;
		}
		return true;
	}


	public boolean changeAccountInfo(String[] ID, String[] name) {
		// TODO Auto-generated method stub
		try {
			Account account;
			for(int i=0;i<ID.length;i++){
				account=accountManage.get(ID[i]);
				account.name=name[i];
				accountManage.delete(ID[i]);
				accountManage.insert(account);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�޸��˻�����");
			return false;
		}
		return true;
	}


	public ArrayList<Account> getAccount(String KeyWord_ID) {
		ArrayList<Account> accounts;
		try {
			accounts=accountManage.getAll(KeyWord_ID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return accounts;
	}
}