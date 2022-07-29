package singleTon_technique;

import org.apache.poi.util.RandomSingleton;

public class SingleTon_Generic_ClassTest {
	
		
		private static SingleTon_Generic_ClassTest singleTon;
		
		private SingleTon_Generic_ClassTest(String name)
		{
			System.out.println(name);
		}
		
		public void add (int a, int b)
		{
			System.out.println(a+b);
		}
		
		public static SingleTon_Generic_ClassTest accessClass()
		{
			singleTon =new SingleTon_Generic_ClassTest("ABCD");
			return singleTon;
			
		}
	}



