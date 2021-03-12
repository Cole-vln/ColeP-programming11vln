//import static org.junit.jupiter.api.Assertions.*;
package DataAbstractionAssignment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import  java.util.Date;
import java.io.PrintStream;

public class CustomerTest {
 @Before
 public void Before() {

 }

 @After
 public void After() {

 }

@Test
//checks if the expected string is equal to the printed string (the receipt)
 public void Deposittostring(){
 java.util.Date date1=new java.util.Date();
  Deposit d = new Deposit(100, date1, "Checking");
  String expected = "deposit of:$100.0 date:" + date1 + " into account:Checking";
  assertEquals(expected, d.toString());
 }

 @Test
 //checks if the expected string is equal to the printed string (the receipt)
 public void Withdrawtostring(){
  java.util.Date date1=new java.util.Date();
  Withdraw d = new Withdraw(100, date1, "Checking");
  String expected = "withdraw of:$100.0 date:" + date1 + " into account:Checking";
  assertEquals(expected, d.toString());
 }

 @Test
 public void Brokecustomer(){
  java.util.Date date1=new java.util.Date();
  Customer Alpha = new Customer("alpha", 47890, 100, 101);
  //checking overdraft method for Checking account
  assertEquals(0, Alpha.withdraw(400020, date1, "Checking"), 0.01);
  //checking regular withdrawals for Checking account
  assertEquals(55.0, Alpha.withdraw(45, date1, "Checking"), 0.01);
  //checking overdraft method for Saving account
  assertEquals(0, Alpha.withdraw(400020, date1, "Saving"), 0.01);
  //checking regular withdrawals for Saving account
  assertEquals(56.0, Alpha.withdraw(45, date1, "Saving"), 0.01);
  //checking for valid account type
  assertEquals(0, Alpha.withdraw(45, date1, "Chhecking"), 0.01);
  assertEquals(0, Alpha.withdraw(45, date1, "Saaving"), 0.01);
 }

 @Test
 public void Breadwinner(){
  java.util.Date date1=new java.util.Date();
  Customer Alpha = new Customer("alpha", 47890, 100, 101);
  //checking for valid account type
  assertEquals(0, Alpha.deposit(400020, date1, "Chhecking"), 0.01);
  assertEquals(0, Alpha.deposit(400020, date1, "Saaving"), 0.01);
  //checking regular deposit for Checking account
  assertEquals(145.0, Alpha.deposit(45, date1, "Checking"), 0.01);
  //checking regular deposit for Saving account
  assertEquals(146.0, Alpha.deposit(45, date1, "Saving"), 0.01);
 }

}