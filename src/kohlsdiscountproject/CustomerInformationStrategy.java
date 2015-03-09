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
public interface CustomerInformationStrategy {
    
    public abstract String getCustNum();

    public abstract void setCustNum(String custNum);

    public abstract String getCustName();

    public abstract void setCustName(String custName);
}
