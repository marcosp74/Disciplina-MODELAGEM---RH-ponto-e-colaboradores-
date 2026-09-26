import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nome;

    private List<Colaborador> colaboradores =
            new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarColaborador(Colaborador c) {
        colaboradores.add(c);
    }
}