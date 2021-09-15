// Pato: o pato tem uma energia. Cada vez que voa, ele perde 5 unidades de
// energia e imprime na tela “Estou voando como um pato”

public class Pato implements Voador {
    private int energia;

    public Pato() {
        this.setEnergia(0);
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Pato{" +
                "energia=" + energia +
                '}';
    }

    @Override
    public void voar() {
        if(this.getEnergia()>0) {
            this.setEnergia(this.getEnergia() - 5);
            System.out.println("Estou voando como um pato.");
            System.out.println("Energia atual: " + this.getEnergia());
        } else {
            System.out.println("Pato sem energia para voar!");
        }
    }
}
