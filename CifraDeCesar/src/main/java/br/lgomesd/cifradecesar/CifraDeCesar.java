/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lgomesd.cifradecesar;

import java.util.Scanner;

/**
 *
 * @author lgome
 */
public class CifraDeCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String alfabeto[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char alfabetoChar[] = alfabeto.toCharArray();
        int nCasos = 0;
        char sentencaDecod[] = new char[50];
        String sentencaCodString = new String();
        String sentencaCodArray[] = new String[50];
        int nCifra;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Entre com o número de casos de teste");
        nCasos = ler.nextInt();
        
        System.out.println("Entre com a cifra");
        nCifra = ler.nextInt();
        
        Scanner lerStr = new Scanner(System.in);
        System.out.println("Entre com a mensagem codificada");
        sentencaCodString = lerStr.nextLine();
        
        for(int i=0;i<=sentencaCodString.length();i++)
            for(int x=0;x<=alfabetoChar.length;x++)
                if(alfabetoChar[x] == sentencaCodString.charAt(i)){
                    sentencaDecod[i] = alfabetoChar[x];
                    break;
                }
                    
        System.out.println(sentencaDecod);
          
        //for(int i=0;i<sentencaV.length;i++)
         //   System.out.print(sentencaV[i]);
    }
    
}
