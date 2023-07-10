package principal;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Pokemon;
import clases.Region;
import clases.Trainer;
import funciones.Funciones;

public class Inicio
{
	public static void main(String[] args)
	{
        String separador = "  ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~  ";
        
        System.out.println(separador);
        
        System.out.println("\n    Bienvenido al mundo pokemon.");

        Funciones.pausa();
        
        System.out.println("    Por favor, responde a las siguientes preguntas.");

        Funciones.pausa();
        
        String nameProt = Funciones.pedirNombre();
        
        String region = Funciones.pedirRegión();
        
        Region basicsData = Funciones.createBasicsData(region);
        
        Pokemon inicial = Funciones.pedirInicial(basicsData);
        
        Trainer protagonist = new Trainer (nameProt, region, inicial);
        
        System.out.println("Tus datos:");
        System.out.println(protagonist);
        
        System.out.println(inicial);
        System.out.println(separador);
        
        System.out.println("\nLos datos de tu rival:");
        System.out.println(basicsData.getRival());
	}
}
