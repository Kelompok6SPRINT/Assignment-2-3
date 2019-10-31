package assignment3;

public class Parking {

	private final double MobilFHour=5000;
	private final double MotorFHour=3000;
	private final double MobilPerHour=6000;
	private final double MotorPerHour=4000;
	
	private int jam=0;
	private int menit=0;
	
	private double result=0;
//	private int resultMobil=0;
//	private int resultMotor=0;
	
	public double InputProcess(String vehicle, String in, String out) {
		
//		if (in.substring(0,2)) {
//			
//		}
		result=0;
		jam=Integer.parseInt(out.substring(0,2))-Integer.parseInt(in.substring(0,2));
		menit=Integer.parseInt(out.substring(3,5))-Integer.parseInt(in.substring(3,5));
		
		if (vehicle.equalsIgnoreCase("mobil")) {
			
			result=result+MobilFHour;
			if (menit>0 && jam>0) result=result+MobilPerHour;
			if (jam>1) result=result+(jam*MobilPerHour);
			
			
			
		} else if (vehicle.equalsIgnoreCase("motor")) {
			
			result=result+MotorFHour;
			if (menit>0 && jam>0) result=result+MotorPerHour;
			if (jam>1) result=result+(jam*MotorPerHour);
			
		}
		
		return result;
		
	}	
	
}
