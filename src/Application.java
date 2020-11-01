/** Application class containing the main method. Creates three insurance contract factories and stores them to array
 * Then uses factory method for each element in the factory array to force each insurance coverage to "initialize"
 */

public class Application {
    // Storage array ("DB") for 3 contracts
    private static InsuranceContract[] insContractsDB = new InsuranceContract[3] ;

    public static void main(String[] args) {

        /* Create different insurance contracts for each client by calling specific factory constructors. Here the
          only, place where we call specific subclass methods (constructors). Further we will call only their common
          interface methods
         */
        insContractsDB[0] = new AutoInsuranceContract("Ivan");
        insContractsDB[1] = new PropertyInsuranceContract("Peter");
        insContractsDB[2] = new MedicalInsuranceContract( "Maria");

        /*
        * !!!!!!This is the purpose and the result of Factory method pattern usage!!!!!:
        * All remaining code which works with Factory and specific products (coverages) will use only common
        * interfaces like registerInsuranceContract().
        * In future if need to create new insurance coverage types, for example
        * travel insurance, we do not have to rewrite or refactor entire our application. Instead we will create new
        * subclass implementing InsuranceCoverage interface (TravelCoverage), create new specific factory class
        * extending base factory InsuranceContract class (TravelInsuranceContract), initialize new Contract using "new"
        * operator and call common interface method for it
        */
        for (InsuranceContract insContr : insContractsDB) {
            insContr.registerInsuranceContract();
        }
    }
}

