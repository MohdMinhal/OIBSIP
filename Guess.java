import java.util.*;
class Guess 
{
    public static void main(String args[])
    {
        int ran = (int)(Math.random()*100+1);
        Scanner obj=new Scanner(System.in);
        int c=0;
        System.out.println("Welcome to Guess the Number \n Lets Start");
        while(true)
        {
            int n=obj.nextInt();
            c=c+1;
            if(c>9) 
            {
                System.out.println("Your Attempts are exhausted");
                break;
            }
            if(n==ran)
            {
                System.out.println("Congratulates you got the right No. in "+ c +" attempts");
                break;
            }
            else if(n<ran)
            {
                System.out.println("Enter No. is Lower");
            }
            else
                System.out.println("Enter No. is Higher");
        }

    }       
    
}