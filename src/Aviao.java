// Avião: o avião tem horas de voo. Cada vez que o avião voa, soma 13h de
// voo e imprime na tela “Estou voando como um avião”.

public class Aviao implements Voador {
    private int horasVoo;

    public Aviao() {
        this.setHorasVoo(0);
    }

    public int getHorasVoo() {
        return horasVoo;
    }

    public void setHorasVoo(int horasVoo) {
        this.horasVoo = horasVoo;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "horasVoo=" + horasVoo +
                '}';
    }

    @Override
    public void voar() {
        this.setHorasVoo(this.getHorasVoo()+13);
        System.out.println("Estou voando como um avião");
        System.out.println("Horas de vôo: " + this.getHorasVoo());
    }
}
