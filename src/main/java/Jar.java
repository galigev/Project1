import java.util.Random;

public class Jar {
  
  private String mName;
  private int mMaxNumber;
  private int mFilledNumber;
  
  public Jar(String name, int maxNumber) {
    mName = name;
    mMaxNumber = maxNumber;
  }
  
  public int fill() {
    Random random = new Random();
    mFilledNumber = random.nextInt(mMaxNumber);
    return mFilledNumber;
  }
  
  public int getFilledNumber() {
    return mFilledNumber;
  }
}