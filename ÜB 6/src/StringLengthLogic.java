/*public class StringLengthLogic extends ButtonLogic{
  @Override
  String getButtonLabel() {
    return "Click me";
  }

  @Override
  String eval(String x) {
    return String.valueOf(x.length());
  }

  public static void main(String[] args){
    new Dialogue(new StringLengthLogic());
    new ConsoleDialogue(new StringLengthLogic()).run();
  }
}
*/

class StringLengthLogic extends ButtonLogic {

  @Override
  String getButtonLabel(){
    return "Click me";
  }
  
  @Override
  String eval(String x){
    return String.valueOf(x.length());
  }

  public static void main(String[] args){
    new Dialogue(new StringLengthLogic());
    new ConsoleDialogue(new StringLengthLogic()).run();
  }
}
