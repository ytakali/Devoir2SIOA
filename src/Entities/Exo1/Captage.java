package Entities.Exo1;

public class Captage implements Comparable<Captage>
{
    protected int id;
    protected String nom;
    protected int hauteur;
    protected int debitMax;

    public Captage(int id, String nom, int hauteur, int debiMax)
    {
        this.id = id;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debitMax = debiMax;
    }

    public int GetId()
    {
        return id;
    }

    @Override
    public int compareTo(Captage o)
    {
        return 0;
    }

    public String GetDescription()
    {
        return nom + " - " + hauteur + " mètres - " + debitMax +" litres - ";
    }
}
