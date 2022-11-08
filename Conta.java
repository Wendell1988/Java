package br.com.fiap.banco;

import java.io.Serializable;


public class Conta implements Serializable
{
    private int agencia;
    private int numero;
    private double saldo;
    
    public Conta(){
        
    }    
    
    public Conta(int agencia, int numero, double saldo)
    {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    public void depositar(double valor)
    {
        saldo += valor;
    }
    
    public void retirar(double valor)
    {
        saldo -= valor;
    }
    
    public double getSaldo()
    {
        return saldo;
    }
}