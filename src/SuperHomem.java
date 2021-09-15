// Super-homem: o super-homem tem experiência. Cada vez que o
// super-homem voa, a experiência dele aumenta 3 unidades, e imprime na
// tela “Estou voando como um campeão”

public class SuperHomem implements Voador {
    private int experiencia;

    public SuperHomem() {
        this.setExperiencia(0);
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "SuperHomem{" +
                "experiencia=" + experiencia +
                '}';
    }

    @Override
    public void voar() {
        this.setExperiencia(this.getExperiencia()+3);
        System.out.println("Estou voando como um campeão");
        System.out.println("Experiência: " + this.getExperiencia());
    }
}
