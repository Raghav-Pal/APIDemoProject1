package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object AddResult
     
    /**
     * <p></p>
     */
    public static Object CountryCode
     
    /**
     * <p></p>
     */
    public static Object USERNAME
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['AddResult' : '0', 'CountryCode' : 'IN', 'USERNAME' : 'Charles'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        AddResult = selectedVariables['AddResult']
        CountryCode = selectedVariables['CountryCode']
        USERNAME = selectedVariables['USERNAME']
        
    }
}
