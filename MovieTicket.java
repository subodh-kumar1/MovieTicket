/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

import java.util.Scanner;

/**
 *
 * @author User
 */
class MyTheatre{
    String userName;
    MyTheatre(String name){
      userName = name;  
    }
    public void welcMethod()
    {
         System.out.println("Hi "+userName+" Welcome to Demo theatre");
    }
    String movies[] = {"Movie1","Movie2","Movie3"};
    private int movieMethod()
    {
        int i =1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Running movies are :");
        for(String movie:movies)
        {
          System.out.println(i+". "+movie);
          i++;
        }  
        System.out.println("Which movie?");
        int itr = scan.nextInt();
        return itr-1;
    }
    char choice;
    String shows[] = {"0900","1200","1500","1800","2100"};
     public void timeMethod()
    {
        int i =1, myind = movieMethod();
          
        System.out.println("Show timings for "+movies[myind]+" are : ");
        for(String show:shows)
        {
          System.out.println(i+". "+show+"hrs.");
          i++;
        }    
    }
}
public class MovieTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Hi Name:  ");
        String name= scan.next();
        MyTheatre mt = new  MyTheatre(name);
        mt.welcMethod();
 //       mt.movieMethod();
        mt.timeMethod();
        
    }
}
