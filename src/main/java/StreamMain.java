import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMain {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45, "00072618429000158"));
        cursos.add(new Curso("JavaScript", 150, "72618429000158"));
        cursos.add(new Curso("Java 8", 113,"72618429000158"));
        cursos.add(new Curso("C", 55,"0072423429000158"));

        cursos.sort(Comparator.comparing(Curso::getAlunos));
        System.out.println(cursos);

        cursos.stream().filter(c -> c.getAlunos()>50 ).map(Curso::getNome).forEach(System.out::println);

        Optional<Curso> cursoStream = cursos.stream().findFirst();

        Curso curso = cursos.stream()
                .filter(c -> c.getAlunos() > 1000)
                .findFirst()
                .orElse(new Curso("Não existe", 1,""));
        System.out.println(curso.getNome());


         cursos
                .stream()
                .map(Curso::getCnpjs)
                .map(ExtractorUtil::getDocumentNumberNormalized)
                .forEach(System.out::println);

    }
}
