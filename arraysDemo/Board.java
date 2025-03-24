package arraysDemo;

public class Board {
     boolean[][] grid;

    public Board() {

         this.grid = new boolean[][] {
                 {false, true, true,false, true, true},
                 {true, false, true, true, false, true},
                 {true, true, false, true, true, false},
                 {false, true, true,false, true, true},
                 {true, false, true, true, false, true},
                 {true, true, false, true, true, false}
         };
     }

}
