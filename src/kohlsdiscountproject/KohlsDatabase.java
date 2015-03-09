package kohlsdiscountproject;

/**
 * DatabaseStrategy of available products and known customers
 *
 * @author kritterbusch
 */
public class KohlsDatabase implements DatabaseStrategy {
    private static final String ERROR_CUSTOMER = "No such customer exists.";
    private static final String ERROR_PRODUCT = "No such product exists.";

    private final ProductInformation[] product = {
        new ProductInformation("MS KNIT TOPS   ", "20095", 30.00, new PercentOffDiscount(0.6)),
        new ProductInformation("MS SKIRT       ", "50099", 44.00, new PercentOffDiscount(0.2)),
        new ProductInformation("PETITE KNITS   ", "40091", 20.00, new PercentOffDiscount(0.3)),
        new ProductInformation("WOMENS SHOES   ", "73670", 69.99, new FlatRateDiscount(25.00)),
        new ProductInformation("MENS NECKWEAR  ", "79377", 34.00, new NoDiscount()),
        new ProductInformation("JEWELERY       ", "79803", 12.00, new FlatRateDiscount(5.00)),
        new ProductInformation("CHILDRENS GAMES", "04775", 19.99, new PercentOffDiscount(0.7)),
        new ProductInformation("MENS PANTS     ", "73389", 54.99, new NoDiscount()),
        new ProductInformation("JRS TOP        ", "88699", 48.00, new FlatRateDiscount(10.00)),
        new ProductInformation("COOKWARE       ", "08627", 49.99, new NoDiscount())
    };

    private final CustomerInformation[] customer = {
        new CustomerInformation("434", "Marlese Koehnlein"),
        new CustomerInformation("435", "Paul Cherlin"),
        new CustomerInformation("436", "Lauren Reemsnyder")
    };

    @Override
    public final CustomerInformation locateCustomerInDB(final String custNum) throws IllegalArgumentException{

        if (custNum == null || custNum.length() == 0) {
           throw new IllegalArgumentException(ERROR_CUSTOMER);
            
        }

        CustomerInformation theCustomer = null;
        for (int cust = 0; cust <= customer.length; cust++) {
            CustomerInformation thisCustomer = customer[cust];
            if (custNum.equals(thisCustomer.getCustNum())) {
                theCustomer = thisCustomer;
                break;
                
            }
        }

        return theCustomer;
    }

    @Override
    public final ProductInformation locateProductInDB(final String prodID) throws IllegalArgumentException {

        if (prodID == null || prodID.length() == 0) {
            throw new IllegalArgumentException(ERROR_PRODUCT);
            
        }

        ProductInformation theProduct = null;
        for (int prod = 0; prod < product.length; prod++) {
            ProductInformation thisProduct = product[prod];
            if (prodID.equals(thisProduct.getProdID())) {
                theProduct = thisProduct;
                break;
            }
        }

        return theProduct;
    }

}
