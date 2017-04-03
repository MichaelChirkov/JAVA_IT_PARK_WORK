
 import java.util.Scanner;

 public class Main {



 public static void main(String[] args) {

 ArrayList list = new ArrayList();

 // вставка числа в конец массива
 Scanner scanner = new Scanner(System.in);

 int x = scanner.nextInt();
 list.addToEnd(x);

  x = scanner.nextInt();
 list.addToEnd(x);

  x = scanner.nextInt();
 list.add(x);

  x = scanner.nextInt();
  list.addToEnd(x);
  x = scanner.nextInt();
  list.addToEnd(x);

  list.printElements();

  System.out.println();


 // list.removeByIndex(x);
// list.printElements();
 // System.out.println();
 // System.out.println(list.size());
 // System.out.println(list.find(x));
  //list.reverse();
 // list.printElements();
 }
 }