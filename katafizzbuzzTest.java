//stage 2 contains 3 and 5
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pravin
 */
public class katafizzbuzzTest {
    
    

    @Test
     public void fizzbuzztest() {
     fizzbuzz test1=new fizzbuzz();
     
     
     for(int i=1;i<=100;i++)
     {
         
         try{
        Assert.assertTrue(test1.contains_3(i));
        System.out.println("Fizz contains 3");
         }
         catch(AssertionError e4)
         {
            try{
        Assert.assertTrue(test1.contains_5(i));
        System.out.println("Buzz contains 5");
         }
         catch(AssertionError e5)
         {
             
          
         }
         
         try{
        Assert.assertTrue(test1.isDivisibleby_3and5(i));
        System.out.println("FizzBuzz");
         }
         catch(AssertionError e)
         {
           try{
               
        Assert.assertTrue(test1.isDivisibleby_3(i));
        System.out.println("Fizz");
         }
         catch(AssertionError e2)
         {
             try{
               
        Assert.assertTrue(test1.isDivisibleby_5(i));
        System.out.println("Buzz.");
         }
         catch(AssertionError e3)
         {
             System.out.println(i);
         }
         }
         }
         
         
         }
         
     }

    }
}

