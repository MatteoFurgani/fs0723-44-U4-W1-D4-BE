package entities.es1;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rndm = new Random();

        int matricola = rndm.nextInt(100) + 1;

        Dipendente dipendente1 = new DipendenteFullTime(matricola, 1500, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dirigente(matricola, 70000, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new DipendentePartTime(matricola, 102, 10, Dipartimento.VENDITE);

        Dipendente[] dipendenti = { dipendente1, dipendente2, dipendente3 };

        for (int i = 0; i < dipendenti.length; i++) {
            Dipendente dipendente = dipendenti[i];
            System.out.println("Matricola: " + dipendente.getMatricola());
            System.out.println("Stipendio: " + dipendente.calculateSalary());
            System.out.println("Dipartimento: " + dipendente.getDipartimento());
            System.out.println("------------------------------");
        }
    }
}
