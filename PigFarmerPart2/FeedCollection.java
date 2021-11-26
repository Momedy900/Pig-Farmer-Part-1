public class FeedCollection {
  public static final int SIZE = 20;
  private Feed[] feeds = new Feed[SIZE];

  public FeedCollection(){}

  public void setFeedNumber(int id, Feed feed){
    if(id >= SIZE){
      System.out.println("Could not set feed number. Out of bounds");
    }else{
      feeds[id] = feed;
      System.out.printf("%s added to feeds collection\n", feed.getFeedType());
    }
  }

  public void emptyFeed(int id){
    if(!(id >= SIZE)){
      feeds[id].consume();
    }
  }

  public int getNumberOfFullBins(){
    int count = 0;
    for(Feed feed : feeds){
      if(feed != null){
        if(feed.getFeedStatus()){
          count++;
        }
      }
    }
    return count;
  }

  public Feed getNextFullBin(){
    for(Feed feed : feeds){
      if(feed != null){
        if(feed.getFeedStatus()){
          return feed;
        }
      }
    }
    return null;
  }
}
