/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tugas_uts;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Tugas_uts {

    public static void main(String[] args) {
        dokter DOK = new dokter();
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("masukkan id dokter : ");
        String ID = dtIN.nextLine();
        DOK.Setiddos(ID);
        
        System.out.print("masukkan nama dokter : ");
        String NM = dtIN.nextLine();
        DOK.Setnama(NM);
        
        System.out.print("alamat : ");
        String ALMT = dtIN.nextLine();
        DOK.Setalamat(ALMT);
        
        System.out.print("spesialisasi : ");
        String SP = dtIN.nextLine();
        DOK.Setmatkul(SP);
        
        System.out.print("jadwal pengobatan : ");
        String JD = dtIN.nextLine();
        DOK.Sethari(JD);
        
        System.out.println("id dokter : " + ID);
        System.out.println("nama dokter yg menangani : " + NM);
        System.out.println("alamat rumah : " + ALMT);
        System.out.println("spesialisasi yang di tawarkan : " + SP);
        System.out.println("pada hari : " + JD);
        
    }
}
