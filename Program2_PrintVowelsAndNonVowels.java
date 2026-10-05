import java.util.Scanner;

public class Program2_PrintVowelsAndNonVowels {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = scan.nextLine();

    int aCount = 0;
    int eCount = 0;
    int iCount = 0;
    int oCount = 0;
    int uCount = 0;
    int nonVowelCount = 0;

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      switch (c) {
        case 'a' , 'A':
          aCount++;
          break;
        case 'e' , 'E':
          eCount++;
          break;
        case 'i' , 'I':
          iCount++;
          break;
        case 'o' , 'O':
          oCount++;
          break;
        case 'u' , 'U':
          uCount++;
          break;
        default:
          nonVowelCount++;
          break;
      }
    }


    System.out.println("a: " + aCount);
    System.out.println("e: " + eCount);
    System.out.println("i: " + iCount);
    System.out.println("o: " + oCount);
    System.out.println("u: " + uCount);
    System.out.println("Non-vowels: " + nonVowelCount);

    scan.close();

  }
}
