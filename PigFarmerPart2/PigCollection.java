import java.util.*;

public class PigCollection {
  private int pigCount = 0;
  private int nextIndex = 0;
  private int currentArraySize = 5;
  private Pig[] pigs = new Pig[currentArraySize];

  public void addPig(Pig pig){
    if(pigCount + 1 > currentArraySize){
      currentArraySize *= 2;
      Pig[] newPigsArray = new Pig[currentArraySize];
      for(int i = 0; i < pigs.length; i++){
        newPigsArray[i] = pigs[i];
      }
      pigs = newPigsArray;
    }
    pigs[nextIndex] = pig;
    System.out.println("Pig with ID " + pig.getPigID() + " added successfully.");
    pigCount++;
    nextIndex++;
  }

  public int getPigCount(){
    return pigCount;
  }

  public List<Pig> getPigList(){
    List<Pig> pigsList = new ArrayList<>();
    for(int i = 0; i < pigCount; i++){
      pigsList.add(pigs[i]);
    }
    return pigsList;
  }
}
