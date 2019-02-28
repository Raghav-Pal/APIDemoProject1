import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

def response1 = WS.sendRequest(findTestObject('SOAP/Add'))

String xml1 = response1.responseBodyContent

println('\n  xml1 is  \n.....' + xml1)

def value1 = new XmlSlurper().parseText(xml1)

def additionResult = value1.AddResult.text()

println('\n... Extracted value is : ' + additionResult)

GlobalVariable.AddResult = additionResult

println('\n.....Value for GlobalVariable is ' + GlobalVariable.AddResult)

WS.sendRequestAndVerify(findTestObject('SOAP/Add'))

WS.verifyElementPropertyValue(null, '', null)

