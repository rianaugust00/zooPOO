public class Animal {

    //atributos
    public String especie;
    public int idade;
    public double tamanho;
    public double peso;

    //construtor
    Animal(String especie, int idade, double tamanho, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    //metodos de todos animais

    public void comer(){
        System.out.println(especie + " esta comendo");
    }

    public void dormir(){
        System.out.println(especie + " esta dormindo");
    }

    public void emitirSom(){
        System.out.println(especie + " esta emitido um som!");
    }


}
