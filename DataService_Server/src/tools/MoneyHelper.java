package tools;

import java.util.ArrayList;

import bl.send.Impl.SendController;

public class MoneyHelper {

	/**
	 * ������Щ�ļ��������˷�
	 * @param ID �ļ�����
	 * @return
	 */
	public static double getFreight(String[] ID){
		SendController SC=new SendController();
		double freight=0;
		for(int i=0;i<ID.length;i++){
			freight+=SC.inquireSendMesg(ID[i]).money;
		}
		return freight;
	}
	
	/**
	 * ������Щ�ļ��������˷�
	 * @param ID �ļ�����
	 * @return
	 */
	public static double getFreight(ArrayList<String> ID){
		SendController SC=new SendController();
		double freight=0;
		for(int i=0;i<ID.size();i++){
			freight+=SC.inquireSendMesg(ID.get(i)).money;
		}
		return freight;
	}
}
