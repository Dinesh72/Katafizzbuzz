//stage 2 contains 3 and 5
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pravin
 */
class  fizzbuzz{

    public static boolean contains_3(int number)
    {
     if(number%10==3)
         return true;
         else
         return false;
    }
    public static boolean contains_5(int number)
    {
     if(number%10==5)
         return true;
         else
         return false;
    }
    public boolean isDivisibleby_3and5(int number)
{
    Boolean status=false;
    Integer checknumber;
   if(number%3==0 && number%5==0)
   {
       status=true;
   }
   else
   {
       status=false;
   }
    
    return status;
    
}
public boolean isDivisibleby_3(int number)
{
    Boolean status=false;
    Integer checknumber;
   if(number%3==0)
   {
       status=true;
   }
   else
   {
       status=false;
   }
    
    return status;
    
}
public boolean isDivisibleby_5(int number)
{
    Boolean status=false;
    Integer checknumber;
   if(number%5==0)
   {
       status=true;
   }
   else
   {
       status=false;
   }
    
    return status;
    
}
}
