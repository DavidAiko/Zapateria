public class Zapatos {
    private String Color;
    private String Marca;
    private double Precio;
    private int Talla;
    private double Dinero;
    private int Talla2;

    public Zapatos() {
    }

    public Zapatos(String marca, String color, double precio, int talla, int talla2, double dinero) {
        Marca = marca;
        Color = color;
        Precio = precio;
        Talla = talla;
        Dinero = dinero;
        Talla2 = talla2;
    }

    public String getMarca() {
        return Marca;
    }

    public String getColor() {
        return Color;
    }

    public double Dinero() {
        return Dinero;
    }


    public double getPrecio() {
        return Precio;
    }

    public int getTalla() {
        return Talla;
    }

    public int getTalla2(){
        return Talla;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }
    public void setColor(String color) {
        Color = color;
    }

    public void setDinero(double dinero) {
        Dinero = dinero;
    }
    public void setTalla2(int talla2){
        Talla2 = talla2;
    }

    public void setPrecio() {
        setPrecio(0.0);
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public void setTalla(int talla) {
        Talla = talla;
    }

    public void MostrarInfo(){
        System.out.println("============================");
        System.out.println("INFORMACIÓN DEL ZAPATO");
        System.out.println("============================");
        System.out.println("Marca de Zapato: " + Marca);
        System.out.println("Color de Zapato: " + Color);
        System.out.println("Precio de Zapato: " + Precio);
        System.out.println("Talla del Zapato: " + Talla);
        System.out.println("============================");
    }

    public void PuedeoNo(){
        if(Dinero > Precio){
            System.out.println("Tiene: " + Dinero);
            System.out.println("Puede comprar el Zapato.");
            System.out.println("============================");
        }else if(Precio > Dinero){
            System.out.println("Tiene: " + Dinero);
            System.out.println("No puede comprar el Zapato.");
            System.out.println("============================");
        }
    }

    public void Lequeda(){
        if(Talla2 == Talla){
            System.out.println("Usted es Talla: " + Talla2);
            System.out.println("Puede ponerse el Zapato.");
            System.out.println("============================");
            System.out.println("");
        } else if(Talla > Talla2){
            System.out.println("Usted es Talla: " + Talla2);
            System.out.println("No puede ponerse el Zapato.");
            System.out.println("============================");
            System.out.println("");
        } else if(Talla2 > Talla){
            System.out.println("Usted es Talla: " + Talla2);
            System.out.println("No puede ponerse el Zapato.");
            System.out.println("============================");
            System.out.println("");
        }
    }
}
