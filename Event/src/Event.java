public class Event {
    private int Invitati;
    private String Nume;
    private String NumarEveniment;

    final static int Pret;
    static {
        Pret=35;

    }
    public  void setNumarEveniment(String name)
    {
        NumarEveniment=name;
    }
    public  void setInvitati(int ca)
    {
        if(Invitati<50) {
            Invitati = ca;
        }
    }
    public int getInvitati()
    {
        return Invitati*Pret;
    }
    public String getNumarEveniment()
    {
        return NumarEvenimentr;
    }
    public void setNume(String name)
    {
        nume=name;
    }
    public String getNume()
    {
        return nume;
    }
}