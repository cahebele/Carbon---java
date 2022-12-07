package PegadaDeCarbono;

public class Escola extends Edicifio{
    public Escola(double gas, int numPessoas) {
        super(gas, numPessoas);
    }
    @Override
    public double getCarbonFootprint() {
        return gas / numPessoas;
    }

    public String toString(){
        return  "O total de consumo de gás da escola mensal é de: " + gas ;		
    }
}
