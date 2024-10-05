import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap toa do X cua quan Ma: ");
        int knightPosX = scanner.nextInt();
        System.out.print("Nhap toa do Y cua quan Ma: ");
        int knightPosY = scanner.nextInt();
        System.out.print("Nhap toa do X cua quan co con lai: ");
        int targetPosX = scanner.nextInt();
        System.out.print("Nhap toa do Y cua quan co con lai: ");
        int targetPosY = scanner.nextInt();
        scanner.close();

        if (targetPosX > 0 && targetPosX < 9
                && targetPosY > 0 && targetPosY < 9
                && knightPosX > 0 && knightPosX < 9
                && knightPosY > 0 && knightPosY < 9) {
            Piece knight = new Piece(knightPosX, knightPosY);
            Piece target = new Piece(targetPosX, targetPosY);

            int minimumMoves = Distance.minimumMoves(knight, target);
            System.out.println("So nuoc di toi thieu de quan Ma bat quan co con lai: " + minimumMoves);
        } else System.out.println("Vi tri quan co khong hop le (o ngoai khoang tu 1 den 8).");
    }
}