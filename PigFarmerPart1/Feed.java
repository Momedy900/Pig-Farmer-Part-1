public class Feed {
  private String name;
  private static int amountOfFeedLeft = 0;

  public Feed(String name, int bins){
    this.name = name;
    amountOfFeedLeft += bins;
  }

  public static int getAmount(){
    return amountOfFeedLeft;
  }

  public void consume(){
    if(amountOfFeedLeft <= 0){
      System.out.println("Warning!!! Low feeds. No bin left to consume");
    }else{
      amountOfFeedLeft--;
    }
  }

  public void add(int number){
    amountOfFeedLeft += number;
  }

}
