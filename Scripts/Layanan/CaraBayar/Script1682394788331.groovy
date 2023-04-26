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

WebUI.click(findTestObject('Object Repository/Cara Bayar/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.click(findTestObject('Object Repository/Cara Bayar/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Layanan'))

WebUI.click(findTestObject('Object Repository/Cara Bayar/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Cara Bayar'))

WebUI.click(findTestObject('Object Repository/Cara Bayar/Page_Cara Pembayaran Paket Bimbel Online di_baf087/img'))

WebUI.click(findTestObject('Object Repository/Cara Bayar/Page_Cara Pembayaran Paket Bimbel Online di_baf087/img'))

WebUI.click(findTestObject('Object Repository/Cara Bayar/Page_Cara Pembayaran Paket Bimbel Online di_baf087/img'))

WebUI.click(findTestObject('Object Repository/Cara Bayar/Page_Cara Pembayaran Paket Bimbel Online di_baf087/img'))

WebUI.click(findTestObject('Object Repository/Cara Bayar/Page_Cara Pembayaran Paket Bimbel Online di_baf087/a_Langganan Sekarang'))

WebUI.switchToWindowTitle('Langganan ruangbelajar')

WebUI.click(findTestObject('Object Repository/Cara Bayar/Page_Langganan ruangbelajar/div_PAUD'))

WebUI.click(findTestObject('Object Repository/Cara Bayar/Page_Langganan ruangbelajar/div_4 Tahun'))

WebUI.closeBrowser()

