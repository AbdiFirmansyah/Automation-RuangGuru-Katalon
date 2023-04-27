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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.ruangguru.com/')

WebUI.click(findTestObject('Object Repository/RuangBelajar/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.click(findTestObject('Object Repository/RuangBelajar/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Produk'))

WebUI.click(findTestObject('Object Repository/RuangBelajar/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Belajar seru dengan video dan latihan s_ed4424'))

WebUI.click(findTestObject('Object Repository/RuangBelajar/Page_Aplikasi Belajar Online Interaktif 1 d_cbc4ca/img'))

WebUI.click(findTestObject('Object Repository/RuangBelajar/Page_Aplikasi Belajar Online Interaktif 1 d_cbc4ca/button_SMA'))

WebUI.scrollToPosition(0, 2000)

WebUI.switchToWindowTitle('Aplikasi Belajar Online Interaktif #1 di Indonesia | Ruangbelajar')

WebUI.click(findTestObject('Object Repository/RuangBelajar/Page_Aplikasi Belajar Online Interaktif 1 d_cbc4ca/div_Pilih mata pelajaran                  Fisika'))

WebUI.click(findTestObject('Object Repository/RuangBelajar/Page_Aplikasi Belajar Online Interaktif 1 d_cbc4ca/button_Biologi'))

WebUI.click(findTestObject('Object Repository/RuangBelajar/Page_Aplikasi Belajar Online Interaktif 1 d_cbc4ca/a_Lihat Semua Bab'))

WebUI.navigateToUrl('https://app.ruangguru.com/ruangbelajar?lesson_serial=4PDC6KCUYL&school_level_general_serial=4PDC6KCUYL&topic_serial=E8L48A9G69&source_caller=ui&pid=Product&school_level_name=4PDC6KCUYL&lesson_general_serial=4PDC6KCUYL&shortlink=kt9zu6po&lesson_icon_url=https://imgix3.ruangguru.com/assets/ruang_belajar/icon/subject/subj_biologi.png&school_level_serial=4PDC6KCUYL&lesson_display_name=Biologi&c=List%20Bab%20Rubel')

WebUI.closeBrowser()

