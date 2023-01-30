import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int n1, n2, ebob=1,ekok=1;

        System.out.print("N1 Sayısını Giriniz: ");
        n1 = imp.nextInt();

        System.out.print("N2 Sayısını Giriniz: ");
        n2 = imp.nextInt();
        int n3 = n1;
        int n4 = n2;
        int i=1;
        while(i <=n1){
            if(n1%i==0 && n2%i==0){
                ebob=i;
            }
            i++;
        }
        System.out.println(n1 + " ve " + n2 + " nin ebobu: " + ebob);

        int j=1;
        while(j<=(n3*n4)){
            if(j %n3 == 0 && j%n4==0){
                ekok=j;
                System.out.println("EKOK: " + ekok);
                break;

            }
            j++;
        }

    }
}