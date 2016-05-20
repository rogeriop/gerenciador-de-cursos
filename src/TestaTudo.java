import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class TestaTudo {
	public static void main(String[] args) {
		String teste = " Comportamento do trim ";
		System.out.println("Sem |" + teste + "|");
		System.out.println("Com |" + teste.trim() + "|");
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

		Iterator<String> iterador = letras.iterator();
		while (iterador.hasNext()) {
			String letra = (String) iterador.next();
			System.out.println(letra);
		}
	}
}
