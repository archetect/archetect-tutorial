public class {{ ClassName }} {
  private static {{ ClassName }} {{ className }} = new {{ ClassName }}();

  private {{ ClassName }}(){}

  public static {{ ClassName }} getInstance(){
     return {{ className }};
  }

  public void printMessage() {
      System.out.println("This is a contrived example. You can try this at home... but don't try it at work!");
  }

  public static void main(String[] args) {
      {{ ClassName }}.getInstance().printMessage();
  }
}
