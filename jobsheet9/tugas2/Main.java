/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p.jobsheet9.tugas2;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Dosen();
        manusia.makan();
        
        manusia = new Mahasiswa();
        manusia.makan();
    }
}