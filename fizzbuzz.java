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
        return ((number%10==3?true:false));

    }
    public static boolean contains_5(int number)
    {
        return ((number%10==5?true:false));

    }
    public static boolean isDivisibleby_3and5(int number)
{
    return ((number%3==0) && (number%5==0) ?true:false);

}
public static boolean isDivisibleby_3(int number)
{
    return ((number%3==0?true:false));

    
}
public static boolean isDivisibleby_5(int number)
{
    return ((number%5==0?true:false));

}
}
