package kohlsdiscountproject;

/**
 *
 * @author kritterbusch
 */
public class CashRegister {

    private DatabaseStrategy db;
    private CustomerInformation custInfo;
    private SalesRecord sales;
    
    private static final String ERROR_PRODUCT = "No such product exists.";

    public final void startSale(String custNum) {
        db = new KohlsDatabase();
        custInfo = db.locateCustomerInDB(custNum);
        sales = new SalesRecord(custInfo);

    }

    public final void itemScan(final String prodID, int quantity) throws IllegalArgumentException{
        if (prodID == null || prodID.length() == 0 || quantity < 1) {

            throw new IllegalArgumentException(ERROR_PRODUCT);
            

        } else {
            sales.addProduct(db.locateProductInDB(prodID));
        }
    }

    public final void endSale() {
        sales.print();
    }

}
