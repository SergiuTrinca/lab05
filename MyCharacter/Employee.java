import java.util.Scanner;
public class InitializareErou {
    public static void main(String[] args) {
        Erou one=new Erou();
        one = getData(one);
        System.out.println("Detalii erou");
        System.out.println(one.getChIQ() + " " +one.getName() + " " + one.getPower());
    }

    public static Erou getData(Erou er)
    {
        int IQ;
        String Name,power;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Introdu numere");
        Name=keyboard.nextLine();
        System.out.println("Introdu IQ");
        IQ=keyboard.nextLine();
        System.out.println("Introdu putere");
        power=keyboard.nextInt();
        er.setName(Name);
        er.setiIQ(IQ);
        er.setPower(Power);
        return er;
    }


}