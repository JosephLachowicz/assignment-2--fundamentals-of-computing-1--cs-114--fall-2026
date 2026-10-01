import java.util.Scanner;

public class Program4_OneHundredBottlesOfBeer {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("How many verses of the song 'One Hundred Bottles of Beer' would you like me to print?");
    int numberOfVerses = scanner.nextInt();

    System.out.println();

    int verseNumber = 100;
    while (verseNumber > 100 - numberOfVerses) {
      System.out.println(verseNumber + " bottles of beer on the wall\n" + verseNumber + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall\n" + (verseNumber - 1) + " bottles of beer on the wall");
      System.out.println();
      verseNumber--;
    }

    scanner.close();

  }
}
