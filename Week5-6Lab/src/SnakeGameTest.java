import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakeGameTest {

    @Test
    //TEst an array of length 7 and look for a snake which has a size 4 in shape of "L".
    public void findTailExhaustive1(){
        SnakeGame snk = new SnakeGame();
        boolean[][] arr = new boolean[7][7];
        for(int i = 0; i<arr.length; i++){
            for(int k = 0; k<arr[i].length;k++){
                arr[i][k] = false;
            }
        }
        int[] xAndY = {1,1};
        arr[2][1] = true;
        arr[3][1] = true;
        arr[3][2] = true;
        SnakeGame test = new SnakeGame(arr,xAndY[0], xAndY[1]);
        test.findTailExhaustive();
        assertArrayEquals(new int[]{1,1,4}, test.findTailExhaustive());
    }

    @Test
    //Test the default constructor which do not return nothing because it never access the array
    public void findTailExhaustive2(){
        SnakeGame snk = new SnakeGame();
        snk.findTailExhaustive();
        assertArrayEquals(new int[]{0,0,0}, snk.findTailExhaustive());
        assertEquals(0, snk.findTailExhaustive()[2]);
    }

    @Test
    //Test check a boolean 2d array of size 10 and look for a snake of size 9
    public void findTailExhaustive3(){
        boolean[][] arr = new boolean[10][10];
        for(int i = 0; i<arr.length; i++){
            for(int k = 0; k<arr[i].length;k++){
                arr[i][k] = false;
            }
        }
        int[] xAndY = {0,0};
        arr[1][0] = true;
        arr[2][0] = true;
        arr[3][0] = true;
        arr[4][0] = true;
        arr[4][1] = true;
        arr[4][2] = true;
        arr[4][3] = true;
        arr[5][3] = true;
        SnakeGame snk = new SnakeGame(arr, xAndY[0], xAndY[1]);
        snk.findTailExhaustive();
        //assertEquals(9,snk.findTailExhaustive()[2]);
        assertArrayEquals(new int[]{0,0,9}, snk.findTailExhaustive());
    }

    @Test
    public void findTailExhaustive4() {
        boolean[][] arr = new boolean[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                arr[i][k] = false;
            }
        }
        int[] xAndY = {2,3};
        arr[3][3] = true;
        arr[4][3] = true;
        SnakeGame snk = new SnakeGame(arr, xAndY[0], xAndY[1]);
        assertArrayEquals(new int[]{2,3,3}, snk.findTailExhaustive());

    }

    @Test
    //Test should not count the true statements that separate from the snake.
    public void findTailExhaustive5() {
        boolean[][] arr = new boolean[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                arr[i][k] = false;
            }
        }
        int[] xAndY = {0,3};
        arr[1][3] = true;
        arr[2][3] = true;
        arr[0][0] = true;
        arr[7][7] = true;
        SnakeGame snk = new SnakeGame(arr, xAndY[0], xAndY[1]);
        assertArrayEquals(new int[]{xAndY[0],xAndY[1],3}, snk.findTailExhaustive());

    }

}