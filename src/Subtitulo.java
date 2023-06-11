import java.time.LocalTime;
public class Subtitulo {

    int num;
    LocalTime InicialTime;
    LocalTime  finalTime;
    String texto;

    public Subtitulo(int num, LocalTime inicialTime, LocalTime finalTime, String texto) {
        this.num = num;
        InicialTime = inicialTime;
        this.finalTime = finalTime;
        this.texto = texto;
    }


    public int getNum() {
        return num;
    }

    public LocalTime getInicialTime() {
        return InicialTime;
    }

    public LocalTime getFinalTime() {
        return finalTime;
    }

    public String getTexto() {
        return texto;
    }


}
