package day3;

public class task1 {
    public static void main(String[] args) {
        int[][] multi_table = new int[10][10];
        ;
        for (int i = 0; i < multi_table.length  ; i++) {
            for (int j = 0; j < multi_table[0].length; j++) {
                multi_table[i][j] = (i+1)*(j+1);
                System.out.println((i+1)+" * "+(j+1)+" = "+(i+1)*(j+1));
            }
        }
    }
}
