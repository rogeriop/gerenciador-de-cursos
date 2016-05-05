import java.util.List;


public class TestaCurso {
	public static void main(String[] args) {
		// crie um novo curso passando o nome e instrutor no construtor
		// chame o getter da lista de aulas do curso e imprima o resultado
		
		Curso JavaColecoes = new Curso("Dominando Collections", "Paulo");
		List<Aula> aulas = JavaColecoes.getAulas();

		JavaColecoes.adiciona(new Aula("Declarando as diferentes implementações como List", 21));
		JavaColecoes.adiciona(new Aula("Criando relacionamentos com coleções", 12));
		JavaColecoes.adiciona(new Aula("Adicionando novas aulas em um Curso", 10));
		
		
		System.out.println(aulas);
	}
}
