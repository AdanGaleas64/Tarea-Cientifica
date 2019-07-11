package com.galeas;

public abstract class Cuenta {
    public int numCuenta;
    public double saldo;
    public final double saldoMax = 10_000_000;

    public boolean retirar(double monto){
        if(saldo - monto <=0){
            return false;
        }
        saldo -= monto;
        return true;
    }
    public boolean depositar(double monto){
        if(monto + saldo > saldoMax){
            return false;
        }
        saldo += monto;
        return true;


    }

}


