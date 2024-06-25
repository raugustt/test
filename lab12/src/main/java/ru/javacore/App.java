package ru.javacore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello РУСЛАН!" );
        Tester tester1 = new Tester("Руслан", "Шатило", 2, "B1", 2000.0);
        Tester tester2 = new Tester("Апрель", "Арешко", 1, "B1", 9999.9);
        tester1.introduce();
        tester2.introduce("Disney");
        tester1.introduce("Хеллоу", "Nickelodeon");
        Tester.printInfo(tester1);
        Tester.printInfo(tester2);
    }
}
