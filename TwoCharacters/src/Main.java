import java.util.Scanner;
    public class Erou {
        public static void main(String[] args) {
            Erou one=new Erou();
            Erou two=new Erou();
            one = getData(one);
            two=getData(two);
            System.out.println("Detaliile primului erou ");
            System.out.println(one.getIQ() + " " +one.getName() + " " + one.getPower());
            System.out.println("Detaliile eroului 2" );
            System.out.println(two.getIQ()+" "+two.getPower()+ " "+ two.getName());
        }

        public static Erou getData(Erou er)
        {
            int IQ;
            String Name,Power;
            Scanner keyboard=new Scanner(System.in);
            System.out.println("Numele");
            Name=keyboard.nextLine();
            System.out.println("Puterea");
            Power=keyboard.nextLine();
            System.out.println("IQ");
            IQ=keyboard.nextInt();
            er.setName(Name);
            er.setPower(Power);
            er.setIQ(IQ);
            return er;
        }


    }
