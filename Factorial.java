public class Factorial{
  public static void main(String[] args){
    int number = Integer.parseInt(args[0]);
    int answer = 1;
    for(int i = 1; i <= number;i++){
      answer *= i; 
    }
    System.out.println(answer);
  }
}