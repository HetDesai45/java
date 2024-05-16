public class Stringhandling {
  public static void main(String[] args) {
    String s1 = "Het";
    String s2 = "HET";
    String s3 = "Het Desai";

    System.out.println("Compare s1 and s2 : "+ s1.equals(s2));
    System.out.println("Character at given position : "+s1.charAt(2));
    System.out.println(s2.concat(" DESAI"));
    System.out.println("Length of string : "+ s3.length());
    System.out.println(s2.toLowerCase());
    System.out.println(s1.toUpperCase());
    System.out.println("Character index : "+s1.indexOf("t"));
    System.out.println("Substring : " +s3.substring(0, 6));
    System.out.println(s1.compareToIgnoreCase(s2));
  }
}
