package com.vektorel;

import java.util.ArrayList;
import java.util.List;

import com.vektorel.models.Ogrenci;

public class OgrenciIslemleri {
	
	private List<Ogrenci> liste = new ArrayList<Ogrenci>();
	
	public void ogrenciEkle(int ogrencino, String ogrenciadi, String ogrencisoyadi, String ogrencisinifi, String ogrenciiletisim) {
		
		Ogrenci ogr = new Ogrenci(); //Ogrenci nesnesi olusturma
		ogr.ad = ogrenciadi;
		ogr.iletisim = ogrenciiletisim;
		ogr.no = ogrencino;
		ogr.sinifi = ogrencisinifi;
		ogr.soyad = ogrencisoyadi;
		liste.add(ogr); //add komutuyla ogrencileri eklemis oluyoruz.
		
	}
	
	public void ogrenciListesi () {
		
		System.out.println("*** OGRENCI LISTESI ***");
		for (Ogrenci item : liste) {
			System.out.println(item.no + " - " + item.ad + " - " + item.soyad +  " - " + item.sinifi + " - " + item.iletisim);
		}
		
	}
	
	public void ogrenciBul(int ogrencino) {
		
		for (Ogrenci item : liste) {
			if (item.no == ogrencino) {
				System.out.println(item.no + " - " + item.ad + " - " + item.soyad +  " - " + item.sinifi + " - " + item.iletisim);
			}
		}
		
	}
	
	public void ogrenciSil(int ogrencino, String ogrenciadi, String ogrencisoyadi) {
		
		int silinecekid = -1;
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).no == ogrencino) {
				silinecekid = i;
				}
			else if(liste.get(i).ad.equals(ogrenciadi) && liste.get(i).soyad.equals(ogrencisoyadi)){
				silinecekid = i;
			}
			if (silinecekid>-1) 
				liste.remove(silinecekid);
			}
		
	}
	
	public void ogrenciGuncelle(int ogrencino, String ogrenciadi, String ogrencisoyadi, String ogrencisinifi, String ogrenciiletisim) {
		
		int guncellenecekid = -1;
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).no == ogrencino) {
				guncellenecekid = i;
			}
			Ogrenci ogr = new Ogrenci();
			ogr.ad = ogrenciadi;
			ogr.iletisim = ogrenciiletisim;
			ogr.no = ogrencino;
			ogr.sinifi = ogrencisinifi;
			ogr.soyad = ogrencisoyadi;
			liste.set(guncellenecekid, ogr);
		}
	}
	
}
