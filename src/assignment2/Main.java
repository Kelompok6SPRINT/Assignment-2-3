package assignment2;

import java.util.Scanner;

//import assignment3.Parking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		Cashier cashier = new Cashier();
		
		String[] kategori = {"","","","",""};
		String[] jenis = {"","","","","",};
		double[] harga = {0,0,0,0,0};
		
		int number=1;
		
		for(int i=0; i<5; i++) {
			System.out.print("Kategori: ");
			kategori[i] = sc.next();
			 
			System.out.print("Jenis pakaian: ");
			jenis[i] = sc.next();
			
			System.out.print("Harga: ");
			harga[i] = sc.nextDouble();
			System.out.println("\n");	
			
		}
		cashier.InputKategori(kategori);
		cashier.InputJenis(jenis);
		cashier.InputHarga(harga);
		for(int i=0; i<5; i++) {
			cashier.PutFinalPrice(kategori[i], harga[i], i);
			System.out.print(number+". "+cashier.GetKategori(i)+". "+cashier.GetJenis(i)+" = Rp. "+cashier.GetHarga(i)+" (diskon ");
			if(kategori[i].equalsIgnoreCase("A")) {
				System.out.print("10%");
			} else if (kategori[i].equalsIgnoreCase("B")) {
				System.out.print("15%");
			} else if (kategori[i].equalsIgnoreCase("C")) {
				System.out.print("20%");
			}
			System.out.println(")");
			System.out.println("                        Rp. "+cashier.GetHargaAkhir(i));
			
			number++;
		}
		System.out.println("____________________________________________________");
		System.out.println("TOTAL =                  Rp. "+cashier.GetTotal());
		
		
	}

}
