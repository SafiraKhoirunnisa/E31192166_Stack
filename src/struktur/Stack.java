/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struktur;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Safira
 */
public class Stack {
    private List<Object> list=new ArrayList<Object>();
    private int currentIndex=-1;
   
    public void push(Object object){ //memasukkan data
        list.add(object);
        currentIndex++;
       
    }
    public Object pop(){ //mengambil / mengeluarkan data
        Object object=list.remove(currentIndex);
        currentIndex--;
        return object;
}
 public int count(){ //Menghitung Panjang Stack
     return list.size();
 
    }
 public Object peek(){ //Untuk Melihat Elemen Paling Atas
     return list.get(currentIndex);
     
 }
 public void clear(){ //mengosongkan stack
     list.clear();
     currentIndex=-1;
 }
   
}