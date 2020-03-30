package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest {



	
	@Test
	public void test_01() 				{System.out.println("\t\tTest # 01");}
	@Test
	public void test_02() 				{System.out.println("\t\tTest # 02");}
	@Test
	public void test_03() 				{System.out.println("\t\tTest # 03");}
	@Test
	public void test_04() 				{System.out.println("\t\tTest # 04");}
	
	
	@BeforeClass
	public static void beforeClass()	{System.out.println("Before Class");}
	@AfterClass
	public static void afterClass()		{System.out.println("After Class");}
	@Before
	public void before() 				{System.out.println("\tBefore Test");}
	@After
	public void after()					{System.out.println("\tAfter Test");}

	
	
	
	
}
