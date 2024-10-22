public class Main {
    public static void main(String[] args) {

        //instancia zoologico
        Zoologico z = new Zoologico();

        //instaciando animais
        Animal leao = new Animal("Alex o Leao", 2,80,50);

        //instanciando animais dentro do zoo
        z.adicionaAnimais(leao);

        //simulando acoes do zoo
        z.listaDeAnimais();

        //simulçando acoes do animal
        leao.comer();
        leao.dormir();
        leao.emitirSom();

    }
}