public class ColaboradorCLT extends Colaborador {

    public ColaboradorCLT(
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