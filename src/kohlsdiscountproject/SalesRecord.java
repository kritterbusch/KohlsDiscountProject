
package kohlsdiscountproject;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author KRitterbusch
 */
public class SalesRecord {

    private final CustomerInformation customer;
    private ProductInformation[] product;
    private static final double salesTax = .051;
    
    public SalesRecord(CustomerInformation customer) {
        this.customer = customer;
        this.product = new ProductInformation[0];
    }

    public void addProduct(ProductInformation product) {
        ProductInformation[] temp = new ProductInformation[this.product.length + 1];
        System.arraycopy(this.product, 0, temp, 0, this.product.length);
        temp[this.product.length] = product;
        this.product = temp;

    }

    public void print() {
        double discountTotal = 0;
        double fullAmount = 0;
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        Date date = new Date();
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println("\t\t\t  KOHL'S\n\n\t\tWestbrook Shopping Center\n\t\t   Waukesha, WI 53186\n\t\t     (262)547-6323\n");

        System.out.println("Customer: " + customer.getCustName() + "    " + dateFormat.format(date) +"\n");

        System.out.println("PRODUCT NAME     |     ITEM PRICE     |     DISCOUNTED PRICE");
        System.out.println("------------------------------------------------------------");
        for (int prod = 0; prod < product.length; prod++) {
            ProductInformation pi = product[prod];
            System.out.println(pi.getProdName() + "\t\t" + formatter.format(pi.getProdPrice()) + "\t\t\t " + formatter.format(pi.getDiscountPrice()));
            discountTotal += pi.getDiscountPrice();
            fullAmount += pi.getProdPrice();

        }
        System.out.println("\n\t\t\t\t\t    SUBTOTAL: " + formatter.format(discountTotal));
        System.out.println("\t\t\t" + formatter.format(discountTotal) + "  @  5.1%          TAX: " + formatter.format((discountTotal * salesTax)) + "\n");
        System.out.println("\t\t\t\t\t FINAL TOTAL: $" + formatter.format((discountTotal + (discountTotal * salesTax))));
        System.out.println("\n\n\t\t   TOTAL SAVED: $" + formatter.format(fullAmount - discountTotal) + "\n\n");
        System.out.println();
    }

}
