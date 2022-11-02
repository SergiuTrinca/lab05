import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Event one=new Event();
        one=getData(one);
        System.out.print("Date: ");
        System.out.println("Numele evenimentului este"+ one.getEventNumber()+"Pretul/invitat este "+one.getGuests()+" ");
    }
    public static Event getData(Event ev)
    {
        int invitati;
        String numeevent;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Numele evenimentului");
        numeeven= keyboard.nextLine();
        System.out.println("numar invitati");
        invitati=keyboard.nextInt();
        ev.setNumarEveniment(NumarEveniment);
        ev.setInvitati(Invitati);
        return ev;
    }
}