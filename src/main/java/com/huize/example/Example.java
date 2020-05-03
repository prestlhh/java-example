package com.huize.example;

public class Example{
	
	public static void main(String[] args){
		int a = 6;
		int b = 6;
		System.out.println("hello world!");
		System.out.println(a + "+" + b + "=" + add(a, b));
	}
	
	public static int add(int a, int b){
		return a + b;	
	}
	
	public static void print(String content){
		System.out.println(content);
	}
}
