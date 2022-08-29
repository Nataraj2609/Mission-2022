package fileReading.FreshWorks.Educative.BitwiseXOR;

public class Complement {

  public static void main(String[] args) {
    System.out.println("Bitwise complement is: " + bitwiseComplement(8));
    System.out.println("Bitwise complement is: " + bitwiseComplement(10));
  }

  private static int bitwiseComplement(int num) {
    int n = num;
    int bitCount = 0;
    while(n > 0){
      bitCount++;
      n = n >> 1;
    }

    int fullBitSet = (int) Math.pow(2, bitCount) -1;
    return num ^ fullBitSet;
  }
}
