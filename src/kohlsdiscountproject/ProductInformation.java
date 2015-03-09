package kohlsdiscountproject;

/**
 *
 * @author kritterbusch
 */
public class ProductInformation implements ProductInformationStrategy {

    private String prodID;
    private String prodName;
    private double prodPrice;
    private int quantity;
    private ProductDiscountStrategy discount;

    public ProductInformation() {
    }

    public ProductInformation(String prodName, String prodID, double prodPrice, ProductDiscountStrategy discount) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.discount = discount;
    }

    public ProductInformation(String prodID, int quantity) {
        this.prodID = prodID;
        this.quantity = quantity;
    }

    @Override
    public String getProdID() {
        return prodID;
    }

    @Override
    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    @Override
    public String getProdName() {
        return prodName;
    }

    @Override
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Override
    public double getProdPrice() {
        return prodPrice;
    }

    @Override
    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getDiscountPrice() {
        return discount.getDiscountPrice(prodPrice);
    }

}
