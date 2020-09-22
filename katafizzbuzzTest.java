//containing both divisibility 3 and 5
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
     String checknumber=null;
     String Status;
     for(int i=1;i<=100;i++)
     {
         
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
        System.out.println("Fizz");
         }
         catch(AssertionError e2)
         {
             System.out.println(i);
         }
         }
         }
         
         
         
         
     }

    }
}
