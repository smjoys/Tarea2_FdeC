import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class Analizador {


    public ArrayList<Subtitulo> Subtitulos= new ArrayList<Subtitulo>();

    public static void buscarArchivoSubRip(File ruta, String arch) {

        if (ruta.exists() && ruta.isDirectory()) {
            File[] subtitleFiles = ruta.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.equalsIgnoreCase(arch) && name.toLowerCase().endsWith(".srt");
                }
            });

            if (subtitleFiles != null && subtitleFiles.length > 0) {
                System.out.println("Archivo .srt encontrado:");
                System.out.println(subtitleFiles[0].getName());
                /////////////////
            } else {
                System.out.println("No se encontró el archivo .srt en la carpeta especificada.");
            }
        } else {
            System.out.println("La carpeta especificada no existe o no es una carpeta válida.");
        }
    }
}
