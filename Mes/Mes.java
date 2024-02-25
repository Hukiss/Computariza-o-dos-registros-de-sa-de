/**
 * DevOP by Cláudio Kulembe
 *
 * Está Enum será resposavel em mostrar os meses sempre que for chamado dentro
 * da classe Data (num corpo SWITCH);
 */

package Mes;

public enum Mes {

    NULL(0), JAN(31), FEB(28), MARCH(31), ABRIL(30), MAY(31), JUN(30), JULY(31), AGOST(31), SEPT(30), OCT(31), NOV(30), DEZ(31);

    private int mes;
    Mes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

}
