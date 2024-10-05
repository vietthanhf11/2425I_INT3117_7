import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Distance {
    public static int minimumMoves(Piece knight, Piece target) {
        int moves = 0;
        List<Integer> xMoves = Arrays.asList(2, 2, 1, -1, -2, -2, -1, 1);
        List<Integer> yMoves = Arrays.asList(-1, 1, 2, 2, 1, -1, -2, -2);

        Set<Integer> movedMoves = new HashSet<>();
        Stack<Piece> stack = new Stack<>();
        stack.push(knight);
        while(!stack.isEmpty()) {
            Piece k = stack.pop();
            moves = k.getMoves();
            if (k.posX() == target.posX() && k.posY() == target.posY()) {
                return moves;
            }

            int position;
            for (int i = 0; i < 8; ++i) {
                if (!(k.posX() + xMoves.get(i) < 1) && !(k.posX() + xMoves.get(i) > 8)
                && !(k.posY() + yMoves.get(i) < 1) && !(k.posY() + yMoves.get(i) > 8)) {
                    int posX = k.posX() + xMoves.get(i);
                    int posY = k.posY() + yMoves.get(i);
                    position = posX*10 + posY;
                    if (!movedMoves.contains(position)) {
                        movedMoves.add(position);
                        Piece piece = new Piece(posX, posY);
                        piece.setMoves(moves + 1);
                        stack.push(piece);
                    }

                }
            }
        }

        return moves;
    }
}
