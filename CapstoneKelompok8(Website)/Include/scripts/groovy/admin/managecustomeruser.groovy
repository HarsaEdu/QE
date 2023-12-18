package admin
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import java.awt.Desktop as Desktop
import java.io.File as File

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class managecustomeruser {
// set rows
	@Given("login is successful and go to manage classes user")
	def manageusercustomerinclass() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.click(findTestObject('Admin/manage class/page content management'))
		
		WebUI.click(findTestObject('Admin/manage class/page class'))
		
		WebUI.click(findTestObject('Admin/manage customer users/manage kelas'))
		
		WebUI.click(findTestObject('Admin/manage customer users/user'))
	}

	@When("set rows")
	def rows() {
		WebUI.click(findTestObject('Admin/manage customer users/set row/select box'))
		
		WebUI.click(findTestObject('Admin/manage customer users/set row/5'))
		
		WebUI.delay(2)
	}

	@Then("check rows")
	def checkrows() {
		
		WebUI.takeFullPageScreenshot()
		
		WebUI.getText(findTestObject('Admin/manage customer users/set row/succes'))
		
		WebUI.closeBrowser()
	}

	//berpindah halaman
	@Given("login is successful and go to manage classes user 2")
	def manageusercustomerinclass2() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.click(findTestObject('Admin/manage class/page content management'))
		
		WebUI.click(findTestObject('Admin/manage class/page class'))
		
		WebUI.click(findTestObject('Admin/manage customer users/manage kelas'))
		
		WebUI.click(findTestObject('Admin/manage customer users/user'))
	}

	@When("next page")
	def nextpage() {
		WebUI.click(findTestObject('Admin/manage customer users/berpindah tabel/next page'))
		
		WebUI.delay(2)
	}

	@Then("check next page")
	def checknextpage() {
		
		WebUI.takeFullPageScreenshot()

		WebUI.getText(findTestObject('Admin/manage customer users/berpindah tabel/succes next'))

		WebUI.closeBrowser()
	}
	
	@Given("login is successful and go to manage classes user 3")
	def manageusercustomerinclass3() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.click(findTestObject('Admin/manage class/page content management'))
		
		WebUI.click(findTestObject('Admin/manage class/page class'))
		
		WebUI.click(findTestObject('Admin/manage customer users/manage kelas'))
		
		WebUI.click(findTestObject('Admin/manage customer users/user'))
	}

	@When("prev page")
	def prevpage() {
		WebUI.click(findTestObject('Admin/manage customer users/berpindah tabel/next page'))

		WebUI.click(findTestObject('Admin/manage customer users/berpindah tabel/prev page'))
		
		WebUI.delay(2)
	}

	@Then("check prev page")
	def checkprevpage() {
		
		WebUI.takeFullPageScreenshot()

		WebUI.getText(findTestObject('Admin/manage customer users/berpindah tabel/succes prev'))

		WebUI.closeBrowser()
	}
	
	//search
	@Given("login is successful and go to manage classes user 4")
	def manageusercustomerinclass4() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.click(findTestObject('Admin/manage class/page content management'))
		
		WebUI.click(findTestObject('Admin/manage class/page class'))
		
		WebUI.click(findTestObject('Admin/manage customer users/manage kelas'))
		
		WebUI.click(findTestObject('Admin/manage customer users/user'))
	}

	@When("search correctly")
	def search() {
		WebUI.setText(findTestObject('Admin/manage customer users/search/search'), 'new')
		
		WebUI.delay(2)
	}

	@Then("check search")
	def checksearch() {

		WebUI.takeFullPageScreenshot()

		WebUI.getText(findTestObject('Admin/manage customer users/search/succes'))

		WebUI.closeBrowser()
	}
	
	@Given("login is successful and go to manage classes user 5")
	def manageusercustomerinclass5() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.click(findTestObject('Admin/manage class/page content management'))
		
		WebUI.click(findTestObject('Admin/manage class/page class'))
		
		WebUI.click(findTestObject('Admin/manage customer users/manage kelas'))
		
		WebUI.click(findTestObject('Admin/manage customer users/user'))
	}

	@When("search incorrectly")
	def search2() {
		WebUI.setText(findTestObject('Admin/manage customer users/search/search'), 'hellowordl')
		
		WebUI.delay(2)
	}

	@Then("check search2")
	def checksearch2() {
		
		WebUI.takeFullPageScreenshot()
		
		WebUI.getText(findTestObject('Admin/manage customer users/search/failed'))

		WebUI.closeBrowser()
	}

	//export data
	@Given("login is successful and go to manage classes user 6")
	def manageusercustomerinclass6() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.click(findTestObject('Admin/manage class/page content management'))
		
		WebUI.click(findTestObject('Admin/manage class/page class'))
		
		WebUI.click(findTestObject('Admin/manage customer users/manage kelas'))
		
		WebUI.click(findTestObject('Admin/manage customer users/user'))
	}

	@When("click button export")
	def export() {
		WebUI.click(findTestObject('Admin/manage customer users/buttonexport'))
		
		WebUI.delay(2)
	}

	@Then("check export data")
	def checkexport() {
		
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
	}
	
	
	//delete
	@Given("login is successful and go to manage classes user 7")
	def manageusercustomerinclass7() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.click(findTestObject('Admin/manage class/page content management'))
		
		WebUI.click(findTestObject('Admin/manage class/page class'))
		
		WebUI.click(findTestObject('Admin/manage customer users/manage kelas'))
		
		WebUI.click(findTestObject('Admin/manage customer users/user'))
	}

	@When("delete data")
	def delete() {
		WebUI.click(findTestObject('Admin/manage customer users/delete/action'))

		WebUI.click(findTestObject('Admin/manage customer users/delete/delete'))

		WebUI.click(findTestObject('Admin/manage customer users/delete/yes delete'))
		
		WebUI.delay(2)
	}

	@Then("check succes delete data")
	def checkdelete() {
		
	WebUI.takeFullPageScreenshot()

	WebUI.getText(findTestObject('Admin/manage customer users/delete/succes'))

	WebUI.closeBrowser()
	}
}