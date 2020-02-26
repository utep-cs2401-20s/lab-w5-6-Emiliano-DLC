public class SnakeGame {
    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveCheck;
    private static int recursiveCheck;

    public SnakeGame() {
        this.game = new boolean[0][0];
    }

    public SnakeGame(boolean[][] game, int x, int y) {
        this.game  = new boolean[game.length-1][game[0].length-1];
        for(int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                this.game[i][j] = game[i][j];
            }
        }
        this.headPosition = new int[2];
        this.headPosition[0]=x;
        this.headPosition[1]=y;
    }

    //Return x,y,counterChecks
    public int[] findTailExhaustive() {
        int[] countTail = new int[3];
        countTail[0] = headPosition[0];
        countTail[1]= headPosition[1];
        exhaustiveCheck = 0;
        for(int i = 0; i < game.length; i++){
            for(int k = 0; k < game[i].length; k++){
                exhaustiveCheck++;
                if(game[i][k] == game[headPosition[0]][headPosition[1]]){
                    countTail[2] = exhaustiveCheck;
                    return countTail;
                }
            }
        }
        return countTail;
    }

    /*public int[] findTailRecursive(){
    }

    private int[] findTailRecursive(int currentPosition, int[] previousPosition){
    }*/

    private void resetCounters(){
        exhaustiveCheck = 0;
        recursiveCheck = 0;

    }

    private static int getRecursiveChecks(){
        return recursiveCheck;
    }

    private static int getExhaustiveCheck(){
        return exhaustiveCheck;
    }
}