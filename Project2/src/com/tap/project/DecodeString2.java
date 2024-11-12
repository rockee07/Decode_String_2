package com.tap.project;

import java.util.Scanner;

public class DecodeString2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String[] arr=s.split("");
		System.out.print(decodeString(arr));
		scan.close();
	}
	public static String decodeString(String[] arr) {
		StringBuilder sb=new StringBuilder();
		
		int count=0;
		for(int i=arr.length-1;i>=0;i--) {
			count++;
			if(count==2 && i>0) {
				sb.append(arr[i]+",");
				count=0;
			}
			else {
				sb.append(arr[i]);
			}
			
		}
		return sb.reverse().toString();
	}

}
