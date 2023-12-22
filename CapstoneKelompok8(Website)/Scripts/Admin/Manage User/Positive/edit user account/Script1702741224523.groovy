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

WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Manage User/page user management'))

WebUI.setText(findTestObject('Admin/Manage User/search'), 'uji')

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Manage User/action'))

WebUI.click(findTestObject('Admin/Manage User/button edit'))

WebUI.click(findTestObject('Admin/Manage User/edit akun'))

WebUI.click(findTestObject('Admin/Manage User/button role edit'))

WebUI.click(findTestObject('Admin/Manage User/role edit instructor'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Manage User/edit password'))

WebUI.setText(findTestObject('Admin/Manage User/edit password'), '')

WebUI.setText(findTestObject('Admin/Manage User/edit password'), 'hellowordl123')

WebUI.setText(findTestObject('Admin/Manage User/edit konfirmasi password'), '')

WebUI.setText(findTestObject('Admin/Manage User/edit konfirmasi password'), 'hellowordl123')

WebUI.click(findTestObject('Admin/Manage User/button edit akun'))

WebUI.click(findTestObject('Admin/Manage User/confirm simpan akun'))

WebUI.getText(findTestObject('Admin/Manage User/succes update'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Admin/Manage User/x edit'))

WebUI.closeBrowser()

