package boletin5;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class Conta {

    private String nome, nConta;
    private double saldo;

// Constructor sin parametro
    public Conta() {

    }

// Constructor parametro
    public Conta(String nomeCli, String numerC, double saldo) {

        this.nome = nomeCli;
        this.nConta = numerC;
        this.saldo = saldo;
    }

// Metodo
    public void setnome(String nomeCli) {
        this.nome = nomeCli;
    }

    public String getnome() {
        return nome;
    }

    public void setnConta(String numerC) {
        this.nConta = numerC;
    }

    public String getnConta() {
        return nConta;
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }

// devuelve un double da nada 
    public double getsaldo() {
        return saldo;
    }

    //public void setingreso(double ingreso) {

        //saldo = saldo + ingreso;

    //}

    public void setreintegro(double reintegro) {

        saldo = saldo - reintegro;

    }

//no devuelve nada da un double
    public void settransferencia(double transferencia) {
        saldo = saldo + transferencia;

    }

    public void mostrarDatos() {
        System.out.println("\n nome = " + this.nome+ "\n numero cuenta = " + nConta+"\n saldo disponible = " + saldo);

    }

    
    public void ingreso(){
        Scanner ler = new Scanner(System.in);
        System.out.println("tecle ingreso :");
        double ingreso = ler.nextDouble();
        if (ingreso<0){
            System.out.println("no es posible cantidad negativa");
           
        }
        else{
        
        saldo= saldo+ingreso;
        System.out.println("saldo actual = "+saldo);
        }
        
    }
}
//System.out.printnl("nome=" +contaOrigen.getnome()+"n\nConta=" +contaOrigen.getnConta()+" \nsaldo=" +contaOrigen.getsaldo())
