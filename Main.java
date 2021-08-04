import java.util.Scanner;
public class Main 
{
    Scanner sc = new Scanner(System.in);
   //function to checkPalindrome
    public void checkPalindrome()  
    {
        System.out.println("Enter the number to be checked whether it is palindrome or not");
        int n = sc.nextInt();
        int a,r,sum=0,flag =0;
        a = n;
        while(n>0)
        {
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
            if(sum == a)
            {
                flag = 1;
            }
            else
            {
                flag = 0;    
            }
        }
        if(flag==1)
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is not a palindrome number");
        }
    }
    //function to printPattern

    public void printPattern()
    {
        System.out.println("Enter the number for the pattern design");
        int n = sc.nextInt();
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n-i;++j)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //function to check no is prime or not
    public void checkPrimeNumber() 
    {
            System.out.println("Enter the number to check whether it is prime or not");
            int n = sc.nextInt();
            int i,m,a=0;
            m= n/2;
            if(n==0||n==1)
            {
                System.out.println("The number is not prime number.");
            }
            else
            {
                for(i=2;i<=m;i++)
                {
                    if(n%i ==0)
                    {
                        System.out.println("The number is not prime number.");
                        a = 1;
                        break;
                    }
                }
                if(a==0)
                {
                    System.out.println("The number is prime number.");
                }
            }
    }
    // function to print Fibonacci Series
    public void printFibonacciSeries() 
    {
        //initialize the first and second value as 0,1 respectively.
        int first = 0, second = 1;
        System.out.println("Enter the number to which fibonacci series to be displayed");
        int n = sc.nextInt();
        if(n==1)
        {
            System.out.println(first);
        }
        if(n==2)
        {
            System.out.println(second); 
        }
        if(n>2)
        {
            int point = 2;
            int sump = 0,sumn = 1;
            System.out.println(sump);
            System.out.println(sumn);
            while(point < n)
            {
                sump=sump+sumn;
                System.out.println(sump);
                sumn = sumn+sump;
                System.out.println(sumn);
                point+=1;            
            }
        }
        else
        {
            System.out.println("Invalid input");
        }

    }
    //main method which contains switch and do while loop
    public static void main(String[] args) 
    {
        Main obj = new Main();
        int choice;
        Scanner sc = new Scanner(System.in);
        do 
        {
            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n" + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
            System.out.println();
            choice = sc.nextInt();
            switch (choice) 
            {
                case 0:
                    choice = 0;
                    break;
                case 1: 
                {
                    obj.checkPalindrome();
                }
                break;
                case 2: 
                { 
                    obj.printPattern();
                }
                break;
                case 3: 
                {
                    obj.checkPrimeNumber();
                }
                break;
                case 4:
                {
                    obj.printFibonacciSeries();
                }
                break;
                default:
                System.out.println("Invalid choice. Enter a valid no.\n");
            }
        } while (choice != 0);
        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}