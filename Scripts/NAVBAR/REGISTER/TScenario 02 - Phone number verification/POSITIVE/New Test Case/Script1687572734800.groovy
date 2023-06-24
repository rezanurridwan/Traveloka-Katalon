import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.traveloka.com/en-id/')

WebUI.click(findTestObject('Object Repository/NAVBAR/REGISTER/TCRegis 08/div_Register'))

WebUI.click(findTestObject('Object Repository/NAVBAR/REGISTER/TCRegis 08/div_Use mobile number'))

WebUI.setText(findTestObject('Object Repository/NAVBAR/REGISTER/TCRegis 08/input_Use email_css-11aywtz r-13awgt0 r-t1w_e87f62'), '85171612831')

WebUI.click(findTestObject('Object Repository/NAVBAR/REGISTER/TCRegis 08/div_Join'))

WebUI.verifyElementText(findTestObject('Object Repository/NAVBAR/REGISTER/TCRegis 08/div_Verification code has been sent to 6285_378c5a'), 
    'Verification code has been sent to +6285171612831. Please insert verification code to verify.')

