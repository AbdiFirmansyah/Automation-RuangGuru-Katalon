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

WebUI.navigateToUrl('https://www.ruangguru.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/BeasiswaRuangGuru/KesetaraanPaketC/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.click(findTestObject('Object Repository/BeasiswaRuangGuru/KesetaraanPaketC/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Beasiswa'))

WebUI.click(findTestObject('Object Repository/BeasiswaRuangGuru/KesetaraanPaketC/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Beasiswa'))

WebUI.click(findTestObject('Object Repository/BeasiswaRuangGuru/KesetaraanPaketC/Page_Program Beasiswa Unggulan di Ruangguru_f50c03/a_Lihat Detail'))

WebUI.click(findTestObject('Object Repository/BeasiswaRuangGuru/KesetaraanPaketC/Page_Program Beasiswa Akademi Ruangguru Khu_6c1d0b/a_Daftarkan Dirimu Disini'))

WebUI.switchToWindowTitle('Registrasi Program Beasiswa Akademi Ruangguru - SKB & PKBM')

WebUI.click(findTestObject('Object Repository/BeasiswaRuangGuru/KesetaraanPaketC/Page_Registrasi Program Beasiswa Akademi Ru_5e5e41/div_Registrasi Program Beasiswa Akademi Rua_1d8659'))

WebUI.closeBrowser()

