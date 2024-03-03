package Modelo;

public interface Vehiculo {
    String getMarca();
    void setMarca(String marca);

    String getModelo();
    void setModelo(String modelo);

    String getPlaca();
    void setPlaca(String placa);

    int getVelocidadMaxima();
    void setVelocidadMaxima(int velocidadMaxima);

    int getCilindraje();
    void setCilindraje(int cilindraje);

    boolean isTraccionMecanica();
    void setTraccionMecanica(boolean traccionMecanica);

    boolean isTraccionAutomatica();
    void setTraccionAutomatica(boolean traccionAutomatica);
}
