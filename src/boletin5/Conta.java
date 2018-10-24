package boletin5;

/**
 *
 * @author drodriguezguardiola
 */
public class Conta {
    
    private String nome,nConta;
    private double saldo;
    

// Constructor sin parametro

 public Conta (){

}

// Constructor parametro

public Conta (String nomeCli, String numerC, double saldo){

this.nome = nomeCli;
this.nConta = numerC;
this.saldo = saldo;
}


// Metodo

public void setnome (String nomeCli){
this.nome = nomeCli;
}

public String getnome(){
return nome;
}

public void setnConta(String numerC){
this.nConta = numerC;
}

public String getnConta(){
return nConta;
}

public void setsaldo(double saldo){
this.saldo = saldo;
}

public double getsaldo(){
return saldo;
}

public void ingreso(double ingreso){
    
    saldo= saldo+ingreso;
   
}


public void reintegro(double reintegro){
    
    saldo= saldo-reintegro;    
    
}



    System.out.println("nome" + nome,"nConta" +nConta,"saldo" +saldo);
    
    
}


}
