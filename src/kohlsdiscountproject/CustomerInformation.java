package kohlsdiscountproject;

/**
 *
 * @author KRitterbusch
 */
public class CustomerInformation implements CustomerInformationStrategy {

    private String custNum;
    private String custName;

    public CustomerInformation(String custNum, String custName) {
        this.custNum = custNum;
        this.custName = custName;
    }

    @Override
    public String getCustNum() {
        return custNum;
    }

    @Override
    public void setCustNum(String custNum) {
        this.custNum = custNum;
    }

    @Override
    public String getCustName() {
        return custName;
    }

    @Override
    public void setCustName(String custName) {
        this.custName = custName;
    }

}
