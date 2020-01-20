public class FactorialLogic extends ButtonLogic {
  @Override
  String getButtonLabel() {
    return "Click me";
  }

  @Override
  String eval(String x) {
    return BigIntegerFactorial.factorial(Integer.parseInt(x)).toString();
  }

  public static void main(String[] args){
    new Dialogue(new FactorialLogic());
    new ConsoleDialogue(new FactorialLogic()).run();
  }
}