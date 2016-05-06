import java.util.Set;

public class TesteCursoComAlunos {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Java Colecoes", "Paulo");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		javaColecoes.matricula(new Aluno("Marcos Brasil", 1234));
		javaColecoes.matricula(new Aluno("Maria Beltrao", 5678));
		javaColecoes.matricula(new Aluno("Claudio Serqueira", 9012));
		System.out.println(javaColecoes.getAlunos());
		 Set<Aluno> alunos = javaColecoes.getAlunos();
		 alunos.add(new Aluno("Antonio Rogerio", 18645));
	}
}
