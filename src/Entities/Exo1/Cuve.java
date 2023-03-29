package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    protected int largeur;
    protected int longueur;


    public Cuve(int id, String nom, int hauteur, int debiMax, int uneLargeur, int uneLongueur)
    {
        super(id, nom, hauteur, debiMax);
        largeur = uneLargeur;
        longueur = uneLongueur;
    }



    @Override
    public double GetVolume()
    {
        return 0;
    }

    @Override
    public String GetDescription()
    {
        return super.GetDescription();
    }
}
