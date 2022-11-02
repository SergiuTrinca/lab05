import java.util.Scanner;

public class Rental {
    public static void getpret()
    {
        int contor,minute;


        Scanner inputDevice=new Scanner(System.in);
        System.out.print("Adaugati numar contracte");
        contor=inputDevice.nextInt();
        for(int j=0;j<contor;j++) {

            System.out.print("Adaugati numar  minute   "+j);

            minute = inputDevice.nextInt();
            int inchiriere = 0, inchiriereextra = 0, inchierefinala, inchiereplus;
            inchiriere = minute * 40;
            if (inchiriere > 240) {
                for (int i = 60; i < minute; i++) {
                    inchiriereextra++;

                }
            }
            System.out.print("Pretul fara orele extra e ");
            System.out.println(inchiriere);

            System.out.print("Pretul minute suplimentare este ");
            System.out.println(inchiriereextra);


            inchierefinala = inchiriere + inchiriereextra;

        }
    }

}
