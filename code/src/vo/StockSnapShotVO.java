package vo;

import java.util.ArrayList;

/**
 * �����գ�VO
 * @author �߳��
 *
 */
public class StockSnapShotVO {
	//�����һλΪ���֣��ڶ�λΪ���ÿռ䣬����λΪ����ռ䣬����λΪʹ�ðٷֱ�
	String[] truck; 
	String[] air;
	String[] train;
	String[] blank;//������
	
	public StockSnapShotVO(	String[] truck,String[] air,String[] train,String[] blank){
		this.truck=truck;
		this.air=air;
		this.train=train;
		this.blank=blank;
	}
	
}