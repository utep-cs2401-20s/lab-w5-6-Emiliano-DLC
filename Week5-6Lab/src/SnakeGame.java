public class SnakeGame {
    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveCheck;
    private static int recursiveCheck;

    public SnakeGame() {
        this.game = new boolean[0][0];
        this.headPosition = new int[2];
        this.headPosition[0] = 0;
        this.headPosition[1] = 0;
    }

    public SnakeGame(boolean[][] game, int x, int y) {
        this.game  = new boolean[game.length][game[0].length];
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
        resetCounters();
        int[] countTail = new int[3];
        game[headPosition[0]][headPosition[1]]=true;
        for(int i = 0; i < game.length; i++){
            for(int k = 0; k < game[i].length; k++){
                if(game[i][k] == true){
                    exhaustiveCheck++;
                }
            }
        }
        countTail[0] = headPosition[0];
        countTail[1] = headPosition[1];
        countTail[2] = exhaustiveCheck;
        return countTail;
    }

    /*public int[] findTailRecursive(){
        resetCounters();
        return findTailRecursive(headPosition, headPosition);
    }

    private int[] findTailRecursive(int[] currentPosition, int[] previousPosition){
        recursiveCheck = 0;
        if(game[currentPosition[0]][currentPosition[1]+1]){
            return findTailRecursive()

        }
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