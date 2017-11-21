import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("choose ur tree");
        System.out.println("1.palmTree");
        System.out.println("2.sativaTree");

        Scanner sc1 = new Scanner(System.in);
        int choiseTree = sc1.nextInt();

        switch (choiseTree){
            case 1:
                PalmTree();
                break;

            case  2:
                SativaTree();
                break;

            default:
                System.out.println("wrong symbol");;
                break;
        }
    }

    // tast #2
    public static void SativaTree(){
        System.out.println("       /\\");
        System.out.println("      /  \\");
        System.out.println("     / || \\");
        System.out.println("    /  ||  \\");
        System.out.println("   /   ||   \\");
        System.out.println("  /    ||    \\");
        System.out.println(" /     ||     \\");
        System.out.println("/      ||      \\");
        System.out.println("       ||");
        System.out.println(" ---------------");
    }

    //task #3
    public static void PalmTree(){
        System.out.println("___________ ¶¶¶¶¶¶¶¶¶");
        System.out.println("____________ ¶¶¶¶¶¶¶____¶¶¶");
        System.out.println("_____________ ¶¶¶¶¶__¶¶¶¶¶¶¶¶¶");
        System.out.println("______¶¶¶¶¶___ ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
        System.out.println("___ ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶______¶¶¶");
        System.out.println("_ ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________¶");
        System.out.println("¶¶¶_______ ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
        System.out.println("_______ ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
        System.out.println("_____¶¶¶¶¶¶¶¶¶__ ¶¶¶____¶¶¶¶¶¶¶¶¶");
        System.out.println("____¶¶¶¶¶¶¶_____ ¶¶¶¶______¶¶¶¶¶¶");
        System.out.println("____¶¶¶¶¶_______ ¶¶¶¶_______¶¶¶¶¶");
        System.out.println("____¶¶¶¶_________ ¶¶¶¶______¶¶¶¶¶");
        System.out.println("____¶¶¶__________ ¶¶¶¶_______¶¶¶¶");
        System.out.println("____¶¶____________ ¶¶¶¶______¶¶¶");
        System.out.println("____¶¶____________ ¶¶_¶_______¶¶");
        System.out.println("____¶_____________ ¶¶¶¶¶______¶");
        System.out.println("___________________ ¶¶¶¶");
        System.out.println("___________________ ¶¶_¶");
        System.out.println("___________________ ¶¶¶¶¶");
        System.out.println("___________________ ¶¶¶¶¶");
        System.out.println("____________________ ¶¶_¶");
        System.out.println("____________________ ¶¶¶¶¶____¶");
        System.out.println("_________________ ¶__¶¶¶¶¶__¶¶");
        System.out.println("_________________ ¶¶¶¶¶¶¶¶¶¶¶¶¶");
        System.out.println("__________________ ¶¶¶¶¶¶¶¶¶");
    }
}

