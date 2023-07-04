package Strings;

public class shortestDis {

    public static float displacement(String dir) {
        int x = 0, y = 0;

        for (int i = 0; i < dir.length(); i++) {
            char step = dir.charAt(i);
            if (step == 'N')
                y++;
            else if (step == 'S')
                y--;
            else if (step == 'E')
                x++;
            else if (step == 'W')
                x--;
        }
        x *= x;
        y *= y;

        return (float) Math.sqrt(x + y);
    }

    public static void main(String[] args) {
        String dir = "NNNNSWWWW";
        System.out.print(displacement(dir));
    }
}
