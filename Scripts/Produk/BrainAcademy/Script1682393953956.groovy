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

WebUI.click(findTestObject('Object Repository/Produk/BrainAcademy/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.mouseOver(findTestObject('Object Repository/Produk/BrainAcademy/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Produk'))

WebUI.click(findTestObject('Object Repository/Produk/BrainAcademy/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Bimbel Live Interaktif bersama STAR Mas_167048'))

WebUI.switchToWindowTitle('Bimbel Online & Offline Terbaik di Indonesia | Brain Academy')

WebUI.click(findTestObject('Object Repository/Produk/BrainAcademy/Page_Bimbel Online  Offline Terbaik di Indo_ed1fa9/button_Brain Academy Center_close'))

WebUI.click(findTestObject('Object Repository/Produk/BrainAcademy/Page_Bimbel Online  Offline Terbaik di Indo_ed1fa9/a_Coba Kelas Gratis'))

WebUI.switchToWindowTitle('Coba Gratis Kelas Live Teaching Brain Academy Online Sekarang!')

WebUI.click(findTestObject('Object Repository/Produk/BrainAcademy/Page_Coba Gratis Kelas Live Teaching Brain _d65607/button_Daftar  Masuk'))

WebUI.click(findTestObject('Object Repository/Produk/BrainAcademy/Page_Ruangguru/div_Masukkan nomor HP atau email'))

WebUI.setText(findTestObject('Object Repository/Produk/BrainAcademy/Page_Ruangguru/input_Masukkan nomor HP atau email_emailOrPhone'), 
    'email salah')

WebUI.click(findTestObject('Object Repository/Produk/BrainAcademy/Page_Ruangguru/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Produk/BrainAcademy/Page_Ruangguru/div_Email yang dimasukkan tidak benar'))

WebUI.closeBrowser()

