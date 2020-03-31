package com.company;

import com.Empleado.Empleado;
import com.Hora.Hora;
import com.ItemVenta.ItemVenta;
import com.Rectangulo.Rectangulo;

public class Main {

    public static void main(String[] args) {
        //EJercicio 1
        Rectangulo nuevoRectangulo = new Rectangulo(6,5);
        System.out.println("El Rectangulo Tiene: "+nuevoRectangulo.getAncho()+" De Ancho y: "+nuevoRectangulo.getAlto()+" De Alto");
        System.out.println("El Area del Rectangulo es: "+nuevoRectangulo.areaRectangulo());
        System.out.println("El Perimetro del Rectangulo es: "+nuevoRectangulo.perimetroRectangulo());
        nuevoRectangulo.setAncho(17);
        nuevoRectangulo.setAlto(25);
        System.out.println("El Nuevo Area del Rectangulo es: "+nuevoRectangulo.areaRectangulo());
        System.out.println("El Nuevo Perimetro del Rectangulo es: "+nuevoRectangulo.perimetroRectangulo());

        Rectangulo rectanguloPorDefecto = new Rectangulo();
        System.out.println("El Area del Rectangulo Por Defecto es: "+rectanguloPorDefecto.areaRectangulo());
        System.out.println("El Perimetro del Rectangulo Por Defecto es: "+rectanguloPorDefecto.perimetroRectangulo());

        //Ejercicio 2
        Empleado empleado1 = new Empleado(23456345,"Carlos","Gutierrez",25000);
        Empleado empleado2 = new Empleado(34234123,"Ana","Sanchez",27500);

        empleado1.datosEmpleado();
        empleado2.datosEmpleado();

        empleado1.aumentoSueldo(15);

        System.out.println("El Salario Anual de: "+empleado1.getNombreEmpleado()+" "+empleado1.getApellidoEmpleado()+" Es: $"+empleado1.salarioAnual()+"]");

        //Ejercicio 3

        ItemVenta venta1 = new ItemVenta("Perchero",3,15.50);
        ItemVenta venta2 = new ItemVenta("Estante",4,23.50);

        System.out.println("ItemVenta[ ID: "+venta1.getId()+" Descripcion: "+venta1.getDescripcion()+" Cantidad: "+venta1.getCantidad()+" Precio: $"+venta1.getPrecio()+" Total Venta: $"+venta1.precioVenta()+" ]");
        System.out.println("ItemVenta[ ID: "+venta2.getId()+" Descripcion: "+venta2.getDescripcion()+" Cantidad: "+venta2.getCantidad()+" Precio: $"+venta2.getPrecio()+" Total Venta: $"+venta2.precioVenta()+" ]");

        //Ejercicio 4

        Hora horaActual =new Hora(23,59,59);
        horaActual.verHora();
        horaActual.sumaSegundos();
        horaActual.restaSegundos();
    }
}
