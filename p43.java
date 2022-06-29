public class  {
    public static void main(String args[]) {
        int max = 0;
        int num = 0;
        Vector<Integer> v = new Vector();
        int[][] arr = new int[4][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*50);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    num = j+1;
                }
            }
            v.add(num);
            max = 0;
        }
        System.out.print("Изначальная матрица: ");
        input(arr);
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] /= v.get(n);
            }
            n++;
        }
        System.out.print("Вектор: ");
        System.out.println(v);
        System.out.print("Измененная матрица: ");
        input(arr);
    }
    public static void input(int[][] arr) {
        System.out.println();
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}