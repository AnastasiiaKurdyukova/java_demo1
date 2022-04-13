package guru.qa;

import java.util.Scanner;

public class FirstApp {

   public static void main(String[] args) {
      char c = 'c';
      byte by = 3;
      short s = 5;
      int br, i = 7;
      long l = 111L;
      float f = 35.79F;
      double d = 12345.67891;
      String str = "основы джавы";
      String vremayaGoda;
      br = (d >= f) ? 100500 : 500100;
      boolean test1 = s > by;
      boolean test2 = s < by;
      int myVar = i + by;

      Scanner sc = new Scanner(System.in);
      int b = sc.nextInt();

      if (b == 1 || b == 2 || b == 12)
         vremayaGoda = "Зима";
      else if (b == 3 || b == 4 || b == 5)
         vremayaGoda = "Весна";
      else if (b == 6 || b == 7 || b == 8)
         vremayaGoda = "Лето";
      else if (b == 9 || b == 10 || b == 11)
         vremayaGoda = "Осень";
      else
         vremayaGoda = "Вы тут лишний?";


         System.out.println(str + " " + br + c);
         System.out.println(test1);
         System.out.println(myVar);
         System.out.println((l - f) * 2);
         System.out.println(d % by);
         System.out.println("Большее число из 2 чисел: " + Math.max(f, l));
         System.out.println(vremayaGoda);
         System.out.println("Значение b: " + br);
         System.out.println("by min = " + Byte.MIN_VALUE);

         System.out.println("by max = " + Byte.MAX_VALUE);


      switch (vremayaGoda) {
         case "Зима":
            System.out.println("Мороз и солнце, день чудесный");
            break;
         case "Весна":
            System.out.println(s + "% ипотеки только этой весной!");
         case "Осень":
            System.out.println("Я календарь переверну  и снова " + by + " сентября");
         case "Лето":
            System.out.println(f + " градусов тепла");
            break;
      }
   }
}
