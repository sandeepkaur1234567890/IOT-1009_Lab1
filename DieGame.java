// here I will extend the Die class
public class DieGame extends Die
{
  // this is my main method
  public static void main(String[] args)
  {
     // here I will make Die object from the constructor
      Die d6 = new Die();
      Die d10 = new Die();
      Die d20 = new Die();

      System.out.println("Creating a default d6...");
      System.out.println("Creating a d20...");
      System.out.println("Creating percentile die (a special d10)...");

      // here I will return dice 6 name and current size from Die.java program.
      System.out.println("The Current side up for "+ d6.getname() + " is " + d6.getsideup());

      // here I will return dice 10 name and current size from Die.java program.
      System.out.println("The Current side up for " + d20.getname()+ " is "+ d20.getsideup());

      // here I will return dice 20 current size from Die.java program.
      System.out.println("The Current side up for percentile is " + d10.getsideup());

      // Now I will test my roll method.
      System.out.println("\nTtesting the roll method\n");

      System.out.println("Rolling the d6...");
      // first I will roll die d6.
      d6.roll();
      System.out.println("The new value is " + d6.getsideup());

      // Now I will roll die d6.
      System.out.println("Rolling the d20...");
      d20.roll();
      System.out.println("The current side up for d20 is " + d20.getsideup());

      // Now I will roll percentile die d10.
      System.out.println("Rolling the percentile...");
      d10.roll();
      System.out.println("The new value is " + d10.getsideup());

      System.out.println("\nSetting the d20 to slow 20...");

      // Now I will set the current side of percentile die.
      d20.setsideup(20);
      System.out.println("the side up is now " + d20.getsideup() + ".Finally.");
  }
}
