public class Program1_CountFlips {
  public static void main(String[] args) {

    Coin myCoin = new Coin();

    int maxFlips = 100;
    int Heads = 0;
    int Tails = 0;
    int currentFlip = 0;

    while(maxFlips > currentFlip){
      myCoin.flip();

      if(myCoin.isHeads()){
        Heads++;
      }

      else{
        Tails++;
      }
      currentFlip++;
    }

    System.out.println("Heads: " + Heads);
    System.out.println("Tails: " + Tails);

  }
}
