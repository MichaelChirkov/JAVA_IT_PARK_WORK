
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

 // x = scanner.nextInt();
  //list.addToEnd(x);
  //x = scanner.nextInt();
  //list.addToEnd(x);

  list.printElements();
  list.reverse();
  System.out.println();
  list.printElements();
  /* Блок для проверки функции insert(element, index);
  int k = 0,l = 0;
  System.out.println();
  System.out.println("Введите элемент который хотете вставить:");
  k = scanner.nextInt();
  System.err.println("Учтите, что индекс массива начинается с 0.");
  System.out.println("Введите индекс, куда будем вставлять элемент:");
  l = scanner.nextInt();

  list.insert(k,l);

  list.printElements();
  System.out.println();

*/

 // list.removeByIndex(x);
// list.printElements();
 // System.out.println();
 // System.out.println(list.size());
 // System.out.println(list.find(x));
  //list.reverse();
 // list.printElements();
 }
 }