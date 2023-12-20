public class Main {
    public static void main(String[] args) {

        int[][] matrix = {{2, 3, 4}, {5, 6, 4}
        };

        //Matrisin satir ve sutun uzunlugunu transpose adli iki boyutlu diziye tanimliyoruz
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                //Matrisin devrigi almak icin satir ve sutun indekslerinin yeri degisiyor
                transpose[i][j] = matrix[j][i];
                //Devrik halini ekrana yazdir
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }
    }
}