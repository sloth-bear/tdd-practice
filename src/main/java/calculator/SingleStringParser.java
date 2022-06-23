package calculator;

public class SingleStringParser implements StringParser {

  private final String number;

  public SingleStringParser(String number) {
    this.number = number;
  }

  @Override
  public int[] parse() {
    final var parsedNumber = Integer.parseInt(this.number);
    return new int[]{parsedNumber};
  }

}