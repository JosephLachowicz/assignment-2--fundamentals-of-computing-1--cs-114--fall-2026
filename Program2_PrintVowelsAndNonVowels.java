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
    int ACount = 0;
    int ECount = 0;
    int ICount = 0;
    int OCount = 0;
    int UCount = 0;
    int nonVowelCount = 0;

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      switch (c) {
        case 'a':
          aCount++;
          break;
        case 'e':
          eCount++;
          break;
        case 'i':
          iCount++;
          break;
        case 'o':
          oCount++;
          break;
        case 'u':
          uCount++;
          break;
        case 'A':
          ACount++;
          break;
        case 'E':
          ECount++;
          break;
        case 'I':
          ICount++;
          break;
        case 'O':
          OCount++;
          break;
        case 'U':
          UCount++;
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
    System.out.println("A: " + ACount);
    System.out.println("E: " + ECount);
    System.out.println("I: " + ICount);
    System.out.println("O: " + OCount);
    System.out.println("U: " + UCount);
    System.out.println("Non-vowels: " + nonVowelCount);

    scan.close();

  }
}
