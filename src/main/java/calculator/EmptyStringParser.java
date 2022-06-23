package calculator;

public class EmptyStringParser implements StringParser {

  public EmptyStringParser() {
  }

  public int[] parse() {
    return new int[0];
  }
  
}