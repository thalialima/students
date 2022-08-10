package br.com.alura.escola.dominio.indicacao;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SimpleCalculator {
    public int add(int numberA, int numberB) {

        String test = "thalia";
        String substring = test.substring(2);
        char[] chars = substring.toCharArray();
        int a;
        int b;

        for (int i = 0; i < chars.length -1; i++) {
            if(chars[i] < chars[++i]){
                a = i;
            }
            if(chars[i] > chars[++i]){
                b = i;
            }
        }

        char[] chars1 = test.toCharArray();



        return numberA * numberB;



    }

}
