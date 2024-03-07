package entities.es1;


public class DipendenteFullTime extends Dipendente {
    private double stipendioMensile;


    public DipendenteFullTime(int matricola, double stipendioMensile, Dipartimento dipartimento) {
        super(matricola, stipendioMensile, dipartimento);
        this.stipendioMensile = stipendioMensile;
    }




    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }
}
