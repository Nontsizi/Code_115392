import java.util.*;

public class tipcalculator {
   public static void main(String [] args) {
      Scanner input = new Scanner(System.in);
      double amount;
      double tip;
      double service_rate;
      double total_amount;
      int number_of_people;
      double tip_per_person;
      double total_per_person;
      
      System.out.println("Enter the bill amoaunt");
      amount=input.nextDouble();
      System.out.println("\n0% if customer does not want to tip\n10%=bad \n20%=better \n30%=Outstanding");
      service_rate=input.nextDouble();
      System.out.println("Enter number of people");
      number_of_people=input.nextInt();

       if (service_rate==10){
         System.out.println("Good service");
         System.out.println("Your Tip =R ");
         tip=amount*service_rate/100;
         System.out.print(tip);
         total_amount=tip+amount;
         System.out.println("\nYour total =R");
      
         System.out.print(total_amount);
      }
    
      else if (service_rate==20){
         System.out.println("Very goood service");
         System.out.println("Your Tip =R");
         tip=amount*service_rate/100;
         System.out.print(tip);
         total_amount=tip+amount;
         System.out.println("\nYour total =R");
         System.out.print(total_amount);
      }
      
      else{
         System.out.println("Outstanding service");
         System.out.println("Your Tip =R");
         tip=amount*service_rate/100;
         System.out.print(tip);
         total_amount=tip+amount;
         System.out.println("\nYour total = R"); System.out.println(total_amount);
      }
     tip_per_person=service_rate/number_of_people;
    System.out.println("tip per person =R");
     System.out.println(tip_per_person); 
    total_per_person=tip_per_person+amount/number_of_people;
      System.out.println(" total per person=R");
       System.out.println( total_per_person); 

   }
}
/* 
  ----jGRASP exec: java tipcalculator
 Enter the bill amoaunt
 125423,00
 
 0% if customer does not want to tip
 10%=bad 
 20%=better 
 30%=Outstanding
 30
 Enter number of people
 5
 Outstanding service
 Your Tip =R
 37626.9
 Your total = R
 163049.9
 tip per person =R
 6.0
  total per person=R
 25090.6
 
  ----jGRASP: operation complete.
 */