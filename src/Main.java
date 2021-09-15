public class Main {

    public static void main(String[] args) {
        Pato pato = new Pato();
        Aviao aviao = new Aviao();
        SuperHomem superHomem = new SuperHomem();
        TorreDeControle torreDeControle = new TorreDeControle();

        // Adicionar o pato, o avião e o super-homem à torre de controle.
        torreDeControle.adicionarVoador(pato);
//        torreDeControle.adicionarVoador(pato);
//        torreDeControle.adicionarVoador(pato);
//        torreDeControle.adicionarVoador(pato);
        pato.setEnergia(100);
        torreDeControle.adicionarVoador(aviao);
        torreDeControle.adicionarVoador(superHomem);

        // Pedir para a torre
        // de controle fazer todos os voadores voarem.
        torreDeControle.voemTodos();
    }
}
