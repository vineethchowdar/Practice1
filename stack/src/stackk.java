import java.util.Stack;

public class stackk {

    public static void main(String[] args) {
        Stack stackelements = new Stack();

        System.out.println("Stack Items \n" + stackelements );
        System.out.println("Stack Size :" + stackelements .size());

        System.out.println("Stack Push \n");
        stackelements .push("A");
        stackelements .push(new Integer(20));
        stackelements .push("Example");

        System.out.println("Stack Items \n" + stackelements );
        System.out.println("Stack Size :" + stackelements .size());

        System.out.println("Stack Pop \n");
        System.out.println("Pop Data :" + stackelements .pop());
        System.out.println("Pop Data " + stackelements .pop());
        System.out.println("Pop Data " + stackelements .pop());

        System.out.println("Stack Items \n" + stackelements );
        System.out.println("Stack Size :" + stackelements .size());
    }
}