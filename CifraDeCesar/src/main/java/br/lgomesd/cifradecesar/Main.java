package br.lgomesd.cifradecesar;

import java.io.IOException;
import java.util.Scanner;

 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char alfabetoChar[] = alfabeto.toCharArray();
                
        Scanner ler = new Scanner(System.in);
                
        int N = ler.nextInt();
        
        for(int a=1;a<=N;a++){
            
                   
            String sentencaCodString = ler.next();
            char sentencaDecod[] = new char[sentencaCodString.length()];
            
            int nCifra = ler.nextInt();
            
            for(int i=0;i<sentencaCodString.length();i++)
                for(int x=0;x<alfabetoChar.length;x++){
                    if(x-nCifra >= 0){
                        if(alfabetoChar[x] == sentencaCodString.charAt(i)){
                            sentencaDecod[i] = alfabetoChar[x-nCifra];
                            break;
                        }
                    }
                    if(x-nCifra < 0){
                        if(alfabetoChar[x] == sentencaCodString.charAt(i)){
                            int b = (x-nCifra)*-1;
                            int y = 26-b;
                            sentencaDecod[i] = alfabetoChar[y];
                            break;
                        }
                    }
                }

            System.out.println(sentencaDecod);

        }
 
    }
 
}