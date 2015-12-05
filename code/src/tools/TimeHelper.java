package tools;

import java.util.Calendar;

/**
 * �����ṩһЩ����ʱ��ķ���
 * @author �߳��
 *
 */
public class TimeHelper {

	/**
	 * ��������������ʽ�ļ��
	 * @param date
	 * @return
	 */
	public static boolean isValidTime(String[] date){
		int year;
		int month;
		int day;
		try {
			year=Integer.parseInt(date[0]);
			month=Integer.parseInt(date[1]);
			day=Integer.parseInt(date[2]);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		if(year<1900||year>2200)
			return false;
		if(month<0||month>12)
			return false;		
		if(day<0||day>31)
			return false;
		
		return true;	
	}
	/**
	 * ���ϵͳ��ǰʱ��
	 * @return ������ʱ������ַ���
	 */
	public static String getTime(){
		Calendar c=Calendar.getInstance();
		String s=""+c.get(Calendar.YEAR)+(c.get(Calendar.MONTH)+1)+
				adjustTime(""+c.get(Calendar.DATE),2)+
				adjustTime(""+c.get(Calendar.HOUR),2)+
				adjustTime(""+c.get(Calendar.MINUTE),2)+
				adjustTime(""+c.get(Calendar.SECOND),2);
		
		return s;
	}
	
	/**
	 * getTime������˽�и����������ܹ�ʵ�ְѡ�3��ת��Ϊ��03��
	 * @param s ��ת�����ַ���
	 * @param n ��Ҫ��λ��
	 * @return
	 */
	public static String adjustTime(String s,int n){
		char c[]=s.toCharArray();
		if(c.length<n)
			s="0"+s;
		return s;
	}
}