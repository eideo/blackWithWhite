package bl.report.impl;

import bl.report.service.*;
import vo.BussinessSheetVO;
/**
 * �ṩ�˲�ѯ��Ӫ�����Ĺ���
 * @author �߳��
 *
 */
public class BussinessSheetController implements BussinessSheetBLService{
	BussinessSheetImpl bs;
	
	public BussinessSheetController() {
		// TODO Auto-generated method stub
		bs=new BussinessSheetImpl();
	}
	
	public BussinessSheetVO show(String start, String end) {
		// TODO Auto-generated method stub
		return bs.show(start,end);
	}

	public boolean export() {
		// TODO Auto-generated method stub
		return bs.export();
	}
}
