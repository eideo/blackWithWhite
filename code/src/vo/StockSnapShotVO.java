package vo;

import java.util.ArrayList;

/**
 * �����գ�VO
 * @author �߳��
 *
 */
public class StockSnapShotVO {
	ArrayList<Info> list;
	
	class Info{
		String ID;
		String[] date;
		String destination;
		String zoneID;
		String rowID;
		String frameID;
		String positionID;
	}
}