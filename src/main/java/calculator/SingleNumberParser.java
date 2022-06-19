package calculator;

public class SingleNumberParser implements NumberParser {

  private String number;
  public SingleNumberParser(String number) {
    this.number = number;
  }

  public int add() {
    return Integer.parseInt(this.number);
  }

}