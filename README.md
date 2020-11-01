# sf-study-fabric-method
Test repository. Contains implementation of factory method pattern example. Additional test task to module 14 in scope 
of SkillFactory Java Developer training course.

Application illustrates how to use Factory method pattern. Application uses Insurance business subject as an example.
Application creates all classes, methods and relationships required by the pattern. Sense and purpose of each one 
described in comments. 
Base correspondance between well known class names used to describe Factory method pattern and this application class 
names is as follows:

Product == InsuranceCoverage
Concrete ProductA == AutoInsuranceCoverage
Concrete ProductB == PropertyInsuranceCoverage
Concrete ProductC == MedicalInsuranceCoverage
Creator == InsuranceContract
ConcreteCreatorA == AutoInsuranceContract
ConcreteCreatorB == PropertyInsuranceContract
ConcreteCreatorC == MedicalInsuranceContract

Application outputs the following in console:
Ivan : Vehicle damage is covered
Peter : Property damage is covered
Maria : Injury is covered
