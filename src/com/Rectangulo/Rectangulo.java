package com.Rectangulo;

public class Rectangulo {

    private int Ancho;
    private int Alto;

    public Rectangulo(){
        this.Ancho=1;
        this.Alto=1;
    }

    public Rectangulo(int ancho, int alto){
        this.Ancho=ancho;
        this.Alto=alto;
    }

    public double areaRectangulo(){
        return (this.Ancho*this.Alto);
    }

    public double perimetroRectangulo(){
        return ((this.Ancho+this.Alto)*2);
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int ancho) {
        Ancho = ancho;
    }

    public int getAlto() {
        return Alto;
    }

    public void setAlto(int alto) {
        Alto = alto;
    }
}
