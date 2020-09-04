package com.company;

import java.util.Scanner;

public class Main {

    static void sort(int [] array, int n)
    {
        int [] count=new int[21];

        for(int i=0;i<n;i++)
        {
            count[array[i]]++;
        }

        int j=0;
        for(int i=1;i<21;i++)
        {
            while(count[i]--!=0)
            {
                array[j]=i;
                j++;
            }
        }
    }

    public static void main(String[] args) {

	    int n;
	    Scanner scanner=new Scanner(System.in);

	    //taking input
        System.out.println("Enter size of array: ");
	    n=scanner.nextInt();
	    int[] array=new int[n];
	    for(int i=0;i<n;i++) array[i]=scanner.nextInt();

	    sort(array, n);

        System.out.println("Modified Array: ");
	    for(int i=0;i<n;i++) System.out.print(array[i]+" ");

	    scanner.close();

    }
}
