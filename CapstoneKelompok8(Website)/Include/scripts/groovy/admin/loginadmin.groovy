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



class loginadmin {
	@Given("navigate to landing page and click login button as admin")
	def urlPositive() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://harsaedu.my.id/')

		WebUI.click(findTestObject('semuanya/buttonLoginDiLanding'))
	}

	@When("set email and password correctly as admin")
	def emailandpasswordcorrectly() {

		WebUI.setText(findTestObject('semuanya/emailDimenuLogin'), 'testadmin@gmail.com')

		WebUI.setText(findTestObject('semuanya/passwordDimenuLogin'), 'password')
	}

	@And("Click sign in button as admin")
	def buttonpositive() {
		WebUI.click(findTestObject('semuanya/ButtonSignIn'))
	}

	@Then("login is success as admin")
	def loginsucces() {
		WebUI.verifyElementPresent(findTestObject('Instructor/IconKelompok'), 0)

		WebUI.closeBrowser()
	}

	// Negative

	@Given("navigate to landing page and click login button for negative case as admin")
	def urlNegative() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://harsaedu.my.id/')

		WebUI.click(findTestObject('semuanya/buttonLoginDiLanding'))
	}

	@When("set (.*) or (.*) incorrectly as admin")
	def emailandpasswordincorrectly(String email, String password) {

		WebUI.setText(findTestObject('semuanya/emailDimenuLogin'), email)

		WebUI.setText(findTestObject('semuanya/passwordDimenuLogin'), password)
	}

	@And("Click sign in button for negative case as admin")
	def buttonnegative() {
		WebUI.click(findTestObject('semuanya/ButtonSignIn'))
	}

	@Then("login failed as admin")
	def loginfailed() {
		WebUI.getText(findTestObject('semuanya/alert email atau password salah'), FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(3)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()
	}

	// negative without email
	@Given("navigate to landing page and click login button2 as admin")
	def urlNegative2() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://harsaedu.my.id/')

		WebUI.click(findTestObject('semuanya/buttonLoginDiLanding'))
	}

	@When("set without email as admin")
	def withoutemail() {

		WebUI.setText(findTestObject('semuanya/emailDimenuLogin'), '')

		WebUI.setText(findTestObject('semuanya/passwordDimenuLogin'), 'password')
	}

	@And("Click sign in button2 as admin")
	def buttonnegative2() {
		WebUI.click(findTestObject('semuanya/ButtonSignIn'))
	}

	@Then("login is failed as admin")
	def loginfailed2() {
		WebUI.getText(findTestObject('semuanya/email wajib diisi'), FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(3)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()
	}



	// negative without password
	@Given("navigate to landing page and click login button3 as admin")
	def urlNegative3() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://harsaedu.my.id/')

		WebUI.click(findTestObject('semuanya/buttonLoginDiLanding'))
	}

	@When("set without password as admin")
	def withoutpassword() {

		WebUI.setText(findTestObject('semuanya/emailDimenuLogin'), 'testadmin@gmail.com')

		WebUI.setText(findTestObject('semuanya/passwordDimenuLogin'), '')
	}

	@And("Click sign in button3 as admin")
	def buttonnegative3() {
		WebUI.click(findTestObject('semuanya/ButtonSignIn'))
	}

	@Then("login is failed2 as admin")
	def loginfailed3() {
		WebUI.getText(findTestObject('semuanya/password wajib di isi'), FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(3)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()
	}
}