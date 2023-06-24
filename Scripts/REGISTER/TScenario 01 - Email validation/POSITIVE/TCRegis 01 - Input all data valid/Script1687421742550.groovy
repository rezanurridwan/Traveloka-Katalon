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

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_Register'))

WebUI.setText(findTestObject('Object Repository/TCRegis 01/input_Use mobile number-email'), 'kabutominasan@gmail.com')

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_Join'))

WebUI.setText(findTestObject('Object Repository/TCRegis 01/input_Verification Code_css-11aywtz r-13awg_c33200'), '204254')

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_Verification code has been sent to kabu_fa87c9'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_Submit'))

WebUI.setText(findTestObject('Object Repository/TCRegis 01/input_Verification Code_css-11aywtz r-13awg_c33200'), 'kabuto')

WebUI.setEncryptedText(findTestObject('Object Repository/TCRegis 01/input_New Password_css-11aywtz r-13awgt0 r-_7f3534'), 
    'ReFiEQCReJM=')

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_Rewards for Your BookingsEarn Points fo_209a93'))

WebUI.setEncryptedText(findTestObject('Object Repository/TCRegis 01/input_New Password_css-11aywtz r-13awgt0 r-_7f3534'), 
    'TCdEHGtpZOAOScmyNwFgOw==')

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_Done'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_Done'))

WebUI.setEncryptedText(findTestObject('Object Repository/TCRegis 01/input_New Password_css-11aywtz r-13awgt0 r-_7f3534'), 
    '1NfyJtAQOKwFJV3fz7tbnQ==')

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_Done'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_M  F'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_Male'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/svg_Toggle Options'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_DD'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_DD'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_3'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_MM'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_March'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_YYYY'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_2022'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_2022'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_1994'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/div_SaveSave'))

WebUI.click(findTestObject('Object Repository/TCRegis 01/h3_kabuto'))

WebUI.closeBrowser()

