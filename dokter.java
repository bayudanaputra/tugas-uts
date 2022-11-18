/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_uts;

/**
 *
 * @author Acer
 */
public class dokter {
    
    private String IDDOK, NAMA, ALAMAT, SPES, JAD;
    
    public void Setiddos(String iddos){
        this.IDDOK = iddos;
    }
    public void Setnama(String nama){
        this.NAMA = nama;
    }
    public void Setalamat(String alamat){
        this.ALAMAT = alamat;
    }
    public void Setmatkul(String matkul){
        this.SPES = matkul;
    }
    public void Sethari(String hari){
        this.JAD = hari;
    }
    public String Getiddos(){
        return this.IDDOK;
    }
    public String Getnama(){
        return this.NAMA;
    }
    public String Getalamat(){
        return this.ALAMAT;
    }
    public String Getmatkul(){
        return this.SPES;
    }
    public String Gethari(){
        return this.JAD;
    }
}