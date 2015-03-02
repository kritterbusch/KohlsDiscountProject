package kohlsdiscountproject;

/**
 *
 * @author KRitterbusch
 */
public class CustomerInformation {

    private String custNum;
    private String custName;

    public CustomerInformation(String custNum, String custName) {
        this.custNum = custNum;
        this.custName = custName;
    }

    public String getCustNum() {
        return custNum;
    }

    public void setCustNum(String custNum) {
        this.custNum = custNum;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

}
