package bl.commoditybl.Service;

import vo.StockSnapShotVO;

/**
 * ����̵�
 * @author �߳��
 *
 */
public interface InventoryBLService {

	/**
	 * �����̵�
	 * @return ���ص���Ŀ�����
	 */
	public StockSnapShotVO getStockSnapShot();
	
	/**
	 * ����Ϊexcel
	 * @return �Ƿ񵼳��ɹ�
	 */
	public boolean export();
}
