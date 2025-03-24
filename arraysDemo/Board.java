package arraysDemo;

public class Board {
     boolean[][] grid = new boolean[6][6];

     public Board() {

//         grid[0][0] = false;

         grid = new boolean[][] {
                 {false, true, true,false, true, true},
                 {true, false, true, true, false, true},
                 {true, true, false, true, true, false},
                 {false, true, true,false, true, true},
                 {true, false, true, true, false, true},
                 {true, true, false, true, true, false}
         };
     }

}
