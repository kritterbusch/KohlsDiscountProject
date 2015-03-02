package kohlsdiscountproject;

/**
 *
 * @author kritterbusch
 */
public class CashRegister {

KohlsDatabase db;
    
    private CustomerInformation custInfo;
    private SalesRecord sales;

    public final void startSale(String custNum) {
        db = new KohlsDatabase();
        custInfo = db.locateCustomerInDB(custNum);
        sales = new SalesRecord(custInfo);
        
    }

    public final void itemScan(final String prodID, int quantity) {
        if (prodID == null || prodID.length() == 0 || quantity < 1) {

            System.out.println("NEIN!!");

        } else {
            sales.addProduct(db.locateProductInDB(prodID));
        }
    }

    public final void endSale() {
        sales.print();
    }
    

}
