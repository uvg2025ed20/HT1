package uvg.edu;

public interface ILicuadora {
    void encender();
    void llenar(String ingrediente);
    void aumentarVelocidad();
    void disminuirVelocidad();
    int obtenerVelocidad();
    boolean estaLlena();
    void vaciar();
}
