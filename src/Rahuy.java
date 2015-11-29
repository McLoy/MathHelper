/**
 * Created by Admin on 29.11.2015.
 */
import java.util.*;

public class Rahuy {
    public static void main(String[] args) throws Exception{
        int a,b,c;
        System.out.println("Я помагаю считать процент прибыли от вложеных в бизнес денег ");
        Scanner Scan = new Scanner(System.in);
        System.out.println("Укажи сколько $ ты вложишь в прибыльный бизнес: ");
        a = Scan.nextInt();
        System.out.println("Хорошо...я запомнил");
        System.out.println("И какой процент прибыли ты хочешь от этой суммы в месяц(0-100%):");
        b = Scan.nextInt();
        c = a*b/100;
        System.out.println("После подсчетов я готов сказать, что ты получишь\n " + c + "$");
        System.out.println("Удачи! Пока!");
    }
}
