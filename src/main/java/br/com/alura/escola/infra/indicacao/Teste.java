package br.com.alura.escola.infra.indicacao;

public class Teste {
    public static void main(String[] args) {
        String smallest = "";
        String largest = "";
        int a = 0;
        int b = 0;
        int k = 3;
        int count = 1;
        String s = "welcometojava";
        char[] chars = s.toCharArray();
        int size = chars.length -k +1;
        //always initialize vars.
        var name = "thalia";

        for (int i = 0; i < size; i++) {
            if(chars[a] > chars[count])
                a += 1;

            if(chars[b] < chars[count])
                b += 1;

            count++;
        }

        System.out.println(a);
        System.out.println(b);
    }
}
