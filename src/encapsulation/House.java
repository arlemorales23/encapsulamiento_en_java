package encapsulation;

public class House {
    private String direccion;
    private String Propietario;
    private int Numero_De_alcoba;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    public int getNumero_De_alcoba() {
        return Numero_De_alcoba;
    }

    public void setNumero_De_alcoba(int numero_De_alcoba) {
        Numero_De_alcoba = numero_De_alcoba;
    }
}
