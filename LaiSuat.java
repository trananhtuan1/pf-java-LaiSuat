import java.util.Scanner;

public class LaiSuat {
    public static void main(String[] args) {
        double tiengui= 1.0;
        int sothanggui = 1;
        double laisuat = 1.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("tiền gửi = ");
        tiengui = scanner.nextDouble();
        System.out.println("tháng gửi = ");
        sothanggui = scanner.nextInt();
        System.out.println("lãi suất =");
        laisuat = scanner.nextDouble();

        for (double i = 0; i < 1; i++) {
            double sotienlai = tiengui * (laisuat/100) / 12 * 3 ;

            System.out.println("số tiền lãi = " + sotienlai);
        }
        }
    }

