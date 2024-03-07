package entities.es1;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rndm = new Random();

        int matricola = rndm.nextInt(100) + 1;

        Dipendente dipendente1 = new DipendenteFullTime(matricola, 1500, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dirigente(matricola, 70000, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new DipendentePartTime(matricola, 102, 10, Dipartimento.VENDITE);
        Volontario volontario1 = new Volontario("Marco", 25, "Prima esperienza", Dipartimento.VENDITE);

        Dipendente[] dipendenti = { dipendente1, dipendente2, dipendente3, volontario1 };

        for (int i = 0; i < dipendenti.length; i++) {
            dipendenti[i].checkIn();
        }

        double stipendiTotali = 0.0;
        for (int i = 0; i < dipendenti.length; i++) {
            Dipendente dipendente = dipendenti[i];
            stipendiTotali += dipendente.calculateSalary();
        }




        for (int i = 0; i < dipendenti.length; i++) {
            Dipendente dipendente = dipendenti[i];
            System.out.println("Matricola: " + dipendente.getMatricola());
            System.out.println("Stipendio: " + dipendente.calculateSalary());
            System.out.println("Dipartimento: " + dipendente.getDipartimento());
            System.out.println("------------------------------");
        }
        System.out.println("Volontario: " + volontario1.getNome());
        System.out.println("Matricola n. " + volontario1.getMatricola());
        System.out.println(volontario1.getCv());
        System.out.println("Stipendio: " + volontario1.calculateSalary());
        System.out.println("Dipartimento: " + volontario1.getDipartimento());
        System.out.println("------------------------------");
        System.out.println("Stipendi totali: " + stipendiTotali);

    }
}
