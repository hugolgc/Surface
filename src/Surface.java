public class Surface
{
  public static double circle(double largeur)
  {
    return arround(largeur * largeur * Math.PI);
  }
  
  public static double square(double largeur)
  {
    return arround(largeur * largeur);
  }
  
  public static double rectangle(double largeur, double longueur)
  {
    return arround(largeur * longueur);
  }

  private static double arround(double value)
  {
    return Math.round(value * 100) / 100;
  }
}
