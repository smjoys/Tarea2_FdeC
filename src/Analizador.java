import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Analizador {


    public ArrayList<Subtitulo> Subs= new ArrayList<Subtitulo>();

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
                lectorArchivoSubRip(subtitleFiles[0]);
            } else {
                System.out.println("No se encontró el archivo .srt en la carpeta especificada.");
            }
        } else {
            System.out.println("La carpeta especificada no existe o no es una carpeta válida.");
        }
    }
    public static void lectorArchivoSubRip(File file){

        FileReader fileReader;

        //lo meti todo en este try/catch porque de esa forma usaba solo uno
        try {
            fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            //LinkedList<String> List = new LinkedList<>();
            StringBuilder subtitleContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                subtitleContent.append(line).append("\n");
            }
            reader.close();
            String[] subtitles = subtitleContent.toString().split("\n\n");

            for (String subtitle:subtitles) {

                //cada linea del archivo
                String[] lines = subtitle.split("\n");

                //numero de subtitulos
                int numberSubtitle = Integer.parseInt(lines[0]);
                String[] intervalosTime = lines[1].split(" --> ");
                LocalTime start = LocalTime.parse(intervalosTime[0]);
                LocalTime finish = LocalTime.parse(intervalosTime[1]);

                //los subtitulos en si PD aun no se como separar los otros factores
                StringBuilder subtitleContentBuild = new StringBuilder();
                for (int i = 2; i < lines.length; i++) {
                    subtitleContentBuild.append(lines[i]).append("\n");
                }
                String contenidoNeto = subtitleContentBuild.toString().trim();

                //por fin el subtitulo creado
                Subtitulo subtituloNodo = new Subtitulo(numberSubtitle,start,finish,contenidoNeto);
            }

        } catch (IOException e) {
            System.out.printf("archivo no funcional");;
        }

    }
}
