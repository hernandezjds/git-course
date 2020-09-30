package LIVRO.Parte001.ParteIF;

import java.util.Calendar;
import java.util.Date;

public class Datat {
    public static void main(String[] args) {
        int dia, mes, ano, horas, min;
        Calendar cal = Calendar.getInstance();
        Date d = new Date();
        cal.setTime(d);
        dia = cal.get(Calendar.DAY_OF_MONTH);
        mes = cal.get(Calendar.MONTH) +1;
        ano = cal.get(Calendar.YEAR);
        if (mes >= 10)
            System.out.println("data atual:"+dia+"/"+mes+"/"+ano);
        else
            System.out.println("data atual:0"+dia+"/0"+mes+"/"+ano);
        switch (mes)
        { case 1:
            System.out.println("- janeiro");
            break;
            case 2:
                System.out.println("- fevereiro");
                break;
            case 3:
                System.out.println("- março");
                break;
            case 4:
                System.out.println("- abril");
                break;
            case 5:
                System.out.println("- maio");
                break;
            case 6:
                System.out.println("- junho");
                break;
            case 7:
                System.out.println(" julho");
                break;
            case 8:
                System.out.println("- agosto");
                break;
            case 9:
                System.out.println("- setembro");
                break;
            case 10:
                System.out.println("- outubro");
                break;
            case 11:
                System.out.println("- novembro");
                break;
            case 12:
                System.out.println("- dezembro");
                break;

        }
        horas = cal.get(Calendar.HOUR);
        min = cal.get(Calendar.MINUTE);
        if (horas <10)
            System.out.print("hora atual: 0"+horas);
        else
            System.out.print("hora atual: "+horas);
        if (min <10)
            System.out.print(":0"+min);
        else
            System.out.print(":"+min);


    }
}
