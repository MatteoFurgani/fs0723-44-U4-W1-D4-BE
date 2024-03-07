package entities.es1;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    private double salarioOrario;


    public DipendentePartTime(int matricola, int oreLavorate, double salarioOrario, Dipartimento dipartimento) {
        super(matricola, 0, dipartimento); // Passa un valore fittizio per lo stipendio
        this.oreLavorate = oreLavorate;
        this.salarioOrario = salarioOrario;
    }



    @Override
    public double calculateSalary() {
        return oreLavorate * salarioOrario;
    }
}