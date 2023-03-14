/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private int tinggi;
    public Balok(int panjang, int lebar, int tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public int getTinggiBalok(){
        return tinggi;   
    }
    
    public void setTinggiBalok(int tinggi){
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume(){
        return super.hitungLuas()*this.tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        return  2* (super.hitungLuas() + getTinggiBalok() * super.lebar + super.panjang * getTinggiBalok());
    }   
}