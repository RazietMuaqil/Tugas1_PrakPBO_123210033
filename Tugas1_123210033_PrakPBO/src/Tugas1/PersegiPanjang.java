/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang implements MenghitungBidang{
    int panjang, lebar;
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;  
    }

    @Override
    public double hitungKeliling(){
        return 2 * (panjang + lebar);  
    }
}