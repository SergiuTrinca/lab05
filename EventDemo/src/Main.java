import java.util.Scanner;

public class Event {

    public final static double LOWER = 32.00;

    public final static double HIGHER = 35.00;

    public final static int CUTOFF_VALUE = 50;

    public boolean largeEvent;

    private String eventNum;

    private int totalGuests;

    private double price;

    private double pricePerGuest;

    public Event(String event, int guests) {

        eventNum = event;

        totalGuests = guests;

    }

    public Event() {

        this("A000", 0);

    }

    private Scanner input = new Scanner(System.in);

    public void setEventNumber() {

        System.out.print("Cati invitati vor fi? ");

        eventNum = input.nextLine();

    }

    public void settotalGuests() {

        System.out.print("Cati invitati vor fi? ");

        totalGuests = input.nextInt();

        if (isLargeEvent())

            pricePerGuest = LOWER;

        else

            pricePerGuest = HIGHER;

        price = totalGuests * pricePerGuest;

        largeEvent = (totalGuests >= CUTOFF_VALUE);

        System.out.println("");

    }

    public boolean isLargeEvent() {

        if (this.gettotalGuests() > 50)

            return true;

        else

            return false;

    }

    public String getEventNumber() {

        return eventNum;

    }

    public int gettotalGuests() {

        return totalGuests;

    }

    public double getPrice() {

        return price;

    }

}

public class EventDemo {

    public static void main(String[] args) {

        Event event1 = new Event();

        Event event2 = new Event();

        Event event3 = new Event();

        System.out.println("Detalii eveniment 1:");

        event1.setEventNumber();

        event1.settotalGuests();

        System.out.println("Detalii eveniment 2:");

        event2.setEventNumber();

        event2.settotalGuests();

        System.out.println("Detalii eveniment 3:");

        event3.setEventNumber();

        event3.settotalGuests();

        display(event1);

        display(event2);

        display(event3);

        System.out.println("Evenimetul dintre 1 si 2 il are mai mare pe :");

        display(getLargestEvent(event1, event2));

        System.out.println("Evenimentul mai mare dintre 2 si 3 e :");

        display(getLargestEvent(event2, event3));

        System.out.println("Evenimentul mai mare dintre 1 si 3 e :");

        display(getLargestEvent(event1, event3));

    }

    public static void display(Event e) {

        System.out.println("Numar eveniment: " + e.getEventNumber());

        System.out.println("Invitati totali: " + e.gettotalGuests());

        System.out.println("Pret total: $"

                + String.format("%.2f", e.getPrice()));

        System.out.println("Este un eveniment mare: " + e.isLargeEvent());

        System.out.println("");

    }

    public static Event getLargestEvent(Event e1, Event e2) {

        if (e1.gettotalGuests() > e2.gettotalGuests())

            return e1;

        else

            return e2;

    }

}