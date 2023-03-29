package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    protected int diametre;


    public Forage(int id, String nom, int hauteur, int debiMax, int unDiametre)
    {
        super(id, nom, hauteur, debiMax);
        diametre = unDiametre;
    }

    @Override
    public String GetDescription()
    {
        return super.GetDescription();
    }

    @Override
    public double GetVolume()
    {
        return 0;
    }
}
