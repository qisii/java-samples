import java.util.*;

public class CardFlipGame {

  public static void main(String[] args) {
    int[] fronts = {1, 2, 4, 4, 7};
    int[] backs = {1, 3, 4, 1, 3};
    CardFlipGame game = new CardFlipGame();
    int result = game.flipgame(fronts, backs);
    System.out.println(result);
  }

  public int flipgame(int[] fronts, int[] backs) {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < fronts.length; i++) {
      numbers.add(fronts[i]);
      numbers.add(backs[i]);
    }
    Collections.sort(numbers);
    for (int n : numbers) {
      boolean success = true;
      for (int i = 0; i < fronts.length; i++) {
        if (n == fronts[i] && n == backs[i]) {
          success = false;
          break;
        }
      }
      if (success) {
        return n;
      }
    }
    return 0;
  }
}
