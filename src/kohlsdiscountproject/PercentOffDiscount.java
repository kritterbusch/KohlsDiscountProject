package kohlsdiscountproject;

/**
 *
 * @author kritterbusch
 */
public class PercentOffDiscount implements ProductDiscountStrategy {

    private double discount;

    public PercentOffDiscount(double d) {
        this.discount = d;
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }

    @Override
    public void setDiscount(double d) {
        this.discount = d;
    }

    @Override
    public double getDiscountPrice(double prodPrice) {
        return discount * prodPrice;

    }

}
