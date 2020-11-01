import com.humgate.factory.*;

/**
 * InsuranceContract sense is to perform act of starting insurance contract with the coverage.
 * InsuranceContract is the base factory class. Its defines abstract method createCoverage() to create an instance of
 * InsuranceCoverage. InsuranceContract subclasses will override the createCoverage() method to create specific insurance
 * coverages (Auto, Medical and Property) by implementing InsuranceCoverage
 */

public abstract class InsuranceContract {
    private String clientName;

    //Method starts an insurance contract for clientName in parameter
    public void registerInsuranceContract () {
        //Print client Name
        System.out.print(clientName+ " : ");
        InsuranceCoverage insCover = createCoverage();
        //Product (coverage) class will print itself coverage type it does using its own method
        insCover.provideInsuranceCoverage();
    }

    public InsuranceContract(String clientName) {
        this.clientName = clientName;
    }

    //This is essential part of our Factory
    public abstract InsuranceCoverage createCoverage();
 }
