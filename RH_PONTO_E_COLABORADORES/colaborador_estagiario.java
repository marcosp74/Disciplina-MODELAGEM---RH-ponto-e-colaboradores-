public class ColaboradorEstagiario extends Colaborador {

    public ColaboradorEstagiario(
            String cargo,
            String nome,
            String matricula) {

        super(cargo, nome, matricula);
    }

    @Override
    public double calcularAdicional() {
        return 0;
    }
}