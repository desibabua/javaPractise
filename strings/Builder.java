public class Builder {

  public String toString() {
    return "\nI am to string method\n";
  }
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("hello\n");

    System.out.println(sb.length());
    System.out.println(sb.capacity());
    
    sb.ensureCapacity(100);
    System.out.println(sb.capacity());

    sb.append("how are you..\n");
    System.out.println(sb);

    sb.append(4);
    sb.append(" ");
    sb.append(new Builder());
    sb.append(false);
    System.out.println(sb.delete(sb.length()-2, sb.length()));

    System.out.println(sb.reverse());
  }
}
