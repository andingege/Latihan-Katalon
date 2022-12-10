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

WebUI.callTestCase(findTestCase('demoqa/Login-positive'), [('username') : 'andingege', ('password') : '@Andingg123'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DemoQAtextboxt/div_Elements'))

WebUI.click(findTestObject('DemoQAtextboxt/li_Text Box'))

WebUI.setText(findTestObject('DemoQAtextboxt/input_Full Name_userName'), 'testdata1')

WebUI.setText(findTestObject('DemoQAtextboxt/input_Email_userEmail'), 'testdata@smart.com')

WebUI.setText(findTestObject('DemoQAtextboxt/textarea_Current Address_currentAddress'), 'testdata3')

WebUI.setText(findTestObject('DemoQAtextboxt/textarea_Permanent Address_permanentAddress'), 'testdata4')

WebUI.scrollToElement(findTestObject('DemoQAtextboxt/button_Submit'), 0)

WebUI.click(findTestObject('DemoQAtextboxt/button_Submit'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.closeBrowser()

