public class Telefono {
    private String marca;
    private int pantalla;
    private String tipo;
    private String color;

    public Telefono() {
    }

    public Telefono(String marca, int pantalla, String tipo, String color) {
        this.marca = marca;
        this.pantalla = pantalla;
        this.tipo = tipo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getpantalla() {
        return pantalla;
    }

    public void setpantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "marca='" + marca + '\'' +
                ", cuerdas=" + cuerdas +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public boolean encender(){
        System.out.println("Encender telefono " + marca);
        return true;
    }

    public boolean comunicar(){
        System.out.println("Usar telefono " + marca);
        return true;
    }

    public boolean Apagar(){
        System.out.println("Apagar telefono " + marca);
        return true;
    }
}

}
