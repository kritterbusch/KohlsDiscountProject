
package kohlsdiscountproject;

/**
 *
 * @author kritterbusch
 */
public class FlatRateDiscount implements ProductDiscountStrategy{
    private double discount;
    
  
    
    public FlatRateDiscount(double d) {
        this.discount = d;
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double d) {
        this.discount = d;
    }

    @Override
    public double getDiscountPrice(double prodPrice) {
        return prodPrice - discount;
    }
}
