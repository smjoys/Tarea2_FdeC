package Gramatica.srt.sableccCarpeta;

import Gramatica.srt.sableccCarpeta.parser.*;
import Gramatica.srt.sableccCarpeta.node.*;
import Gramatica.srt.sableccCarpeta.lexer.*;
import Gramatica.srt.sableccCarpeta.analysis.*;
import Gramatica.srt.sableccCarpeta.*;

import java.io.*;
import java.util.Scanner;

public class Analizer {

    public static void main(String[] args) {

        Scanner tcld = new Scanner(System.in);
        System.out.println("Ingrese ruta de los subtitulos(C:/ruta/a/buscar):");
        String ruta = tcld.next();
        System.out.println("Ingrese nombre del archivo:");
        String arch = tcld.next();

        Analizador.buscarArchivoSubRip(new File(ruta),arch);

    }

}
