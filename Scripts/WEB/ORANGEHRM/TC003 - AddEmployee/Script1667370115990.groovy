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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/OR003 - RecordWeb/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/OR003 - RecordWeb/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/OR003 - RecordWeb/form_UsernamePassword Login Forgot your password'))

WebUI.click(findTestObject('Object Repository/OR003 - RecordWeb/button_Login'))

WebUI.click(findTestObject('Object Repository/OR003 - RecordWeb/button_Add'))

WebUI.click(findTestObject('Object Repository/OR003 - RecordWeb/i_Add Employee_oxd-icon bi-plus'))

WebUI.setText(findTestObject('Object Repository/OR003 - RecordWeb/input_Employee Full Name_firstName'), 'QA')

WebUI.setText(findTestObject('Object Repository/OR003 - RecordWeb/input_Employee Full Name_middleName'), 'Testing')

WebUI.setText(findTestObject('Object Repository/OR003 - RecordWeb/input_Employee Full Name_lastName'), 'indonesia')

WebUI.setText(findTestObject('Object Repository/OR003 - RecordWeb/input_Employee Id_oxd-input oxd-input--focus'), '0284ABC')

WebUI.click(findTestObject('Object Repository/OR003 - RecordWeb/span_Employee Id_oxd-switch-input oxd-switc_efe210'))

WebUI.click(findTestObject('Object Repository/OR003 - RecordWeb/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/OR003 - RecordWeb/input_Username_oxd-input oxd-input--focus o_d4f516'), 'QATE')

WebUI.setText(findTestObject('Object Repository/OR003 - RecordWeb/input_Employee Id_oxd-input oxd-input--focus'), 'QATEST')

WebUI.click(findTestObject('Object Repository/OR003 - RecordWeb/input_Employee Id_oxd-input oxd-input--focus'))

WebUI.setEncryptedText(findTestObject('Object Repository/OR003 - RecordWeb/input_Password_oxd-input oxd-input--focus o_671073'), 
    'pFQuO9Zht8Q=')

WebUI.setText(findTestObject('Object Repository/OR003 - RecordWeb/input_Employee Id_oxd-input oxd-input--focus'), 'QATEST')

WebUI.click(findTestObject('Object Repository/OR003 - RecordWeb/div_Accepts jpg, .png, .gif up to 1MB. Reco_f1299e'))

WebUI.setEncryptedText(findTestObject('Object Repository/OR003 - RecordWeb/input_Password_oxd-input oxd-input--focus o_671073'), 
    'HKTX87ioWPkQ4emyZ7p/eQ==')

WebUI.click(findTestObject('Object Repository/OR003 - RecordWeb/button_Save'))

