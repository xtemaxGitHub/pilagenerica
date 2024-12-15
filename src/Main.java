//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pila<Integer> elenco =new Pila<>();
        elenco.push(3);
        elenco.push(6);;
        System.out.println("elemento estratto "+elenco.pop());
        System.out.println("elemento estratto "+elenco.pop());
       // System.out.println("elemento estratto "+elenco.pop());
    }
}