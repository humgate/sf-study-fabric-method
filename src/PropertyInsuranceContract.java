import com.humgate.factory.*;

/**
 *  Specific factory class extending InsuranceContract base factory class. Creates an instance of specific
 * InsuranceCoverage subclass - PropertyInsurance
 */

public class PropertyInsuranceContract extends InsuranceContract {

    public PropertyInsuranceContract(String clientName) {
        super(clientName);
    }

    @Override
    public InsuranceCoverage createCoverage() {
        return new PropertyInsurance();
    }
}
