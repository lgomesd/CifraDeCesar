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
        String sentencaCodString;
        String sentencaCodArray[] = new String[50];
        int nCifra;
        Scanner lerCasos = new Scanner(System.in);
        Scanner lerCifra = new Scanner(System.in);
        Scanner lerStr = new Scanner(System.in);
        
        System.out.println("Entre com o número de casos de teste");
        nCasos = lerCasos.nextInt();
        
        System.out.println("Entre com a cifra");
        nCifra = lerCifra.nextInt();
        
        
        System.out.println("Entre com a mensagem codificada");
        sentencaCodString = lerStr.nextLine();
        
        for(int a=0;a<nCasos;a++)
            for(int i=0;i<sentencaCodString.length();i++)
                for(int x=0;x<alfabetoChar.length;x++){
                    if(x-nCifra >= 0){
                        if(alfabetoChar[x] == sentencaCodString.charAt(i)){
                            System.out.println("Alfabeto: " + alfabetoChar[x]);
                            System.out.println("Sentenca String: " + sentencaCodString.charAt(i));
                            sentencaDecod[i] = alfabetoChar[x-nCifra];
                            System.out.println("Decode: " + sentencaDecod[i]);
                            break;
                        }
                    }
                    if(x-nCifra < 0){
                        if(alfabetoChar[x] == sentencaCodString.charAt(i)){
                            System.out.println("Alfabeto: " + alfabetoChar[x]);
                            System.out.println("Sentenca String: " + sentencaCodString.charAt(i));
                            int b = (x-nCifra)*-1;
                            int y = 26-b;
                            sentencaDecod[i] = alfabetoChar[y];
                            System.out.println("Decode: " + sentencaDecod[i]);
                            System.out.println("b: " + b);
                            System.out.println("y: " + y);
                            break;
                        }
                    }
                }

            System.out.println(sentencaDecod);

            //for(int i=0;i<sentencaV.length;i++)
             //   System.out.print(sentencaV[i]);
    }
    
}
