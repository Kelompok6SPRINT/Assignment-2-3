package assignment2;

import java.util.HashMap;

public class Cashier {

	private String[] kategori = {};
	private String[] jenis = {};
	private double[] harga = {};
	private double[] hargaAkhir = {0,0,0,0,0};
	private double total=0;
	
//	private double finalPrice=0;
	
	public void InputKategori(String kategori[]) {
		this.kategori = kategori;
	}
	
	public void InputJenis(String jenis[]) {
		this.jenis = jenis;
	}
	
	public void InputHarga(double harga[]) {
		this.harga = harga;
	}
	
	public void PutFinalPrice (String kategori, double harga, int i) {
		if (kategori.equalsIgnoreCase("A")) {
			hargaAkhir[i]=harga-(harga/10);
		} else {
			
		}
		if (kategori.equalsIgnoreCase("B")) {
			hargaAkhir[i]=harga-(harga*0.15);
		} else {
			
		}
		if (kategori.equalsIgnoreCase("C")) {
			hargaAkhir[i]=harga-(harga/5);
		} else {
			
		}
		
	
		
	}
	
	public String GetKategori(int i) {
		return kategori[i];
	}
	public String GetJenis(int i) {
		return jenis[i];
	}
	public double GetHarga(int i) {
		return harga[i];
	}
	public double GetHargaAkhir(int i) {
		return hargaAkhir[i];
	}
	public double GetTotal(){
		
		for(int i=0; i<hargaAkhir.length; i++) {
			total=total+hargaAkhir[i];
		}
		return total;
	}
	
}
