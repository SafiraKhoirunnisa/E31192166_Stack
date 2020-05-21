/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur;
//Import sebagai library, dan java .io. bufferedreader  untuk membaca inputan dari java. Io. stream reader.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/**
 *
 * @author Safira
 */
public class E31192166_Stack {
    public static void main(String[] args) throws IOException{ //IOException  itu digunakan untuk menghandler bug
        Stack lifo = new Stack(); //membuat file baru yang berisikan stack kosong yang di namakan “lifo”
        System.out.println("===================================");
        System.out.println("== Selamat Datang di Program Stack ==");
        System.out.println("===================================");
        System.out.print("Berapa data yang ingin dimasukkan kedalam Stack : ");
        BufferedReader masuk = new BufferedReader (new InputStreamReader(System.in)); //untuk menangkap inputan, yang dideklarasikan
        String test = masuk.readLine();
        int x = Integer.parseInt(test); //input masuk yang bertipe data string, akan di ubah ke tipedata integer dan di deklarasikan sebagai variable x
        
        for (int a=x; a>0; --a){ //for (integer a sama dengan x ; jika a lebih besar dari 0 maka a= a-1) akan menampilkan “masukan push stack : “
            System.out.print("Masukkan push stack : ");
            String test1 = masuk.readLine(); //untuk memasukan data yang di simpan dalam variabel test
            lifo.push (test1); //input yang di masukan, di deklarasikan variable “test1” kedalam stack  lifo
        }
        System.out.println("Stack : " + lifo);
        System.out.println("top : " + lifo.peek());
        System.out.println("noel : " + lifo.size());
        System.out.print("Berapa kali ingin melakukan pop : ");
        String b = masuk.readLine(); //menampilkan “berapa kali ingin melakukan pop : “ dan di deklarasikan sebagai “b” yang bertipe data string
        int c = Integer.parseInt(b); //input b yang dimasuk yang bertipe data string, akan di ubah ke tipedata integer dan di deklarasikan sebagai variable c
        for (int d=c; d>0; --d){ //d adalah bilangan bulat nilai sama dengan nilai c yaitu integer, jika d> 0 lakukan perulangan d = d-1
            System.out.println("pop : " + lifo.pop());
            System.out.println("stack : " + lifo);
        }
        System.out.println("top : " + lifo.peek());
        System.out.println("noel : " + lifo.size());
        System.out.println("Terimakasih Atas Kunjungannya!!");
            
        }
    }