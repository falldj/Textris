package Textris;

public class Tetromino {
    String shape;
    
    public Tetromino() {
	shape = "****";
    }

    public Tetromino(String s) {
	shape = s;
    }

    public String getShape() {
	return shape;
    }

    /*public rotate() {
	
      }*/
}
