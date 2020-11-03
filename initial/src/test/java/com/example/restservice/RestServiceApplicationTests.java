package com.example.restservice;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RestServiceApplicationTests {

	@Test
	public void contextLoads() {
		Object e = 1;
		String s = "";
		Integer a = 1;
		Integer b = 2;
		int c = 2000;
		System.out.println(a == b);
		Integer a1 = 1000;
		a1 = 2000;
		System.out.println(a1 == c);

	}

	@Test
	public void staticInitializationBlocks(){
		System.out.println("instatnce Members");
	}

	static {
		System.out.println("Static Initialization Blocks");
	}

	{
		System.out.println("Initializing Instance Members 1");
	}

	{
		System.out.println("Initializing Instance Member 2");
	}
}
