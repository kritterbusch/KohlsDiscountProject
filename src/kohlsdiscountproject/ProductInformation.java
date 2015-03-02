package kohlsdiscountproject;

/**
 *
 * @author kritterbusch
 */
public class ProductInformation {

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

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscountPrice() {
        return discount.getDiscountPrice(prodPrice);
    }

}
