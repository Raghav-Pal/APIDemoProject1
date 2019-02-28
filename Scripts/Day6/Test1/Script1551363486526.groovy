import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper as JsonSlurper
import internal.GlobalVariable as GlobalVariable

response1 = WS.sendRequest(findTestObject('Day6/ListUser'))

def jsonSlurper = new JsonSlurper()

def result = jsonSlurper.parseText(response1.getResponseBodyContent())

def value = result.data[1].first_name

println('\n ... Value extracted is : ' + value)

GlobalVariable.USERNAME = value

println('\n.... Global variable USERNAME : ' + GlobalVariable.USERNAME)

WS.sendRequestAndVerify(findTestObject('Day6/UpdateUser', [('username') : GlobalVariable.USERNAME]))

