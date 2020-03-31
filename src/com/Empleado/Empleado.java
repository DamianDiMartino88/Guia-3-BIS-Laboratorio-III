package com.Empleado;

public class Empleado {
    private int DniEmpleado;
    private String NombreEmpleado;
    private String ApellidoEmpleado;
    private double SalarioEmpleado;

    public Empleado(){
        this.DniEmpleado=00000000;
        this.NombreEmpleado="Nombre Nuevo Empleado";
        this.ApellidoEmpleado="Apellido Nuevo Empleado";
        this.SalarioEmpleado=00000.00;
    }

    public Empleado(int dni,String nombre, String apellido, double salario){
        this.DniEmpleado=dni;
        this.NombreEmpleado=nombre;
        this.ApellidoEmpleado=apellido;
        this.SalarioEmpleado=salario;
    }

    public void aumentoSueldo(double porcentaje){
        this.SalarioEmpleado=SalarioEmpleado*(1+(porcentaje/100));
    }

    public double salarioAnual()
    {
        return (this.SalarioEmpleado*12);
    }

    public void datosEmpleado()
    {
        System.out.println("Empleado[ DNI: "+this.DniEmpleado+" Nombre: "+this.NombreEmpleado+" Apellido: "+this.ApellidoEmpleado+" Salario: $"+this.SalarioEmpleado);
    }

    public int getDniEmpleado() {
        return DniEmpleado;
    }

    public void setDniEmpleado(int dniEmpleado) {
        DniEmpleado = dniEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        NombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return ApellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        ApellidoEmpleado = apellidoEmpleado;
    }

    public double getSalarioEmpleado() {
        return SalarioEmpleado;
    }

    public void setSalarioEmpleado(double salarioEmpleado) {
        SalarioEmpleado = salarioEmpleado;
    }
}
