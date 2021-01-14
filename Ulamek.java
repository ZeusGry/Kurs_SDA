package pl.sda.zdjavapol75.praca_domowa14_1;

public class Ulamek {
    private int mianownik;
    private int licznik;

    public Ulamek(int licznik, int mianownik) {
        this.mianownik = mianownik;
        this.licznik = licznik;
    }

    private void tempUlamek() {
        int a = nwd(this.licznik, this.mianownik);
        this.mianownik/=a;
        this.licznik/=a;
    }

    private int nwd (int a, int b) {
            if (b!=0) {
                return nwd(b, a%b);
            }
            return a;
    }

    public Ulamek dodawanie(Ulamek ulamek) {
        Ulamek temp = new Ulamek(this.licznik* ulamek.mianownik+ ulamek.licznik*this.mianownik, this.mianownik*ulamek.mianownik);
        temp.tempUlamek();
        return temp;
    }

    public Ulamek odejmowanie(Ulamek ulamek) {
        Ulamek temp = new Ulamek(this.licznik* ulamek.mianownik- ulamek.licznik*this.mianownik, this.mianownik*ulamek.mianownik);
        temp.tempUlamek();
        return temp;
    }

    public Ulamek dzielenie(Ulamek ulamek) {
        Ulamek temp = new Ulamek(this.licznik*ulamek.mianownik, this.mianownik* ulamek.licznik);
        temp.tempUlamek();
        return temp;
    }

    public Ulamek mnozenie(Ulamek ulamek) {
        Ulamek temp = new Ulamek(this.licznik*ulamek.licznik, this.mianownik* ulamek.mianownik);
        temp.tempUlamek();
        return temp;
    }

    @Override
    public String toString() {
        return this.licznik+"/"+mianownik;
    }
}
