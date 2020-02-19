public class SnakeGame {
    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveCheck;
    private int recursiveCheck;

    public SnakeGame() {
        this.game = new boolean[0][0];
    }

    public SnakeGame(boolean[][] arr, int x, int y) {
        this.game  = new boolean[arr.length][arr[0].length];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                this.game[i][j] = arr[i][j];
            }
        }
    }

    public int[] findTailExhaustive() {
        return;
    }
}