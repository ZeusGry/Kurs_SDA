package pl.sda.zdjavapol75.praca_domowa14_1;

public class Main {
    public static void main(String[] args) {
       // Game.game();
        Ulamek ulamek1 = new Ulamek(2,3);
       // System.out.println(ulamek1);
        Ulamek ulamek2 = new Ulamek(3, 4);
        System.out.println(ulamek1.dodawanie(ulamek2));
        System.out.println(ulamek1.odejmowanie(ulamek2));
        System.out.println(ulamek1.dzielenie(ulamek2));
        System.out.println(ulamek1.mnozenie(ulamek2));
    }
}
