


public class Pig {
  private String pigID;
  private boolean isFed;

  public Pig(String pigID){
    this.pigID = pigID;
    this.isFed = false;
  }

  public String getPigID() {
    return pigID;
  }

  public boolean isFed() {
    return isFed;
  }

  public void feed(Feed f){
    f.consume();
  }
}
