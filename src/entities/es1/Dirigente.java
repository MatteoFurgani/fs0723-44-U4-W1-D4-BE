package entities.es1;

public class Dirigente extends Dipendente {
    private double salarioAnnuo;


    public Dirigente(int matricola, double salarioAnnuo, Dipartimento dipartimento) {
        super(matricola, salarioAnnuo, dipartimento);
        this.salarioAnnuo = salarioAnnuo;
    }


    @Override
    public double calculateSalary() {
        return salarioAnnuo / 12;
    }

    @Override
    public void checkIn() {
        System.out.println("Il Dirigente matricola n. " + matricola + " ha iniziato il suo turno di lavoro.");

    }
}