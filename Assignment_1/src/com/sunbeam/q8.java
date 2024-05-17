package com.sunbeam;
import java.util.Scanner;
public class q8
{
	    public static void main(String[] args)
	     {
	        int arr[]={ 10, 20, 15, 3, 4, 4, 1 };
	       Scanner sc=new Scanner(System.in);
	       System.out.println("The Rank is -");
	        int count=0;
	        int Rank=sc.nextInt();
	        for(int i=0;i<arr.length;i++)
	        {
	                if(Rank>=arr[i])
	                {
	                    count++;
	                }
	             
	        }
	        System.out.println(" The Rank of " +Rank+ " is " +count);
	        
	    }
	}
