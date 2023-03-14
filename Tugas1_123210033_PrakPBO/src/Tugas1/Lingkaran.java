/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

import static java.lang.Math.PI;

/**
 *
 * @author ASUS
 */
public class Lingkaran implements MenghitungBidang{
    int jari;
    public Lingkaran(int jari){
        this.jari = jari;
    }
    
    @Override
    public double hitungLuas(){
        return PI * jari * jari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2 * PI * jari;
    }
}