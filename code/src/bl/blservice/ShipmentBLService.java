package bl.blservice;

public interface ShipmentBLService {

/*
 * �õ�װ�������
 */
	public String getTruckID ();
	
/*
 * �õ���ת�����
 */

	public String getFreightID ();

/*
 * �õ���ת���ﵥ���
 */
	public String getReceiveID ();
	
/*
 * ���ɵ���po
 */
	public ShipmentBillPO buildShipment();
	
/*
 * ���浥��
 */
	public ShipmentVO save(ShipmentInputInfo info);

}
