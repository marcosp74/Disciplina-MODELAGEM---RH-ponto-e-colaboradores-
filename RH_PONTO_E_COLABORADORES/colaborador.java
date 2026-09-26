import java.util.ArrayList;
import java.util.List;

public abstract class Colaborador {

    private String cargo;
    private String nome;
    private String matricula;

    private List<RegistroPonto> registros =
            new ArrayList<>();

    public Colaborador(
            String cargo,
            String nome,
            String matricula) {

        this.cargo = cargo;
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract double calcularAdicional();

    public void adicionarPonto(RegistroPonto p) {
        registros.add(p);
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}