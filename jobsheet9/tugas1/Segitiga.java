/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.jobsheet9.tugas1;

/**
 *
 * @author ASUS
 */
public class Segitiga {
    private int sudut;

    public void setSudut(int sudut){
        this.sudut = sudut;
    }
    public int getSudut(){
        return sudut;
    }

    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }
    public double keliling(int sisiA, int sisiB){
        return Math.sqrt( Math.pow(sisiA,2) + Math.pow(sisiB,2) );
    }
}