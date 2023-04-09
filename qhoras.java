import java.lang.Math;
import java.util.Scanner;
public class qhoras {
    public static void main(String arg []){
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe o horário (hh:mm:ss): ");
        int hora = teclado.nextInt();
        int minuto = teclado.nextInt();
        int segundo = teclado.nextInt();

        int hora_segundos = hora * 60 * 60;
        int minuto_seg = minuto * 60;
        int hora_total = (hora_segundos + minuto_seg + segundo);
        int hora_dia = 86400; 
        double  dia = Math.abs(hora_dia - hora_total);
        
        if(dia == 86400){
            System.out.print("Faltam 24h 00 m 00 s para acabar o dia");
        }else{
        double dia_restante_segundo = (dia%60);
        double dia_restante_minuto= (int)((dia/60))%60;
        int dia_restante_hora = (int)((dia/60)/60)%24;

        String dia_restante = (dia_restante_hora + "h " + dia_restante_minuto + "m " + dia_restante_segundo + "s");
        System.out.print("Faltam " + dia_restante + " para acabar o dia");
    }}
}
