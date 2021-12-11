package com.javaex.basic;

public class Types {
	public static void main(String[] args) {
//		intLongEx();
//		floatDoubleEx();
//		charEx();
//		boolenEx();
//		promotionEX();
		castingEX();
	}
	// �삎 蹂��솚(Casting)
	private static void castingEX() {
		// �몴�쁽 踰붿쐞媛� �꼻�� �옄猷� -> �몴�쁽 踰붿쐞 醫곸� �옄猷�
		// 紐낆떆�쟻�쑝濡� 蹂��솚�빐以섏빞
		float f = 123.456f;
		System.out.println(f);
		
		int i = (int)f;
		System.out.println(i);
		
		int i2 = 1234567890;
		System.out.println(Integer.toBinaryString(i2));
		
		short s = (short)i2;
		System.out.println(Integer.toBinaryString(s));
		
		// �삎 蹂��솚�떆 �옄猷� �쑀�떎�씠 �씪�뼱�궇 �닔 �엳�쑝誘�濡� 諛섎뱶�떆 二쇱쓽�빐�빞 �븳�떎.
		
	}
	// �삎 蹂��솚(Promotion)
	private static void promotionEX() {
		// �몴�쁽 踰붿쐞 醫곸� �옄猷� -> �몴�쁽 踰붿쐞 �꼻�� �옄猷�
		// �옄�룞�쑝濡� 蹂��솚
		byte b = 25; //1諛붿씠�듃 �젙�닔
		System.out.println(b);
		
	    short s = b; // 2諛붿씠�듃 �젙�닔
	    System.out.println(s);
	    
	    int i = s; //4諛붿씠�듃 �젙�닔
	    System.out.println(i);
	    
	    float f = i; // 4諛붿씠�듃 �떎�닔
	    System.out.println(f);
	}
	
	// �끉由ы삎 : 李� or 嫄곗쭞
	private static void boolenEx() {
		boolean b1 = true; // 李�
		boolean b2 = false; // 嫄곗쭞
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean result;
		
		int var1 = 3;
		int var2 = 5;
		
		result = var1 < var2; // 鍮꾧탳 �뿰�궛 or �끉由� �뿰�궛 寃곌낵
		System.out.println(var1 + "<" + var2 + "=" + result);
		
		
	}
	
	// 臾몄옄�삎 ���엯 : 遺��샇 �뾾�뒗 �젙�닔(2諛붿씠�듃 : 肄붾뱶)
	private static void charEx() {
		char ch1 = 'A';
		char ch2 = 'B';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// ch1 4湲��옄 �뮘
		System.out.println((char)(ch1 + 4));
	}
	
	// �떎�닔�삎 ���엯
	private static void floatDoubleEx() {
		// flolat(4) < double(8)
		
		float floatVar = 3.14159f; // F or f
		double doubleVar = 3.14159;
		
		floatVar = 0.1234567890123456789f;
		doubleVar = 0.1234567890123456789;
		
		System.out.println("float:" + floatVar);
		System.out.println("double:" + doubleVar);
		// �젙諛��룄 �룷湲�, �몴�쁽 踰붿쐞 �꼻�엺 寃�
		System.out.println(0.1 * 3);
		
		// 吏��닔 �몴湲곕쾿(e)
		floatVar = 3E-6F; // 3 * 10^-6
		System.out.println(floatVar);
	}
	// �젙�닔�삎 ���엯
	public static void intLongEx() {
		// byte(1) < short(2) < int(4:default) < long(8);
		int intVar1; // �꽑�뼵
		int intVar2; // �꽑�뼵
		
		intVar1 = 2021; // 珥덇린�솕
//		intVar2  = 12345678901234; 踰붿쐞 珥덇낵�뿬�꽌 �뿉�윭�궃�떎.
	    System.out.println(intVar1);
	    
	    long logVar1 = 2021; // �꽑�뼵 + 珥덇린�솕
	    long logVar2 = 12345678901234L;// L or l�쓣 �쁿�뿉 �쟻�뼱以��떎.
	    
	    // 2吏꾩닔, 8吏꾩닔, 16吏꾩닔
	    int bin, oct, hex;
	    bin = 0b1101;  // 2吏꾩닔 0b
	    oct = 072;     // 8吏꾩닔 0
	    hex = 0xFF;    // 16吏꾩닔 0x
	    
	    System.out.println(bin);
	    System.out.println(oct);
	    System.out.println(hex);
	    
	    
	    
		
	}

}
