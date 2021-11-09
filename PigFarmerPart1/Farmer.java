import java.util.Scanner;

public class Farmer {
  public static void main(String[] args) {
    //Create the feeds
    Feed apple = new Feed("Apple", 5);
    Feed mango = new Feed("Mango", 12);

    //Create the pigs
    Pig pig1 = new Pig("Kaba", "female", "white");
    Pig pig2 = new Pig("Daniel", "male", "blue");
    Pig pig3 = new Pig("Tofunmi", "female", "red");

    boolean keepFeeding = true;

    //Prepare for input;
    Scanner input = new Scanner(System.in);

    while(keepFeeding){
      System.out.print("How many new bins of mango do you have? ");
      int amountOfMango = input.nextInt();
      System.out.print("How many new bins of apple do you have? ");
      int amountOfApple = input.nextInt();

      mango.add(amountOfMango);
      apple.add(amountOfApple);

      System.out.print("Do you want to feed the pigs? Y/N ");
      String feedAnswer = input.next();
      if(feedAnswer.equalsIgnoreCase("y")){
        Pig[] pigs =  {pig1, pig2, pig3};
        Feed[] feeds = {apple, mango};
        feedPigs(pigs, feeds);
      }else{
        keepFeeding = false;
      }
    }

    System.out.println(Feed.getAmount());
  }

  public static void feedPigs(Pig[] pigs, Feed[] feeds){
    for(Pig pig : pigs){
      for(Feed feed : feeds){
        pig.feed(feed);
      }
    }
  }
}
