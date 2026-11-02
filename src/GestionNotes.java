 import java.util.Scanner;
public class GestionNotes {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("      RELEVE DE NOTES - L2    ");
        System.out.println("===============================");
        System.out.print("Saisir votre prenom");
        String prenom = Scanner.nextLine();
        System.out.print("Saiair votre nom");
        String nom = Scanner.nextLine();
        System.out.print("Saisir votre age");
        int age = Scanner.nextInt();
        Scanner.nextLine();
        System.out.print("Saisir votre matricule");
        String matricule = Scanner.nextLine();
        System.out.println("Etudiant: " + prenom + " "+ nom +" ("+age + " ans)");
        System.out.println("Matricule :" + matricule);
        // Au moment de taper matricule le programme passe directement a la ligne suivante
        // sans nous laisser le temps de saisir
        // Apres nextInt et nextDouble il faut ajouter un nextLine afin qu'il consomme le retour a la ligne
        // Le probleme n'apparait pas sur prenon et nom parce qu'ils ne sont pas des int ou double

    }

}