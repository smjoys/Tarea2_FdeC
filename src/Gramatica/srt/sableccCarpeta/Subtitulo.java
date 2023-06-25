package Gramatica.srt.sableccCarpeta;

public class Subtitulo {

        int num;
        String InicialTime;
        String finalTime;
        String texto;

        public Subtitulo(int num, String inicialTime, String finalTime, String texto) {
            this.num = num;
            this.InicialTime= inicialTime;
            this.finalTime = finalTime;
            this.texto = texto;
        }


        public int getNum() {
            return num;
        }

        public String getInicialTime() {
            return InicialTime;
        }

        public String getFinalTime() {
            return finalTime;
        }

        public String getTexto() {
            return texto;
        }


    }

