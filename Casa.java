package PegadaDeCarbono;

public class Casa extends Edicifio{
    public Casa(double gas, int numPessoas) {
        super(gas, numPessoas);
    }
    @Override
    public double getCarbonFootprint() {
        return gas / numPessoas;
    }

    public String toString(){
        return  "O total de consumo de gás da casa mensal é de: " + gas ;	
    }
}
