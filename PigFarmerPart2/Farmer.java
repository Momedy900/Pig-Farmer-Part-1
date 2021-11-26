import java.util.List;
import java.util.Scanner;

public class Farmer {
  static PigCollection pigCollection = new PigCollection();
  static FeedCollection feedCollection = new FeedCollection();
  public static void main(String[] args) {


    //Prepare for input;
    Scanner input = new Scanner(System.in);

    boolean showMenu = true;
    
    while(showMenu){
       //Display Menu
      System.out.println("Please choose one of the following"+
      "\n1.\tAdd Pig" + 
      "\n2.\tAdd Feed" + 
      "\n3.\tFeed Pigs" +
      "\n4.\tReports" +
      "\n5.\tExit");

      System.out.print("Menu choice: ");
      int choice = input.nextInt();

      switch(choice){
        case 1:
          System.out.print("Enter pig ID: \t");
          String pigID = input.next();
          Pig pig = new Pig(pigID);
          pigCollection.addPig(pig);
          break;

        case 2:
          System.out.print("Enter feed type: \t");
          String feedType = input.next();
          System.out.print("Enter bin weight: \t");
          double weight = input.nextDouble();
          System.out.print("Enter bin number: \t");
          int binNumber = input.nextInt();
          Feed feed = new Feed(feedType, weight);
          feedCollection.setFeedNumber(binNumber-1, feed);
          break;

        case 3:
          feedPigs();
          break;

        case 4:
          System.out.println("===================================================\n" +
              "Report........" +
              "Number of pigs: " + pigCollection.getPigCount());
          displayPigs();
          System.out.println("Number of full bins: " + feedCollection.getNumberOfFullBins());
          System.out.println("===================================================");
          break;

        case 5:
          System.out.println("Thank you, farmer...");
          showMenu = false;
          input.close();
          break;
        default:
          System.out.println("Wrong input. please try again");
      }
     
    }
  }

  private static void feedPigs() {
    if(pigCollection.getPigList().size() <= 0){
      System.out.println("No pig to feed");
    }else{
      for(Pig p : pigCollection.getPigList()){
        Feed feed = feedCollection.getNextFullBin();
        if(feed != null){
          p.feed(feed);
          System.out.printf("Fed pig %s with %s\n", p.getPigID(), feed.getFeedType());
        }else{
          System.out.println("Oops looks like we have run out of feeds");
        }
      }
    }
  }

  private static void displayPigs() {
    List<Pig> pigs = pigCollection.getPigList();
    int count = 1;
    for(Pig pig : pigs){
      System.out.printf("Pig %d: %s\n", count, pig.getPigID());
      count++;
    }
  }
}
