package com.vektorel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vektorel.models.Ogrenci;

public class Runner {

	public static void main(String[] args) {

		OgrenciIslemleri islem = new OgrenciIslemleri();
		int secim = -1;
		do {
		
		
		do {
			System.out.println("İşlem Seçimi");
			System.out.println("1- Öğrenci Ekleme");
			System.out.println("2- Öğrenci Silme");
			System.out.println("3- Öğrenci Listeleme");
			System.out.println("4- Öğrenci Bulma");
			System.out.println("5- Öğrenci Güncelleme");
			System.out.println("6- ÇIKIŞ");	
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Seçiminiz...: ");
				secim = sc.nextInt();
				
			}catch(Exception ex) {
				System.out.println("!!! Lütfen Geçerli bir Değer Giriniz.");
			}
			
		}while(secim<1 || secim>6);
		
		if(secim==1) { // Öğrenci Ekleme
			try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Öğrenci Numarası...: ");
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("Öğrenci Adı...: ");
			String ad = sc.nextLine();
			System.out.println("Öğrenci Soyadı...: ");
			String soyad = sc.nextLine();
			System.out.println("Öğrenci Sınıfı...: ");
			String sinif = sc.nextLine();
			System.out.println("Öğrenci İletişim...: ");
			String iletisim = sc.nextLine();
			
			islem.ogrenciEkle(no, ad, soyad, sinif, iletisim);
			}catch(Exception ex){
				System.out.println("Lutfen rakamsal deger giriniz");
			}
		}
		else if(secim==2) { // Öğrenci silme
			System.out.println("Silinecek Öğrenci No...: ");
			Scanner sc = new Scanner(System.in);
			int no = Integer.parseInt(sc.nextLine());
			
			islem.ogrenciSil(no, "", "");
		}
		else if(secim==3) // Öğrenci listele
		{
			islem.ogrenciListesi();
		}
		else if(secim==4) { // Öğrenci Bulma
			System.out.println("Bulunacak Öğrenci No...: ");
			Scanner sc = new Scanner(System.in);
			int no = Integer.parseInt(sc.nextLine());
			islem.ogrenciBul(no);
		}
		else if(secim==5) { // Öğrenci Güncelle
			Scanner sc = new Scanner(System.in);
			System.out.println("Öğrenci Numarası...: ");
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("Öğrenci Adı...: ");
			String ad = sc.nextLine();
			System.out.println("Öğrenci Soyadı...: ");
			String soyad = sc.nextLine();
			System.out.println("Öğrenci Sınıfı...: ");
			String sinif = sc.nextLine();
			System.out.println("Öğrenci İletişim...: ");
			String iletisim = sc.nextLine();
			
			islem.ogrenciGuncelle(no, ad, soyad, sinif, iletisim);
		}
		else if(secim==6)
			break;
		}while(true);
		System.out.println("PROGRAM SONLANDIRILDI...");
	}// Main Method Sonu

	public void SilinenKisim() {
//		Ogrenci ogr; //Ogrenci nesnesi
//		
//		List<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>(); //014_List_ArrayList
//		
//		ogr = new Ogrenci();
//		ogr.ad = "Ogrenci-1";
//		ogr.soyad = "Soyad-1";
//		ogr.no = 1;
//		ogrenciListesi.add(ogr); //Ogrenci nesnesi ekliyoruz(ogr)
//		//System.out.println(ogr);
//		
//		ogr = new Ogrenci(); //Tekrardan Ogrenci olusturuyoruz.
//		ogr.ad = "Ogrenci-2";
//		ogr.soyad = "Soyad-2";
//		ogr.no = 2;
//		ogrenciListesi.add(ogr);
//		//System.out.println(ogr);
//		
//		for (Ogrenci item : ogrenciListesi) {
//			System.out.println(item.no + " - " + item.ad + " - " + item.soyad);
//		}
	
	}
	
}// Class Sonu
