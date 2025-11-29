import java.util.Scanner;

public class bis0AVG{

        private static Scanner in;

        public static void main(String[] args){

                in = new Scanner(System.in);

                int count=0;
                int sum=0;

                while(true){
                        System.out.println("Gebe eine Zahl ein: ");
                        int zahl = in.nextInt();
                        sum += zahl;

                        if(zahl == 0){
                                break;
                        }
                        count++;
                }
                double avg = sum/count;
                System.out.printf("\nDie Summer ist: %d",sum);
                System.out.printf("\nDas AVG ist: %.2f", avg);
        }
}
