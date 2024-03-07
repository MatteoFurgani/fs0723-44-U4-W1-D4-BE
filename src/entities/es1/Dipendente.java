package entities.es1;
import entities.es1.Dipartimento;
import java.util.Random;
import interfaces.CheckIn;

public abstract class Dipendente implements CheckIn {
    protected   int matricola;
    protected double stipendio;
    protected Dipartimento dipartimento;


    public Dipendente( int matricola, double stipendio, Dipartimento dipartimento ) {
        Random rndm = new Random();
        this.matricola = rndm.nextInt(1,100);
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();

    public int getMatricola(){
        return matricola;
    }
    public double getStipendio(){
        return stipendio;
    }
    public Dipartimento getDipartimento(){
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}
