import java.time.LocalDateTime;

public class RegistroPonto {

    private LocalDateTime entrada;
    private LocalDateTime saida;
    private boolean ajustado;

    public void registrarEntrada(LocalDateTime h) {
        entrada = h;
    }

    public void registrarSaida(LocalDateTime h) {
        saida = h;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }
}