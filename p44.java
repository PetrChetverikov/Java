public class  {
    public static void main(String args[]) throws IOException {
        System.out.print("Введите размер матрицы n*n ");
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = (int) (Math.random()*10);
            }
        }
        input(A);
        int g = n;
        int composition = 1;
        for (int i = 0; i < n; i++, n--) {
            for (int j = 0; j < g; j++) {
                composition *= A[i][j];
            }
        }
        System.out.println("Произведение: ");
        System.out.println(composition);
    }
    public static void input(int[][] А) {
        System.out.println();
        for (int[] anArr : А) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
