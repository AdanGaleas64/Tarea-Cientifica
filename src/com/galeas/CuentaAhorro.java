package com.galeas;

public class CuentaAhorro extends Cuenta{
    public final double saldo_min_bono = 50_000;
    public final double interesBono = 0.01;

    public boolean depositar(double monto) {
        if(monto > saldo_min_bono){
            monto += (monto*interesBono);
        }
        return super.depositar(monto);

    }
}
