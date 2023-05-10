/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tekmiçiftmi;
import java.util.*;
/**
 *
 * @author Sıla
 */
public class Tekmiçiftmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    int dizi1[]=new int[10];
    int i;
    for( i=0;i<10;i++){
        dizi1[i]=scanner.nextInt();
    }
    System.out.println("{"+ dizi1 +"}");
    for(int n=1;n<=10;n++){
        if(dizi1[i]%2==0){
            System.out.println("Bu sayi çift");
        }
        else{
            System.out.println("Bu sayi tek");
        }
    }
    }
    
}
