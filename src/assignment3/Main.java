package assignment3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		Parking Parking = new Parking();
		while(true) {
			System.out.print("Jenis Kendaraan:");
			String vehicle = sc.nextLine();
			 
			System.out.print("IN: ");
			String in = sc.nextLine();
			
			System.out.print("OUT: ");
			String out = sc.nextLine();
			
			System.out.println("Tagihan : Rp. "+Parking.InputProcess(vehicle, in, out)+"\n");
		}
		
		 
	}

}
