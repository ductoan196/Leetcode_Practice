package org.example;

public class Main {
    public static void reverseString(char[] s) {
        int[] alphabet = new int['z'-'a'+1];
        char[]newS = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            if (s[i]>44 & s[i]<90){
                s[i]+= 32;
            }
            newS[i] = s[s.length-i-1];
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = newS[i];
        }

        for (int i = 0; i < s.length; i++) {
            s[i] = s[s.length-i-1];
            if (s[i]>44 & s[i]<90){
                s[i]+= 32;
            }
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        System.out.println(s.length);
        reverseString(s);
        for (char character: s){
            System.out.println(character);
        }
    }

}