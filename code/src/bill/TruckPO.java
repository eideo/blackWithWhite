package bill;
/**
 * δ���и�ʽ���
 * @author nch
 *
 */
public class TruckPO {
	public String vehicleCode;
	public String licensePlate;
	String serviceTime;	

	public TruckPO(String vehicleCode,String licensePlate,String serviceTime){
		this.vehicleCode=vehicleCode;
		this.licensePlate=licensePlate;
		this.serviceTime=serviceTime;
	}
	
	public void ChangeTruckInfo(String licensePlate, String inTime){
		this.licensePlate=licensePlate;
		this.serviceTime=inTime;
	}
}
