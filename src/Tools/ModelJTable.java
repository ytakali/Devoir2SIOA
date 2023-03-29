package Tools;

import Entities.Exo1.Captage;
import Entities.Exo1.Cuve;
import Entities.Exo1.Forage;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{

    private String[] colonnes;
    private Object[][] lignes;
    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    public void loadDatasCaptage(ArrayList<Captage> uneListe)
    {
        // A compléter ici
        colonnes = new String[]{"Numéro","Nom","Nombre de points"};
        lignes = new Object[uneListe.size()][3];
        int i = 0;

        for(Captage club : uneListe)
        {
            lignes[i][0] =
            lignes[i][1] =
            lignes[i][2] =
            i++;
        }
        fireTableChanged(null);

    }
}
