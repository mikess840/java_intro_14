package quru.qa;

public class First {

    public static void main (String[] args) {  //psvm
        //shift+F6
        Person teacher = new Person(33, "Mike");
        teacher.age = 35;
        teacher.name = "Mike";
        teacher.goToPension();
        teacher.sayName();

        /*boolean flag = true;
        int aInt = 0;
        double aDouble = 0.0;
        String name = "Mike";

        /* byte aByte = 0; //8 bit  -128 (2^(8-1)) --- 127
        short aShort = 0; //16 bit -32767
        int aInt = 0; //64 bit
        long aLong = 0L;
        float aFloat = 0.0F; //32
        double aDouble = 0.0; //64
        char aChar = 'a'; //1 символ */

        System.out.println("Привет, Мир!"); //sout

        int result = 5/2; // целочисленное = 2. % - остаток от деления = 1.
        // ++унарное сложениие (+1) и  -- (-1) // =+ 1; =- 1;
        // сравнение

        if (2 >= 1) {
            // 2==2 сравнение. true
        }

        // логические операторы
        if (2 > 1 && 3 > 2 == !false) {

        }
        // && - "и", тоже самое что &,но лучше юзать &&
        // || - или ( 2 > 1 || 3 < 2 )

    }

}
