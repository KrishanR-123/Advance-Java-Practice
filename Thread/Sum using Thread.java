package com.company;

import java.util.Scanner;
import java.lang.Thread;

class sum extends Thread
{
    Scanner s = new Scanner(System.in);
    public void run()
    {   int a;
        int b;
        a=s.nextInt();
        b=s.nextInt();
       System.out.println(a+b);
        System.out.println(Thread.currentThread());
    }
}

class Main
{
    public static void main(String[] args)
    {
      Thread th=new Thread (new sum());

        System.out.println(Thread.currentThread());
        System.out.println(th.getName());
      th.start();


    }
}
