import java.util.Scanner;
public class cinZodyağı {
    public static void main(String[] args) {

        int yil ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        yil = inp.nextInt();

        if (yil%12==0){
            System.out.println("Zodyak : Maymun");
        }else if (yil%12==1){
            System.out.println("Zodyak : Horoz");
        }else if (yil%12==2){
            System.out.println("Zodyak : Köpek");
        }else if (yil%12==3){
            System.out.println("Zodyak : Domuz");
        }else if (yil%12==4){
            System.out.println("Zodyak : Fare");
        }else if (yil%12==5){
            System.out.println("Zodyak : Öküz");
        }else if (yil%12==6){
            System.out.println("Zodyak : Kaplan");
        }else if (yil%12==7){
            System.out.println("Zodyak : Tavşan");
        }else if (yil%12==8){
            System.out.println("Zodyak : Ejderha");
        }else if (yil%12==9){
            System.out.println("Zodyak : Yılan");
        }else if (yil%12==10){
            System.out.println("Zodyak : At");
        }else if (yil%12==11){
            System.out.println("Zodyak : Koyun");
        }

        }


        }





