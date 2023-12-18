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
import java.awt.Desktop as Desktop
import java.io.File as File

WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/manage class/page content management'))

WebUI.click(findTestObject('Admin/manage class/page class'))

WebUI.click(findTestObject('Admin/manage customer users/manage kelas'))

WebUI.click(findTestObject('Admin/manage customer users/user'))

WebUI.click(findTestObject('Admin/manage customer users/buttonexport'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

// Tentukan path ke file yang diunduh
String filePath = 'C:/Users/LEGION/Downloads/daftar-siswa.csv' // Gantilah dengan path yang sesuai

// Buat objek File
File file = new File(filePath)

// Periksa apakah file ada
if (file.exists()) {
    // Buka file menggunakan aplikasi default
    Desktop.getDesktop().open(file)
} else {
    println('File tidak ditemukan di path yang ditentukan.')
}

WebUI.delay(2)

WebUI.closeBrowser()

