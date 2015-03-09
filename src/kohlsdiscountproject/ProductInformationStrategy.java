/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountproject;

/**
 *
 * @author KRitterbusch
 */
interface ProductInformationStrategy {
        public String getProdID();

    public abstract void setProdID(String prodID);

    public abstract String getProdName();

    public abstract void setProdName(String prodName);

    public abstract double getProdPrice();

    public abstract void setProdPrice(double prodPrice);

    public abstract int getQuantity();

    public abstract void setQuantity(int quantity);

    public abstract double getDiscountPrice();
}
