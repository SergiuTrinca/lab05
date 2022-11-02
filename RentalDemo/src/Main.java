import java.util.*;
class SammysRentalPrice
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Introdu timpul de inchiriere:");
        int min=s.nextInt();
        int ore=min/60;
        min=min%60;
        int tot_cost=(hours*40)+(min*1);
        System.out.println("ore totale: "+hours);
        System.out.println("minute totale: "+min);
        System.out.println("pret total: "+tot_cost);
    }

}

