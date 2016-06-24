/*
  File: Hailstone.java

  Description: User enters date to find out the day of the week

  Student Name: Kevin Yan

  Student UT EID: ky4239

  Course Name: CS 312

  Unique Number: 87525

  Date Created: 6/23/2016

  Date Last Modified: 6/23/2016

*/

//To import Scanner
import java.util.*;

public class Hailstone
{
  public static void main(String[] args) 
  {
    //Create scanner object
    Scanner input = new Scanner(System.in);

    //Define variables
    int num1 = 0;
    int num2 = 0;

    //Prompt user for starting number and ending number
    do
    {
      System.out.print("Enter starting and ending number of the range: ");
      num1 = input.nextInt();
      num2 = input.nextInt();
    } while (num1 < 1 || num2 < 1 || num1 >= num2);

    int counter1 = num1;
    int iteration = 0;
    int maxIteration = 0;
    int maxNumber = 0;

    while(counter1 <= num2)
    {
      while(num1 > 1)
      {
        if(num1 % 2 == 0 && num1 != 1)
        {
          num1 = num1 / 2;
          iteration++; 
        }
        else if(num1 % 2 == 1 && num1 != 1)
        {
          num1 = (3 * num1) + 1;
          iteration++;
        }
      }
      if(iteration >= maxIteration)
      {
      maxIteration = iteration;
      maxNumber = counter1;
      }
      iteration = 0;
      counter1++;
      num1 = counter1;
    }

    System.out.println("\nThe number " + maxNumber + " has the longest cycle length of " + maxIteration + ".");
  }
}
