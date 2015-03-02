package kohlsdiscountproject;

/**
 *
 * @author kritterbusch
 */
public class NoDiscount implements ProductDiscountStrategy {

    public NoDiscount() {

    }

    @Override
    public double getDiscount() {
        return 0.00;
    }

    @Override
    public void setDiscount(double d) {
    }

    @Override
    public double getDiscountPrice(double prodPrice) {
        return prodPrice;
    }
}
