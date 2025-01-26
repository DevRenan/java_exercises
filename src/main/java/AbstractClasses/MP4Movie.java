package AbstractClasses;

public class MP4Movie extends Movie{
    @Override
    void play() {
        System.out.println("Playing MP4 Movie!!");
    }

    public static void main(String[] args) {
        MP4Movie movie = new MP4Movie();
        movie.play();
        movie.teste();
    }

//    Classes abstratas são um recurso para uma classe mãe que
//    não tenha a definição de como executar um método, apenas as filhas sabem como fazer
//    então é criado somente a assinatura desse método com o abstract na frente, e a classe filha a implementa.
}
