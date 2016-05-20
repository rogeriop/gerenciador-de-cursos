import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TestaOrdenacao {
    public static void main(String args[]) {

        Funcionario f1 = new Funcionario("Marcos", 15);
        Funcionario f2 = new Funcionario("Betania", 10);
        Funcionario f3 = new Funcionario("Joaninha", 18);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterador = funcionarios.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        } 
    }

}
