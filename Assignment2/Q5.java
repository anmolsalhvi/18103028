package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter size of first array "); int size1=scan.nextInt();
        System.out.println("Enter size of second array "); int size2=scan.nextInt();

        int arr1[]=new int[size1];
        int arr2[]=new int[size2];

        System.out.println("Enter elements of first array ");
        for(int i=0;i<size1;i++)
        {
            int a=scan.nextInt();
            arr1[i]=a;
        }

        System.out.println("Enter elements of second array ");
        for(int i=0;i<size2;i++)
        {
            int a=scan.nextInt();
            arr2[i]=a;
        }

        int[] temp1=new int[size1];
        for(int i=0;i<size1;i++)
        {
            temp1[i]=arr1[i];
        }

        int[] temp2=new int[size2];
        for(int i=0;i<size2;i++)
        {
            temp2[i]=arr2[i];
        }

        long startingtime=System.currentTimeMillis();

        for(int i=0;i<size1;i++)
        {
            for(int j=i+1;j<size1;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }

        for(int i=0;i<size2;i++)
        {
            for(int j=i+1;j<size2;j++)
            {
                if(arr2[i]>arr2[j])
                {
                    int temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }

        //union
        System.out.println("Union : ");
        for(int i=0, j=0;i<size1 || j<size2;)
        {
            if(i>=size1)
            {
                System.out.print(arr2[j]+" ");
                j++;
            }
            else if(j>=size2)
            {
                System.out.print(arr1[i]+" ");
                i++;
            }
            else
            {
                if(arr1[i]<arr2[j])
                {
                    System.out.print(arr1[i]);
                    i++;
                }
                else
                {
                    System.out.print(arr2[j]);
                    j++;
                }
            }
            System.out.print(" ");
        }

        System.out.println();

        //intersection
        System.out.println("Intersection : ");
        for(int i=0, j=0;i<size1 && j<size2;)
        {
            if(arr1[i]==arr2[j])
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if(arr1[i]>arr2[j])
            {
                j++;
            }
            else i++;
        }

        System.out.println();

        //complement of array1
        System.out.println("Complement of array 1 : ");
        for(int i=0;i<11;i++)
        {
            int flag=0;
            for(int j=0;j<size1;j++)
            {
                if(arr1[j]==i)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.print(i+" ");
            }
        }

        System.out.println();

        //complement of array2
        System.out.println("Complement of array 2 : ");
        for(int i=0;i<11;i++)
        {
            int flag=0;
            for(int j=0;j<size2;j++)
            {
                if(arr2[j]==i)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.print(i+" ");
            }
        }

        long endingtime=System.currentTimeMillis();

        long time1=endingtime-startingtime;

        startingtime=System.currentTimeMillis();

        System.out.println();

        //union
        Set<Integer> union = new HashSet<>();
        for(int x:temp1) union.add(x);
        for(int x:temp2) union.add(x);

        System.out.println("Union : ");
        for(int x:union) System.out.print(x+" ");

        System.out.println();

        //intersection
        Set<Integer> intersection = new HashSet<>();
        Set<Integer> t = new HashSet<>();

        System.out.println("Intersection : ");

        for(int x:temp1) t.add(x);
        for(int x:temp2)
        {
            if(t.contains(x)) System.out.print(x+" ");
        }

        System.out.println();

        //complement of array1
        Set<Integer> s1 = new HashSet<>();
        for(int x:temp1) s1.add(x);
        System.out.println("Complement of array 1 : ");
        for(int i=0;i<11;i++)
        {
            if(!s1.contains(i))
                System.out.print(i+" ");
        }

        System.out.println();

        Set<Integer> s2=new HashSet<>();
        for(int x:temp2) s2.add(x);
        System.out.println("Complement of array 2 : ");
        for(int i=0;i<11;i++)
        {
            if(!s2.contains(i))
                System.out.print(i+" ");
        }

        endingtime=System.currentTimeMillis();

        long time2=endingtime-startingtime;

        System.out.println();
        
        System.out.println("Time taken using arrays : " + time1);
        System.out.println("Time taken using efficient Hash sets : " + time2);


        scan.close();
    }

}
