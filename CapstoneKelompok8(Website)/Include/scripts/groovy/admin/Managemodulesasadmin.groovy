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

import org.openqa.selenium.Keys as Keys


class Managemodulesasadmin {
	//	create
	@Given("successful login and go to add module page")
	def addmodulepage() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/tambah'))
	}

	@When("set data in form create modul and click button save")
	def create() {
		WebUI.setText(findTestObject('Admin/Manage modules as admin/create/section'), 'minggu tengah')

		WebUI.setText(findTestObject('Admin/Manage modules as admin/create/judul'), 'ini baru')

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/tambah link materi'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/pilih slide'))

		WebUI.setText(findTestObject('Admin/Manage modules as admin/create/link slide'), 'https://docs.google.com/presentation/d/1dhBUNCg44NRlb1eNCqSGyPjjrmRsbke_V29U9L-jceA/edit?usp=sharing')

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/simpan'))
	}

	@Then("check succes modul")
	def checkmodul() {
		WebUI.getText(findTestObject('Admin/Manage modules as admin/create/succes'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/x'))

		WebUI.closeBrowser()
	}

	@Given("successful login and go to add module page2")
	def addmodulepage2() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/tambah'))
	}

	@When("Don't fill in section and click the save button")
	def create2() {
		WebUI.setText(findTestObject('Admin/Manage modules as admin/create/judul'), 'ini baru')

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/tambah link materi'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/pilih slide'))

		WebUI.setText(findTestObject('Admin/Manage modules as admin/create/link slide'), 'https://docs.google.com/presentation/d/1dhBUNCg44NRlb1eNCqSGyPjjrmRsbke_V29U9L-jceA/edit?usp=sharing')

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/simpan'))
	}

	@Then("check modul")
	def checkmodul2() {
		WebUI.getText(findTestObject('Admin/Manage modules as admin/create/message section'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()
	}


	@Given("successful login and go to add module page3")
	def addmodulepage3() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/tambah'))
	}

	@When("Don't fill in module title and click the save button")
	def create3() {
		WebUI.setText(findTestObject('Admin/Manage modules as admin/create/section'), 'minggu tengah')

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/tambah link materi'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/pilih slide'))

		WebUI.setText(findTestObject('Admin/Manage modules as admin/create/link slide'), 'https://docs.google.com/presentation/d/1dhBUNCg44NRlb1eNCqSGyPjjrmRsbke_V29U9L-jceA/edit?usp=sharing')

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/simpan'))
	}

	@Then("check modul2")
	def checkmodul3() {
		WebUI.getText(findTestObject('Admin/Manage modules as admin/create/message judul'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()
	}


	@Given("successful login and go to add module page4")
	def addmodulepage4() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/tambah'))
	}

	@When("Don't fill in module and click the save button")
	def create4() {
		WebUI.setText(findTestObject('Admin/Manage modules as admin/create/judul'), 'ini baru')

		WebUI.setText(findTestObject('Admin/Manage modules as admin/create/section'), 'minggu baru')

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/tambah link materi'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/pilih slide'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/simpan'))
	}

	@Then("check modul3")
	def checkmodul4() {
		WebUI.getText(findTestObject('Admin/Manage modules as admin/create/message materi'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()

	}


	@Given("successful login and go to add module page5")
	def addmodulepage5() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/tambah'))
	}

	@When("click the cancel button")
	def cancel() {
		WebUI.click(findTestObject('Admin/Manage modules as admin/create/batal'))

	}

	@Then("check cancel")
	def checkcancel() {
		WebUI.getText(findTestObject('Admin/Manage modules as admin/create/succes cancel'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()

	}


	//create setelah section


	@Given("successful login and go to manage module page")
	def managemodulepage() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/manage modul'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/tambah'))
	}

	@When("set data and click the save button")
	def setdata() {
		WebUI.setText(findTestObject('Admin/Manage modules as admin/create after section/judul'), 'ini baru')

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/tambah materi'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/pilih slide'))

		WebUI.setText(findTestObject('Admin/Manage modules as admin/create after section/link materi'), 'https://docs.google.com/presentation/d/1dhBUNCg44NRlb1eNCqSGyPjjrmRsbke_V29U9L-jceA/edit?usp=sharing')

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/simpan'))

	}

	@Then("check modul4")
	def check() {
		WebUI.getText(findTestObject('Admin/Manage modules as admin/create after section/succes'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/x'))

		WebUI.closeBrowser()

	}


	@Given("successful login and go to manage module page2")
	def managemodulepage2() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/manage modul'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/tambah'))
	}

	@When("Don't fill in module title and click the save button2")
	def createsection() {
		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/tambah materi'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/pilih slide'))

		WebUI.setText(findTestObject('Admin/Manage modules as admin/create after section/link materi'), 'https://docs.google.com/presentation/d/1dhBUNCg44NRlb1eNCqSGyPjjrmRsbke_V29U9L-jceA/edit?usp=sharing')

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/simpan'))

	}

	@Then("check modul5")
	def check2() {
		WebUI.getText(findTestObject('Admin/Manage modules as admin/create after section/message judul'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()


	}


	@Given("successful login and go to manage module page3")
	def managemodulepage3() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/manage modul'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/tambah'))
	}

	@When("Don't fill in module and click the save button3")
	def createsection2() {
		WebUI.setText(findTestObject('Admin/Manage modules as admin/create after section/judul'), 'ini baru')

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/tambah materi'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/pilih slide'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/simpan'))

	}

	@Then("check modul6")
	def check3() {
		WebUI.getText(findTestObject('Admin/Manage modules as admin/create after section/message link'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()


	}


	//	edit
	@Given("successful login and go to manage module page4")
	def managemodulepage4() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/manage modul'))
	}

	@When("set section and click icon ceklis")
	def edit() {
		WebUI.delay(2)

		WebUI.click(findTestObject('Admin/Manage modules as admin/edit/icon edit'))

		WebUI.setText(findTestObject('Admin/Manage modules as admin/edit/section'), 'ini baru')

		WebUI.click(findTestObject('Admin/Manage modules as admin/edit/ceklis'))

	}

	@Then("check edit")
	def checkedit() {
		WebUI.getText(findTestObject('Admin/Manage modules as admin/edit/succes'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()


	}

	@Given("successful login and go to manage module page5")
	def managemodulepage5() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/manage modul'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/edit/detail'))
	}

	@When("Don't fill in module title and click save button")
	def edit2() {
		WebUI.sendKeys(findTestObject('Admin/Manage modules as admin/edit/judul'), Keys.chord(Keys.CONTROL, 'a'))

		WebUI.sendKeys(findTestObject('Admin/Manage modules as admin/edit/judul'), Keys.chord(Keys.BACK_SPACE))

		WebUI.click(findTestObject('Admin/Manage modules as admin/edit/simpan'))

	}

	@Then("check edit2")
	def checkedit2() {
		WebUI.getText(findTestObject('Admin/Manage modules as admin/edit/message judul'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()


	}


	@Given("successful login and go to manage module page6")
	def managemodulepage6() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/manage modul'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/edit/detail'))
	}

	@When("Don't fill in module and click save button")
	def edit3() {
		WebUI.sendKeys(findTestObject('Admin/Manage modules as admin/edit/link materi'), Keys.chord(Keys.CONTROL, 'a'))

		WebUI.sendKeys(findTestObject('Admin/Manage modules as admin/edit/link materi'), Keys.chord(Keys.BACK_SPACE))

		WebUI.click(findTestObject('Admin/Manage modules as admin/edit/simpan'))

	}

	@Then("check edit3")
	def checkedit3() {
		WebUI.getText(findTestObject('Admin/Manage modules as admin/edit/message materi'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()


	}

	//	delete
	@Given("successful login and go to manage module page7")
	def managemodulepage7() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create/manage kelas'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/create after section/manage modul'))
	}

	@When("delete")
	def delete() {
		WebUI.click(findTestObject('Admin/Manage modules as admin/delete/icon hapus'))

		WebUI.click(findTestObject('Admin/Manage modules as admin/delete/yes hapus'))

		WebUI.delay(2)

	}

	@Then("check delete")
	def checkdelete() {
		WebUI.takeFullPageScreenshot()

		WebUI.getText(findTestObject('Admin/Manage modules as admin/delete/succes hapus'))

		WebUI.closeBrowser()


	}


}