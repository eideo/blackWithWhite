package bl.commoditybl.Service;
/**
 * ������ʼ��
 * @author �߳��
 *
 */
public interface InitDepotAreaBLService {
	
	/**
	 * ��ʼ��������Ϣ
	 * @param motorTransport ������
	 * @param trainTransport ������
	 * @param airTransport	����ȥ
	 * @param balnkSpace	������
	 * @return
	 */
	public boolean init(int[] motorTransport,int[] trainTransport,int[] airTransport, int[] balnkSpace);
}
