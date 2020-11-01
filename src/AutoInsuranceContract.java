import com.humgate.factory.*;

/**
 * Specific factory class extending InsuranceContract base factory class. Creates an instance of specific
 * InsuranceCoverage subclass - AutoInsurance
 */

public class AutoInsuranceContract extends InsuranceContract {

    public AutoInsuranceContract(String clientName) {
        super(clientName);
    }

    @Override
    public InsuranceCoverage createCoverage() {
        return new AutoInsurance();
    }
}
