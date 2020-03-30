package core;

import static org.junit.Assert.*;
import org.junit.*;

public class CalcTest {

static double divide(double a, double b)                      {return a / b;}
static double divide(double a, double b, double c)            {return a / b / c;}
static double divide(double a, double b, double c, double d)  {return a / b / c / d;}

static double divide(double a, double b, double c, double d, double e)  {return a / b / c / d / e;}
static double divide(double a, double b, double c, double d, double e, double f)  {return a / b / c / d/ e /f;}
static double divide(double a, double b, double c, double d, double e, double f, double g)  {return a / b / c / d/ e/ f/ g;}


static double add(double a, double b)                          {return a + b;}
static double add(double a, double b, double c)                {return a + b + c;}
static double add(double a, double b, double c, double d)      {return a + b + c + d;}

static double add(double a, double b, double c, double d, double e)  {return a + b + c + d + e;}
static double add(double a, double b, double c, double d, double e, double f)  {return a + b + c + d + e + f;}
static double add(double a, double b, double c, double d, double e, double f, double g)  {return a + b + c + d + e + f + g;}


static double subtract(double a, double b)                     {return a - b;}
static double subtract(double a, double b, double c)           {return a - b - c;}
static double subtract(double a, double b, double c, double d) {return a - b - c - d;}

static double subtract(double a, double b, double c, double d, double e)  {return a - b - c - d - e;}
static double subtract(double a, double b, double c, double d, double e, double f)  {return a - b - c - d - e - f;}
static double subtract(double a, double b, double c, double d, double e, double f, double g)  {return a - b - c - d - e - f - g;}

static double multiply(double a, double b)                     {return a * b;}
static double multiply(double a, double b, double c)           {return a * b * c;}
static double multiply(double a, double b, double c, double d) {return a * b * c * d;}

static double multiply(double a, double b, double c, double d, double e)  {return a * b * c * d * e;}
static double multiply(double a, double b, double c, double d, double e, double f)  {return a * b * c * d * e * f;}
static double multiply(double a, double b, double c, double d, double e, double f, double g)  {return a * b * c * d * e * f * g;}

@Test 
public void test_01() {assertEquals("Method divide is not correct", divide(90.0, 7.0), 12.9, 0.09);}
@Test 
public void test_02() {assertEquals("Method divide is not correct", divide(90.0, 7.0, 3.02), 4.26, 0.09);}
@Test 
public void test_03() {assertEquals("Method divide is not correct", divide(190.0, 7.0, 5.2, 5.2), 1.00, 0.09);}
@Test 
public void test_04() {assertEquals("Method divide is not correct", divide(256.0, 7.0, 2.0, 3.0, 6.0 ), 1.02, 0.09);}
@Test 
public void test_05() {assertEquals("Method divide is not correct", divide(5690.0, 7.0, 15.0, 2.0, 3.0, 3.0 ), 3.01, 0.09);}
@Test 
public void test_06() {assertEquals("Method divide is not correct", divide(5690.0, 7.0, 15.0, 2.0, 3.0, 3.0, 3.0), 1.00, 0.09);}


@Test 
public void test_07() {assertEquals("Method add is not correct", add(60.0, 5.0, 7.0), 72.0, 0.09);}
@Test 
public void test_08() {assertEquals("Method add is not correct", add(60.0, 5.0, 7.0, 10.0), 82.0, 0.09);}
@Test 
public void test_09() {assertEquals("Method add is not correct", add(60.0, 5.0, 7.0, 10.0, 10.0), 92.0, 0.09);}
@Test 
public void test_10() {assertEquals("Method add is not correct", add(60.0, 5.0, 7.0, 10.0, 10.0, 20.0), 112.0, 0.09);}
@Test 
public void test_11() {assertEquals("Method add is not correct", add(60.0, 5.0, 7.0, 10.0, 10.0, 20.0, 30.0), 142.0, 0.09);}
@Test 
public void test_12() {assertEquals("Method add is not correct", add(60.0, 5.0), 65.0, 0.09);}

@Test 
public void test_13() {assertEquals("Method subtract is not correct", subtract(100.0, 22.0), 78.0, 0.09);}
@Test 
public void test_14() {assertEquals("Method subtract is not correct", subtract(100.0, 22.0, 10.0), 68.0, 0.09);}
@Test 
public void test_15() {assertEquals("Method subtract is not correct", subtract(100.0, 22.0, 10.0, 18.0), 50.0, 0.09);}
@Test 
public void test_16() {assertEquals("Method subtract is not correct", subtract(100.0, 22.0, 10.0, 18.0, 10.0), 40.0, 0.09);}
@Test 
public void test_17() {assertEquals("Method subtract is not correct", subtract(100.0, 22.0, 10.0, 18.0, 10.0, 20.0), 20.0, 0.09);}
@Test 
public void test_18() {assertEquals("Method subtract is not correct", subtract(100.0, 22.0, 10.0, 18.0, 10.0, 20.0, 5.0), 15.0, 0.09);}

@Test 
public void test_19() {assertEquals("Method multiply is not correct", multiply(9.0, 5.0), 45.0, 0.09);}
@Test 
public void test_20() {assertEquals("Method multiply is not correct", multiply(9.0, 5.0, 2.0), 90.0, 0.09);}
@Test 
public void test_21() {assertEquals("Method multiply is not correct", multiply(9.0, 5.0, 2.0, 11.0), 990.0, 0.09);}
@Test 
public void test_22() {assertEquals("Method multiply is not correct", multiply(9.0, 5.0, 2.0, 11.0, 2.0), 1980.0, 0.09);}
@Test 
public void test_23() {assertEquals("Method multiply is not correct", multiply(9.0, 5.0, 2.0, 11.0, 2.0, 10.0), 19800.0, 0.09);}
@Test 
public void test_24() {assertEquals("Method multiply is not correct", multiply(9.0, 5.0, 2.0, 11.0, 2.0, 10.0, 4.0), 79200.0, 0.09);}


}