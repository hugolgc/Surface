import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception
    {
        double largeur;
        double longueur;
        Boolean run = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (run)
        {
            System.out.println("\nChoisir une forme : \n [1] Cercle \n [2] Carré \n [3] Rectangle \n [4] Rien, j'arrête là");
            String choice = reader.readLine();

            switch (choice)
            {
                case "1":

                    System.out.println("\nSaisir un rayon :");
                    largeur = Double.parseDouble(reader.readLine());

                    System.out.println("\nLa surface du cercle est " + Surface.circle(largeur));
                    break;
            
                case "2":

                    System.out.println("\nSaisir une largeur :");
                    largeur = Double.parseDouble(reader.readLine());

                    System.out.println("\nLa surface du carré est " + Surface.square(largeur));
                    break;
            
                case "3":

                    System.out.println("\nSaisir une largeur :");
                    largeur = Double.parseDouble(reader.readLine());

                    System.out.println("\nSaisir une longueur :");
                    longueur = Double.parseDouble(reader.readLine());

                    System.out.println("\nLa surface du rectangle est " + Surface.rectangle(largeur, longueur));
                    break;
            
                default: run = false; break;
            }
        }
    }
}
