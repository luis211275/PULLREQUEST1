public class Personaje {
 private String nom;
 private int dinero;
 public Personaje(String nom, int dinero) {
 this.nom = nom;
 this.dinero = dinero;
 }
 public int getNom(){
    return nom;
 }
 public void setNom(int nom){
    this.nom;
 }
  public int getDinero(){
    return dinero;
 }
 public void setDinero(int dinero){
    this.dinero;
 }
 public void mostrarInfo() {
 System.out.println(nom + " tiene " + dinero + "$.");
 }
 public void GastarDinero(){
    private static Scanner sc = new Scanner(System.in);
    System.out.println("Cuanto dinero te quieres hastar en la tienda de ropa?");
    int gasto = sc.nextint();
    setDinero(getDinero-gasto);
    System.out.println(getNom + "se ha gastado" + gasto + "ahora tiene " + getDinero + "euros");
    
 }
 public static void main(String[] args) {
 Personaje jugador = new Personaje("Trevor", 500);
 jugador.mostrarInfo();
 jugador.GastarDinero();
 }