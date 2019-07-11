package com.galeas;

public class CuentaLargoPlazo extends Cuenta{

    public final double penaltieMonto = 0.05;

    public boolean retirar(double monto) {
        monto += (monto*penaltieMonto);
        return super.retirar(monto);
    }
}
