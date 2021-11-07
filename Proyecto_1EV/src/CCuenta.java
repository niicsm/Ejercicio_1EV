/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;


    public CCuenta() // Cuenta
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    public void asignarNombre(String nom) // Asignar Nombre
    {
        setNombre(nom);
    }

    public String obtenerNombre() // Obtener Nombre
    {
        return getNombre();
    }


    public double estado() // Estado
    {
        return getSaldo();
    }


    public void ingresar(double cantidad) throws Exception // INgresar
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


    public String obtenerCuenta()
    {
        return getCuenta();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getTipoInteres() {
        return tipoInteres;
    }


    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
