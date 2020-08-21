package com.company;
import java.util.Scanner;
public class Main {

    static void simplify(char[] a)
    {
        int size = a.length;
        for(int i = 0; i < size; i++ ) {
            for(int j = i+1; j < size; j++) {
                if(a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = (char) temp;
                }
            }
        }
    }

    static boolean anagrams(String a, String b)
    {
        char a1[]=a.toCharArray();
        char a2[]=b.toCharArray();
        simplify(a1);
        simplify(a2);
        for(int i=0;i<a.length();i++)
        {
            if(a1[i]==a2[i]) continue;
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First String : ");
        String a=scanner.next();
        System.out.println("Enter Second String : ");
        String b=scanner.next();
        if(anagrams(a, b))
        System.out.println("Both the strings are anagrams.");
        else System.out.println("Both the strings are not anagrams.");
    }
}
