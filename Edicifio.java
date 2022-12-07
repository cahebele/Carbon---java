package PegadaDeCarbono;

public abstract class Edicifio implements CarbonFootprint {
	 double gas;
	 int numPessoas;

	 public Edicifio(double gas, int numPessoas){
	    	this.gas = gas;
	        this.numPessoas = numPessoas;
	 }

	 public double getGas() {
	        return gas;
	    }

	    public void setGas(double gas) {
	        this.gas = gas;
	    }

	    public double getNumPessoas() {
	        return numPessoas;
	    }

	    public void setNumPessoas(int numPessoas) {
	        this.numPessoas = numPessoas;
	    }


	    @Override
	    public double getCarbonFootprint() {
	        return  gas / numPessoas;
	    }
	    public String toString(){ 
	        return  "Cada morador consume o total de gás: " + gas + " mensal";		
	    }
}
