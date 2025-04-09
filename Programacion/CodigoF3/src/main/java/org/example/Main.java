package org.example;

import org.example.Modelo.BD;
import org.example.Vista.VentanaAdministrador;
import org.example.Vista.VentanaInicio;

public class Main {
    private static VentanaAdministrador mPrincipal=new VentanaAdministrador(this);
    private static VentanaInicio mVentanaInicio=new VentanaInicio(this);
    public static void main(String[] args) {
        mVentanaInicio.setVisible(true);
        mPrincipal.setVisible(true);
        System.out.println(BD.getConnection());
    }
}