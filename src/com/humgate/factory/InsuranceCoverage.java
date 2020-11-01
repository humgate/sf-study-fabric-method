package com.humgate.factory;

/**
 * Common interface to be implemented by any specific insurance coverage.
 * Encapsulates all the actions on the insurance company side needed to provide insurance coverage.
 * For example: investigate the client, calculate the risks, reserve some money for the case if a
 * loss happens, get ready to pay client some money in case if a loss happens and finally call the
 * provideInsuranceCoverage() method when all these done.
 */
public interface InsuranceCoverage {
//Base purpose of any product - provide insurance coverage
    void provideInsuranceCoverage();
}
