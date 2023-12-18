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
import org.openqa.selenium.Keys as Keys

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



class Managekelas {
	//	filter
	@Given("login and go to class menu")
	def loginclassmenu() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))
	}

	@When("set filter category and select category")
	def filtercategory() {
		WebUI.click(findTestObject('Admin/manage class/filter/button filter'))

		WebUI.click(findTestObject('Admin/manage class/filter/filter mobile'))

		WebUI.click(findTestObject('Admin/manage class/filter/klii untuk tidak keluar isi filter'))
	}

	@Then("Check the category filter results")
	def checkfilterresult() {
		WebUI.getText(findTestObject('Admin/manage class/filter/succes mobile'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()
	}

	//search
	@Given("login and go to class menu2")
	def loginclassmenu2() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))
	}

	@When("set search correctly")
	def searchcategory() {
		WebUI.setText(findTestObject('Admin/manage class/search/search'), 'mobile')
	}

	@Then("check search results")
	def checksearchresult() {
		WebUI.getText(findTestObject('Admin/manage class/search/sukses search mobile'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()

	}


	@Given("login and go to class menu3")
	def loginclassmenu3() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))
	}

	@When("set search incorrectly")
	def searchcategoryincorrectly() {
		WebUI.setText(findTestObject('Admin/manage class/search/search'), 'helloworld')
	}

	@Then("check search results2")
	def checksearchresult2() {
		WebUI.getText(findTestObject('Admin/manage class/search/gagal search'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()
	}


	//create class
	@Given("login and go to form create class")
	def loginformcreateclass() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button tambah kelas'))
	}

	@When("set all data properly and click save button")
	def setalldataproperly() {
		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/judul'), 'Uji coba')

		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/deskripsi'), 'ini kelas untuk uji coba')

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/kategori'), '3', false)

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/instructor'), '1001', false)

		WebUI.uploadFile(findTestObject('Admin/manage class/tambah kelas/upload file'), 'D:\\MBKM\\Capstone\\test\\test1.jpg')

		WebUI.delay(2)

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button simpan'))
	}

	@Then("check pop up success")
	def checkpopupsucces() {
		WebUI.getText(findTestObject('Admin/manage class/tambah kelas/succes tambah'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/x'))

		WebUI.closeBrowser()
	}

	@Given("login and go to form create class2")
	def loginformcreateclass2() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button tambah kelas'))
	}

	@When("do not fill in title textfield and click save button")
	def donotfillintitletextfield() {
		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/deskripsi'), 'ini kelas untuk uji coba')

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/kategori'), '3', false)

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/instructor'), '1001', false)

		WebUI.uploadFile(findTestObject('Admin/manage class/tambah kelas/upload file'), 'D:\\MBKM\\Capstone\\test\\test1.jpg')

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button simpan'))
	}

	@Then("check message tittle")
	def checkmessagetitle() {
		WebUI.getText(findTestObject('Admin/manage class/tambah kelas/message judul wajib'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()
	}


	@Given("login and go to form create class3")
	def loginformcreateclass3() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button tambah kelas'))
	}

	@When("do not fill in description textfield and click save button")
	def donotfillindescriptiontextfield() {
		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/judul'), 'Uji coba')

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/kategori'), '3', false)

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/instructor'), '1001', false)

		WebUI.uploadFile(findTestObject('Admin/manage class/tambah kelas/upload file'), 'D:\\MBKM\\Capstone\\test\\test1.jpg')

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button simpan'))
	}

	@Then("check message description")
	def checkmessagedescription() {
		WebUI.getText(findTestObject('Admin/manage class/tambah kelas/message deskripsi wajib'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()

	}


	@Given("login and go to form create class4")
	def loginformcreateclass4() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button tambah kelas'))
	}

	@When("do not fill in category select box and click save button")
	def donotfillincategoryselectbox() {
		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/judul'), 'Uji coba')

		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/deskripsi'), 'ini kelas untuk uji coba')

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/instructor'), '1001', false)

		WebUI.uploadFile(findTestObject('Admin/manage class/tambah kelas/upload file'), 'D:\\MBKM\\Capstone\\test\\test1.jpg')

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button simpan'))
	}

	@Then("check message category")
	def checkmessagecategory() {
		WebUI.getText(findTestObject('Admin/manage class/tambah kelas/message kategori wajib'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()

	}


	@Given("login and go to form create class5")
	def loginformcreateclass5() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button tambah kelas'))
	}

	@When("do not fill in instructor select box and click save button")
	def donotfillininstructorselectbox() {
		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/judul'), 'Uji coba')

		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/deskripsi'), 'ini kelas untuk uji coba')

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/kategori'), '3', false)

		WebUI.uploadFile(findTestObject('Admin/manage class/tambah kelas/upload file'), 'D:\\MBKM\\Capstone\\test\\test1.jpg')

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button simpan'))
	}

	@Then("check message instructor")
	def checkmessageinstructor() {
		WebUI.getText(findTestObject('Admin/manage class/tambah kelas/message instructor wajib'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()

	}


	@Given("login and go to form create class6")
	def loginformcreateclass6() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button tambah kelas'))
	}

	@When("do not fill in upload image and click save button")
	def donotfillinuploadimage() {
		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/judul'), 'Uji coba')

		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/deskripsi'), 'ini kelas untuk uji coba')

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/kategori'), '3', false)

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/instructor'), '1001', false)

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button simpan'))


	}

	@Then("check message image")
	def checkmessageimage() {
		WebUI.getText(findTestObject('Admin/manage class/tambah kelas/message gambar wajib'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()

	}


	@Given("login and go to form create class7")
	def loginformcreateclass7() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button tambah kelas'))
	}

	@When("upload a large image and click save button")
	def uploadlargeimage() {
		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/judul'), 'Uji coba')

		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/deskripsi'), 'ini kelas untuk uji coba')

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/kategori'), '3', false)

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/instructor'), '1001', false)

		WebUI.uploadFile(findTestObject('Admin/manage class/tambah kelas/upload file'), 'D:\\MBKM\\Capstone\\test\\test3.jpg')

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button simpan'))
	}

	@Then("check message image is too large")
	def checkmessageimagelarge() {
		WebUI.getText(findTestObject('Admin/manage class/tambah kelas/message gambar ukuran'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()


	}

	@Given("login and go to form create class8")
	def loginformcreateclass8() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button tambah kelas'))
	}

	@When("upload wrong format image and click save button")
	def uploadwrongformatimage() {
		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/judul'), 'Uji coba')

		WebUI.setText(findTestObject('Admin/manage class/tambah kelas/deskripsi'), 'ini kelas untuk uji coba')

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/kategori'), '3', false)

		WebUI.selectOptionByValue(findTestObject('Admin/manage class/tambah kelas/instructor'), '1001', false)

		WebUI.uploadFile(findTestObject('Admin/manage class/tambah kelas/upload file'), 'D:\\MBKM\\Capstone\\test\\test2.gif')

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button simpan'))
	}

	@Then("check message image is formatted incorrectly")
	def checkmessageformatimage() {
		WebUI.getText(findTestObject('Admin/manage class/tambah kelas/message gambar format'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()

	}

	@Given("login and go to form create class9")
	def loginformcreateclass9() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button tambah kelas'))
	}

	@When("click cancel button")
	def cancel() {
		WebUI.click(findTestObject('Admin/manage class/tambah kelas/button batal'))
	}

	@Then("check return to previous page")
	def checkreturnpage() {
		WebUI.getText(findTestObject('Admin/manage class/tambah kelas/succes back'))

		WebUI.closeBrowser()


	}


	//edit kelas
	@Given("login and go to form edit class")
	def loginformcedit() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/manage kelas'))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/icon edit kelas'))

		WebUI.delay(2)
	}

	@When("set title and click save button")
	def settitleedit() {
		WebUI.setText(findTestObject('Admin/manage class/edit kelas/judul'), 'uji coba edit')

		WebUI.click(findTestObject('Admin/manage class/edit kelas/button simpan'))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/konfirmasi simpan'))
	}

	@Then("check pop up success update")
	def checkpopupsuccesupdate() {
		WebUI.getText(findTestObject('Admin/manage class/edit kelas/succes update'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Admin/manage class/edit kelas/x'))

		WebUI.closeBrowser()


	}

	@Given("login and go to form edit class2")
	def loginformcedit2() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/manage kelas'))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/icon edit kelas'))

		WebUI.delay(2)
	}

	@When("delete contents of title text field and click save button")
	def deletetitleedit() {
		WebUI.sendKeys(findTestObject('Admin/manage class/edit kelas/judul'), Keys.chord(Keys.CONTROL, 'a'))

		WebUI.sendKeys(findTestObject('Admin/manage class/edit kelas/judul'), Keys.chord(Keys.BACK_SPACE))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/button simpan'))
	}

	@Then("check message edit title")
	def checkmessageedittitle() {
		WebUI.getText(findTestObject('Admin/manage class/edit kelas/message judul wajib'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()


	}

	@Given("login and go to form edit class3")
	def loginformcedit3() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/manage kelas'))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/icon edit kelas'))

		WebUI.delay(2)
	}

	@When("delete contents of description text field and click save button")
	def deletedescriptionedit() {
		WebUI.sendKeys(findTestObject('Admin/manage class/edit kelas/deskripsi'), Keys.chord(Keys.CONTROL, 'a'))

		WebUI.sendKeys(findTestObject('Admin/manage class/edit kelas/deskripsi'), Keys.chord(Keys.BACK_SPACE))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/button simpan'))
	}

	@Then("check message edit description")
	def checkmessageeditdesc() {
		WebUI.getText(findTestObject('Admin/manage class/edit kelas/deskripsi wajib'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()


	}

	@Given("login and go to form edit class4")
	def loginformcedit4() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/manage kelas'))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/icon edit kelas'))

		WebUI.delay(2)
	}

	@When("upload a large image and click the save button")
	def uploadlargeimageedit() {
		WebUI.click(findTestObject('Admin/manage class/edit kelas/hapus foto'))

		WebUI.uploadFile(findTestObject('Admin/manage class/edit kelas/upload foto'), 'D:\\MBKM\\Capstone\\test\\test3.jpg')

		WebUI.click(findTestObject('Admin/manage class/edit kelas/button simpan'))
	}

	@Then("check message edit image large")
	def checkmessageimagelargeedit() {
		WebUI.getText(findTestObject('Admin/manage class/edit kelas/message gambar ukuran'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()


	}

	@Given("login and go to form edit class5")
	def loginformcedit5() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/manage kelas'))

		WebUI.click(findTestObject('Admin/manage class/edit kelas/icon edit kelas'))

		WebUI.delay(2)
	}

	@When("upload an incorrectly formatted image and click the save button")
	def uploadimageformatedit() {
		WebUI.click(findTestObject('Admin/manage class/edit kelas/hapus foto'))

		WebUI.uploadFile(findTestObject('Admin/manage class/edit kelas/upload foto'), 'D:\\MBKM\\Capstone\\test\\test2.gif')

		WebUI.click(findTestObject('Admin/manage class/edit kelas/button simpan'))
	}

	@Then("check message edit image format incorrectly")
	def checkmessageeditformatimage() {
		WebUI.getText(findTestObject('Admin/manage class/edit kelas/message gambar format'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.closeBrowser()


	}


	//delete kelas
	@Given("login and go to delete class")
	def logindeleteclass() {
		WebUI.callTestCase(findTestCase('Admin/Login/Positive/Login/LoginAdmin'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Admin/manage class/page content management'))

		WebUI.click(findTestObject('Admin/manage class/page class'))
	}

	@When("click button delete and confirm")
	def deleteclass() {
		WebUI.click(findTestObject('Admin/manage class/delete class/icon delete'))

		WebUI.click(findTestObject('Admin/manage class/delete class/konfirmasi delete'))
	}

	@Then("check message success delete")
	def checkmessagedeleteclass() {
		WebUI.getText(findTestObject('Admin/manage class/delete class/succes delete'))

		WebUI.delay(2)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Admin/manage class/delete class/x'))

		WebUI.closeBrowser()

	}


}