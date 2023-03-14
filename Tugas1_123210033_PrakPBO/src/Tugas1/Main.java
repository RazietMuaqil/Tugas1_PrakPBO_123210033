/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main{
    private static boolean kembali;
    public static void main(String[] args){
        int pil, panjang, lebar, tinggi, jari;
        String ulang;
        
        do{
            System.out.println("Menu Utama");
            System.out.println("1. Menghitung Balok");
            System.out.println("2. Menghitung Tabung");
            System.out.println("0. Keluar");
            Scanner input = new Scanner(System.in);
            System.out.print("Pilihan : "); pil=input.nextInt();
            switch(pil){
                case 1->{
                    System.out.println();
                    System.out.print("Input Panjang : "); panjang = input.nextInt();
                    System.out.print("Input Lebar   : "); lebar = input.nextInt();
                    System.out.print("Input Tinggi  : "); tinggi = input.nextInt();
                    Balok balok = new Balok (panjang, lebar, tinggi);
                    balok.setTinggiBalok(tinggi);
                    System.out.println();
                    System.out.println("Luas Persegi Panjang     : " + balok.hitungLuas());
                    System.out.println("Keliling Persegi Panjang : " + balok.hitungKeliling());
                    System.out.println("Luas Permukaan Balok     : " + balok.hitungLuasPermukaan());
                    System.out.println("Volume Balok             : " + balok.hitungVolume());
                }case 2->{
                    System.out.println("");
                    System.out.print("Input Jari-Jari : "); jari = input.nextInt();
                    System.out.print("Input Tinggi    : "); tinggi = input.nextInt();
                    Tabung tabung = new Tabung (jari, tinggi);
                    tabung.tinggiTabung(tinggi);
                    System.out.println();
                    System.out.println("Luas Lingkaran        : " + tabung.hitungLuas());
                    System.out.println("Keliling Lingkaran    : " + tabung.hitungKeliling());
                    System.out.println("Luas Permukaan Tabung : " + tabung.hitungLuasPermukaan());
                    System.out.println("Volume Tabung         : " + tabung.hitungVolume());                
                }case 0->{
                    System.exit(0);
                }default->{
                    System.out.println("Pilihan Tidak Ada! Input Pilihan Yang Tersedia");
                }
            }
            System.out.println();
            System.out.print("Kembali Ke Menu Utama (Y/N) : ");
            Scanner input2 = new Scanner(System.in);
            ulang=input2.next();
            String bigBack = "Y";
            String smallBack = "y";
            if(bigBack.equals(ulang) || smallBack.equals(ulang)){
                kembali = true;
            }else{
                System.exit(0);
            }
            System.out.println();
        }while(kembali);
    }
}