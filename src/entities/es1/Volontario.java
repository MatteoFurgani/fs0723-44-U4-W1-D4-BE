package entities.es1;
import java.util.Random;

public class Volontario extends Dipendente {
    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv, Dipartimento dipartimento) {
        super(generaMatricola(), 0, dipartimento);
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    public String getNome() {
        return nome;
    }
    public int getEta() {
        return eta;
    }
    public String getCv() {
        return cv;
    }

    private static int generaMatricola() {
        Random rndm = new Random();
        return rndm.nextInt(100) + 1;
    }

    @Override
    public double calculateSalary() {
        return 600;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volontario " + nome + " matricola n. " + generaMatricola() +  " ha iniziato il suo servizio.");
    }
}
