import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size;
        int myArr[];
        int count =0;

        System.out.println("Moi nhap vao so luong hoc sinh:");
        size =scanner.nextInt();
        if (size>30){
            System.out.println("So luong toi da la 30!");
        }else {
            myArr = new int[size];

            for(int i=0;i<size;i++){
                System.out.printf("Moi ban nhap vao so diem cua ban thu %d   ",i+1);
                myArr[i] =scanner.nextInt();

                if (myArr[i]<11 && myArr[i]>4){
                    count++;
                }
            }
            System.out.printf("Danh sach ban vua nhap co %d nguoi pass mon",count);
        }

    }
}
