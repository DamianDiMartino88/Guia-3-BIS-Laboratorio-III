package com.Hora;

import java.util.Scanner;

public class Hora {
    private int Horas;
    private int Minutos;
    private int Segundos;

    public Hora()
    {
        this.Horas=0;
        this.Minutos=0;
        this.Segundos=0;
    }

    public Hora(int hora, int minutos, int segundos)
    {
        Scanner scan = new Scanner(System.in);
        while(hora<0||hora>23){
            System.out.println("Ingrese un Numero Correcto ( entre 0 y 23  Horas )");
            hora=scan.nextInt();
        }
        this.Horas=hora;
        while(minutos<0||minutos>59){
            System.out.println("Ingrese un Numero Correcto ( entre 0 y 59 Minutos )");
            minutos=scan.nextInt();
        }
        this.Minutos=minutos;
        while(segundos<0||segundos>59){
            System.out.println("Ingrese un Numero Correcto ( entre 0 y 59 Segundos )");
            segundos=scan.nextInt();
        }
        this.Segundos=segundos;
    }

    public void verHora(){
        String horas;
        String minutos;
        String segundos;
        if(this.Horas<10){
             horas = "0"+this.Horas;
        }else{
             horas = ""+this.Horas;
        }
        if(this.Minutos<10){
             minutos = "0"+this.Minutos;
        }else{
             minutos = ""+this.Minutos;
        }
        if(this.Segundos<10){
             segundos = "0"+this.Segundos;
        }else{
             segundos = ""+this.Segundos;
        }
        System.out.println("La Hora Actual es: "+horas+":"+minutos+":"+segundos);
    }

    public void sumaSegundos()
    {
        if(this.Segundos==59){
            this.Segundos=0;
            if(this.Minutos==59){
                this.Minutos=0;
                if(this.Horas==23){
                    this.Horas=0;
                }else{
                    this.Horas=this.Horas+1;
                }
            }else{
                this.Minutos=this.Minutos+1;
            }
        }else{
            this.Segundos=this.Segundos+1;
        }
        this.verHora();
    }

    public void restaSegundos()
    {

        if(this.Segundos==0){
            this.Segundos=59;
            if(this.Minutos==0){
                this.Minutos=59;
                if(this.Horas==0){
                    this.Horas=23;
                }else{
                    this.Horas=this.Horas-1;
                }
            }else{
                this.Minutos=this.Minutos-1;
            }
        }else{
            this.Segundos=this.Segundos-1;
        }
        this.verHora();
    }
}
