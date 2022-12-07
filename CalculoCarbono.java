package PegadaDeCarbono;

public class CalculoCarbono {
    public static void main(String[] args) {
        CarbonFootprint Casa = new Casa(98.45, 6);
        CarbonFootprint Escola = new Escola(890.65, 300);
        CarbonFootprint Carro = new Carro(40, 45.000);
        CarbonFootprint Bicicleta = new Bicicleta(12, 50 );       
      
        System.out.println(Casa + "\nEmite: " + Casa.getCarbonFootprint() + " de carbono. \n");
        System.out.println(Escola + "\nEmite: " + Escola.getCarbonFootprint() + " de carbono. \n");
        System.out.println(Bicicleta + "\nEmite: " + Bicicleta.getCarbonFootprint() + " de carbono. \n");
        System.out.println(Carro + "\nEmite: " + Carro.getCarbonFootprint() + " de carbono. \n");
    }
}
