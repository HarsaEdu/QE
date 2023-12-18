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

WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

WebUI.click(findTestObject('Admin/Manage modules as admin/create/tambah'))

WebUI.setText(findTestObject('Admin/Manage modules as admin/create/section'), 'minggu tengah')

WebUI.setText(findTestObject('Admin/Manage modules as admin/create/judul'), 'ini baru')

WebUI.click(findTestObject('Admin/Manage modules as admin/create/tambah link materi'))

WebUI.click(findTestObject('Admin/Manage modules as admin/create/pilih slide'))

WebUI.setText(findTestObject('Admin/Manage modules as admin/create/link slide'), 'https://docs.google.com/presentation/d/1dhBUNCg44NRlb1eNCqSGyPjjrmRsbke_V29U9L-jceA/edit?usp=sharing')

WebUI.click(findTestObject('Admin/Manage modules as admin/create/simpan'))

WebUI.getText(findTestObject('Admin/Manage modules as admin/create/succes'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Admin/Manage modules as admin/create/x'))

WebUI.closeBrowser()

