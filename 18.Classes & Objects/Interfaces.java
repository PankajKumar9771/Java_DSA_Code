public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() { // if we not defined public its auto make default
        System.out.println("up,down,left,right,diagonal, alll direc");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("King moves in direction i don'nt want to say");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Its take elephenatn moves");
    }
}