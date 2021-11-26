public class Feed {
  private String feedType;
  private boolean isFull;
  private double weight;

  public Feed(String feedType, double weight){
    this.feedType = feedType;
    this.weight = weight;
    this.isFull = true;
  }

  public void consume(){
    this.isFull = false;
  }

  public String getFeedType(){
    return this.feedType;
  }
  public double getWeight(){
    return this.weight;
  }
  public boolean getFeedStatus(){
    return this.isFull;
  }
  public void setFeedType(String feedType){
    this.feedType = feedType;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }
}
