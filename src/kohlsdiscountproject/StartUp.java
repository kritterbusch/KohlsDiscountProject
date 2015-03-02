package kohlsdiscountproject;

/**
 * Main StartUp class -- User Input to Cash Register
 *
 * @author kritterbusch
 */
public class StartUp {

    public static void main(String[] args) {

        CashRegister cashreg = new CashRegister();

        cashreg.startSale("434");
        cashreg.itemScan("20095", 4);
        cashreg.itemScan("04775", 1);
        cashreg.itemScan("08627", 2);
        cashreg.itemScan("88699", 3);
        cashreg.endSale();

        cashreg.startSale("435");
        cashreg.itemScan("79377", 2);
        cashreg.itemScan("73389", 1);
        cashreg.itemScan("04775", 3);
        cashreg.endSale();

        cashreg.startSale("436");
        cashreg.itemScan("50099", 2);
        cashreg.itemScan("40091", 3);
        cashreg.itemScan("79803", 2);
        cashreg.itemScan("73670", 1);
        cashreg.endSale();

    }

}
