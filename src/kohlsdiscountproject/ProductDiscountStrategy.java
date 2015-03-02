package kohlsdiscountproject;

/**
 *
 * @author kritterbusch
 */
public interface ProductDiscountStrategy {

    public double getDiscount();

    public abstract void setDiscount(double d);

    public double getDiscountPrice(double prodPrice);
    
    
    
    

}
