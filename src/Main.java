public class Main {
    public static void main(String[] args) {
        Zapatos z1 = new Zapatos();
        z1.setMarca("Jordan");
        z1.setColor("Rojo");
        z1.setPrecio(200.0);
        z1.setTalla(40);
        z1.setTalla2(45);

        z1.setDinero(100);

        z1.MostrarInfo();
        z1.PuedeoNo();
        z1.Lequeda();

        Zapatos z2 = new Zapatos("Amiri","Blanco",250.0,38,36,320.0);
        z2.MostrarInfo();
        z2.PuedeoNo();
        z2.Lequeda();

        Zapatos z3 = new Zapatos("Croydon","Naranja",150.50,40,41,500);
        z3.MostrarInfo();
        z3.PuedeoNo();
        z3.Lequeda();
    }
}