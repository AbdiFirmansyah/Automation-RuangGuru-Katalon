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

WebUI.click(findTestObject('Object Repository/Layanan/PerpanjangPaket/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.mouseOver(findTestObject('Object Repository/Layanan/PerpanjangPaket/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Layanan'))

WebUI.click(findTestObject('Object Repository/Layanan/PerpanjangPaket/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Cara Perpanjang Paket'))

WebUI.click(findTestObject('Object Repository/Layanan/PerpanjangPaket/Page_Perpanjang Paket Belajar  Raih Diskonn_a1bab4/h2_Syarat dan Ketentuan Promo LANJUTBELAJAR'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

