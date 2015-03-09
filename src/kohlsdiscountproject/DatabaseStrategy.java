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
public interface DatabaseStrategy {
    
    public abstract CustomerInformation locateCustomerInDB(final String custNum);
            
    public abstract ProductInformation locateProductInDB(final String prodID);

}
