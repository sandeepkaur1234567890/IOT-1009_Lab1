// Name: Sandeep Kaur
// Enrollement Number:
// In this program there are three dice d6,d10 and d20 using those dice I will make Dicegame.

import java.util.Random;
// this is my Die class
public class Die
{
      // Here I will create three variables name, number of sides and current side
      private String name;
      private int Number_of_sides;
      private int Current_side_up;

      // A 0 argument constructor
      public Die()
      {
          name = "d6";
          Number_of_sides = 6;
          roll();
      }

      // A 1 argument constructor
      public Die(int Number_of_sides)
      {
          this.Number_of_sides = Number_of_sides;
          name = "d" + Number_of_sides;
          roll();
      }

      // A 2 argument constructor
      public Die(int Number_of_sides, int Current_side_up)
      {
          this.Number_of_sides = Number_of_sides;
          name = "d" + Number_of_sides;
          this.Current_side_up = Current_side_up;
      }

      // this is my roll method
      public void roll()
      {
          Current_side_up = (int)((Math.random() * Current_side_up) + 1);
      }

      // here I will return name of dice
      public String getname()
      {
          return name;
      }

      // here I will return number of sides of dice
      public int getsides()
      {
          return Number_of_sides;
      }

      // here I will return current side of dice
      public int getsideup()
      {
          return Current_side_up;
      }

      // here I will make set sides of dice
      public void setsides(int Number_of_sides)
      {
          this.Number_of_sides = Number_of_sides;
          name = "d6";
      }

      // here I will make set current side of dice
      public void setsideup(int Current_side_up)
      {
         this.Current_side_up = Current_side_up;
      }

}
