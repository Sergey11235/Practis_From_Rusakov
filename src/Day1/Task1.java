package Day1;
/* Задача №1
* Вывести на экран слово Java, в стоку, чтобы оно повторилось 10 раз
* используя цикл while. Вывод в консоль должен быть таким: Java Java Java ...
 */

public class Task1 {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            System.out.print("Java ");
            counter++;
        }
    }

}
