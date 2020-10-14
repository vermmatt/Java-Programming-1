public class VatDemo {
    public static void main(String[] args) {
        Vat biervat = new Vat(50);
        System.out.printf("Capaciteit: %s liter", biervat.getCapaciteit());
        System.out.printf("\nInhoud: %s liter", biervat.getInhoud());
        biervat.vulVolledig();
        biervat.verwijder(2);
        System.out.printf("\nInhoud na 8 pintjes: %s%%", biervat.getPercentageGevuld());
        int pintjes = 0;
        while(biervat.getInhoud() != 0) {
            biervat.verwijder(1);
            pintjes += 4;
        }
        System.out.printf("\nAantal pintjes: %s", pintjes);
        Vat wijnvat = new Vat(100);
        wijnvat.vul(110);
        System.out.printf("\nCapaciteit: %s liter", wijnvat.getCapaciteit());
        System.out.printf("\nInhoud: %s liter", wijnvat.getInhoud());
        System.out.print(wijnvat.isVol() ? "\nHet vat is vol" : "\nHet vat is leeg");
        wijnvat.maakLeeg();
        int wijn = 0;
        do {
            wijnvat.vul(3);
            wijn += 1;
        } while (!wijnvat.isVol());
        System.out.printf("\nAantal keer bijgevuld: %s", wijn);
        System.out.printf("\nInhoud: %s liter", wijnvat.getInhoud());
    }
}
