package calculator;

public class StringCalculator {

  public int add(String str) {
    return NumberParserFactory.getParser(str).add();
  }

}
