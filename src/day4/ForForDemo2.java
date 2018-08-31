package day4;

//需求：请输出下列的形状
//*
//**
//***
//****
//*****
public class ForForDemo2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
