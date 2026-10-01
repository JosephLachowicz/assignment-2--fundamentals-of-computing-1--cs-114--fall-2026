public class Program3_TheTwelveDaysOfChristmas {
  public static void main(String[] args) {

    String[] gifts = {
      "a Partridge in a Pear Tree",
      "two Turtle Doves",
      "three French Hens",
      "four Calling Birds",
      "five Gold Rings",
      "six Geese a Laying",
      "seven Swans a Swimming",
      "eight Maids a Milking",
      "nine Ladies Dancing",
      "ten Lords a Leaping",
      "eleven Pipers Piping",
      "twelve Drummers Drumming"
    };

    for (int day = 1; day <= 12; day++) {
      System.out.print("On the " + day);

      switch (day) {
        case 1:
          System.out.print("st");
          break;
        case 2:
          System.out.print("nd");
          break;
        case 3:
          System.out.print("rd");
          break;
        default:
          System.out.print("th");
          break;
      }

      System.out.println(" day of Christmas, my true love sent to me:");

      switch(day) {
        case 12:
          System.out.println(gifts[11]);
        case 11:
          System.out.println(gifts[10]);
        case 10:
          System.out.println(gifts[9]);
        case 9:
          System.out.println(gifts[8]);
        case 8:
          System.out.println(gifts[7]);
        case 7:
          System.out.println(gifts[6]);
        case 6:
          System.out.println(gifts[5]);
        case 5:
          System.out.println(gifts[4]);
        case 4:
          System.out.println(gifts[3]);
        case 3:
          System.out.println(gifts[2]);
        case 2:
          System.out.println(gifts[1]);
        case 1:
          if (day > 1) {
            System.out.print("and ");
          }
          System.out.println(gifts[0]);
      }
    }
  }
}
