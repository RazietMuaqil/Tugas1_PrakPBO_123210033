/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    int tinggi;
    public Tabung(int jari, int tinggi){
        super(jari);
        this.tinggi = tinggi;
    }
    
    public int tinggiTabung(int tinggi){
        return tinggi;
    }
    
    public double tinggiTabung(double tinggi){
        return tinggi;
    }
     
    @Override
    public double hitungVolume(){
        return super.hitungLuas()* tinggiTabung(this.tinggi);
    }

    @Override
    public double hitungLuasPermukaan(){
        return super.hitungKeliling()* (jari + tinggiTabung(this.tinggi));
    }
}