import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kích thước mảng");
        int size = sc.nextInt();
        System.out.println("nhập cột cần tính tổng");
        int column = sc.nextInt();
        int[][] arr = DualArr.generator(size,100);
        System.out.println("mảng: ");
        System.out.println(DualArr.print(arr));
        System.out.println("tổng của cột "+column+": "+DualArr.sumColumn(arr,column));
    }
}
