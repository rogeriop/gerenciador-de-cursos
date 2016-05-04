import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestandoListas {
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		cursos.add("40 Vagrant; Automatização e implementação de entrega contínua");
		cursos.add("39 Linux II; Programas, processos e pacotes");
		cursos.add("42 Windows; Introdução ao Prompt");

		Collections.sort(cursos);
		System.out.println(cursos);
	}
}

/*
Crie uma classe chamada TestandoListas e declare seu método main. 
Essa classe deverá ter uma lista de Strings com 3 nomes de cursos que você gosta do Alura e 
em seguida imprimí-los. Compartilhe conosco o código final da classe
*/