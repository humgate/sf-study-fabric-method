import com.humgate.factory.*;

/** Specific factory class extending InsuranceContract base factory class. Creates an instance of specific
 * InsuranceCoverage subclass - MedicalInsurance
 */

public class MedicalInsuranceContract extends InsuranceContract {

    public MedicalInsuranceContract(String clientName) {
        super(clientName);
    }

    @Override
    public InsuranceCoverage createCoverage() {
        return new MedicalInsurance();
    }
}


