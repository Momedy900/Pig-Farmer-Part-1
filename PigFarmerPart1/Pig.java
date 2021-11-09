import java.util.Date;


public class Pig {
  private static int numberOfPigs = 0;
  private boolean isFemale;
  private String name;
  private String sex;
  private String color;
  private Date dateOfBirth;

  public Pig(String name, String sex, String color){
    this.name = name;
    this.sex = sex;
    this.color = color;
    this.isFemale = sex.equalsIgnoreCase("female") ? true : false;
    this.dateOfBirth = new Date();
    numberOfPigs++;
  }

  public static int getCount(){
    return numberOfPigs;
  }

  public boolean isFemale(){
    return this.isFemale;
  }

  public void feed(Feed feed){
    feed.consume();
  }

}
