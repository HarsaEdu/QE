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

WebUI.click(findTestObject('Admin/manage class/page content management'))

WebUI.click(findTestObject('Admin/manage class/page class'))

WebUI.click(findTestObject('Admin/manage class/edit kelas/manage kelas'))

WebUI.click(findTestObject('Admin/manage class/edit kelas/icon edit kelas'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Admin/manage class/edit kelas/deskripsi'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Admin/manage class/edit kelas/deskripsi'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Admin/manage class/edit kelas/button simpan'))

WebUI.getText(findTestObject('Admin/manage class/edit kelas/deskripsi wajib'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

