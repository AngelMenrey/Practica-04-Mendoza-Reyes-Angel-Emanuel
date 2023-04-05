
public class Futbol {
 private String nombrejugador, nombreequipo, posicionjugador;
 private int numerojugador;

    public Futbol(String nombrejugador, String nombreequipo, String posicionjugador, int numerojugador) {
        this.nombrejugador = nombrejugador;
        this.nombreequipo = nombreequipo;
        this.posicionjugador = posicionjugador;
        this.numerojugador = numerojugador;
    }

    public void setNombrejugador(String nombrejugador) {
        this.nombrejugador = nombrejugador;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    public void setPosicionjugador(String posicionjugador) {
        this.posicionjugador = posicionjugador;
    }

    public void setNumerojugador(int numerojugador) {
        this.numerojugador = numerojugador;
    }

    public String getNombrejugador() {
        return nombrejugador;
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public String getPosicionjugador() {
        return posicionjugador;
    }

    public int getNumerojugador() {
        return numerojugador;
    }
 
}
