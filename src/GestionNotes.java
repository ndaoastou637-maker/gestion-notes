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
final double poids_1 = 0.4;
final double poids_2 = 0.6;
final int Coefficient_Algorithme = 3;
final int Coefficient_Base_de_donnees = 2;
final int Coefficient_Anglais = 1;
// Si l'examen compte 70% on modifie une seule ligne final double poids_2 = 0.7
        // modifie 0.6 a 0.7
        // Un coefficient est int un poids est un double

    }
}