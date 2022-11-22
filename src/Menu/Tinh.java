package Menu;
import java.util.Arrays;
import java.util.Scanner;

public class Tinh {
    Integer[] arr = { 1, 43, 65, 3, -10, 23, 45, 6, 5, 4, 99, 14, 97 };
    private static Integer[] ListSo;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        while (true){
            System.out.println("1.Tính tổng dãy số : ");
            System.out.println("2.Tìm tất cả các số lơn hon 35");
            System.out.println("3.Sắp xếp các số theo thứ tự giảm dần");
            System.out.println("4.tìm tổng các cắp số chua hết cho mười");
            int so = Integer.parseInt(sc.nextLine());
            switch (so){
                case 1:
                    Tinhtong();
                    break;
                case 2:
                    TimSo();
                    break;
                case 3:
                    Sapxep();
                    break;
            }
        }
    }



    private static void TimSo() {
        for (int i = 0; i < ListSo.length; i++) {

            }
    }

    private static void Tinhtong(){
        int sum = 0;
        ListSo =  new Integer[sum];
        System.out.println("ket qua la"+sum);
        for(int num = 0;num<ListSo.length; num++) {
            sum = ListSo[sum]+num;
        }
    }
    private static void Sapxep(){
        int[] src = {1, 43, 65, 3, -10, 23, 45, 6, 5, 4, 99, 14, 97 };
        System.out.println("kết quả là: ");
        Arrays.sort(src);
        System.out.println(Arrays.toString(src));
    }


}
