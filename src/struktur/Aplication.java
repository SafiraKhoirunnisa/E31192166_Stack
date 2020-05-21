/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur;
import struktur.Stack;
import java.util.List;
/**
 *
 * @author Safira
 */
public class Aplication {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("buku 12");
        stack.push("buku 25");
        stack.push("buku 27");
        stack.push("buku 49");
        stack.push("buku 57");
        stack.push("buku 26");
       
        int count=stack.count();
        Object object =stack.peek();
        System.out.println("======================");
        System.out.println("jumlah data pada stack "+ count);
        System.out.println("data terbatas pada stack "+ object);
       
       
        System.out.println("======================");
    }
}
