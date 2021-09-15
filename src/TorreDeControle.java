public class TorreDeControle {
    // Criar uma classe TorreDeControle contendo uma lista de voadores.
    Voador[] voadores = new Voador[10];

    // Esse método será encarregado de percorrer a
    // lista de voadores e fazer com que eles voem.
    public void voemTodos() {
        for(int i=0; i<voadores.length; i++) {
            if(voadores[i] == null) {
                break;
            }
            voadores[i].voar();
            voadores[i]=null;
        }
    };

    // Esse método será
    // encarregado de adicionar um voador à lista de voadores.
    public void adicionarVoador(Voador umVoador) {
        for(int i=0; i<voadores.length; i++) {
            if(voadores[i] == null) {
                voadores[i] = umVoador;
                break;
            }
        }
    };
}
