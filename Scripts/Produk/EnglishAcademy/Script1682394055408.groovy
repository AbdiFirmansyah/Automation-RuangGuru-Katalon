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

WebUI.click(findTestObject('Object Repository/Produk/EnglishAcademy/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.mouseOver(findTestObject('Object Repository/Produk/EnglishAcademy/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Produk'))

WebUI.click(findTestObject('Object Repository/Produk/EnglishAcademy/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Kursus Bahasa Inggris dengan Pengajar A_82f25c'))

WebUI.switchToWindowTitle('Kursus/Les Bahasa Inggris Online Interaktif | English Academy')

WebUI.click(findTestObject('Object Repository/Produk/EnglishAcademy/Page_KursusLes Bahasa Inggris Online Intera_2431dc/div_Langganan Sekarang'))

WebUI.switchToWindowTitle('Langganan ruangbelajar')

WebUI.click(findTestObject('Object Repository/Produk/EnglishAcademy/Page_Langganan ruangbelajar/button_Pilih'))

WebUI.click(findTestObject('Object Repository/Produk/EnglishAcademy/Page_Langganan ruangbelajar/button_Beli'))

WebUI.setText(findTestObject('Object Repository/Produk/EnglishAcademy/Page_Langganan ruangbelajar/input_Nama orang tua atau wali siswa_name'), 
    'Kukuh')

WebUI.setText(findTestObject('Object Repository/Produk/EnglishAcademy/Page_Langganan ruangbelajar/input_Nomor handphone siswa_phoneNumber'), 
    '896553333222444')

WebUI.setText(findTestObject('Object Repository/Produk/EnglishAcademy/Page_Langganan ruangbelajar/input_Email aktif_email'), 
    'Salah email')

WebUI.click(findTestObject('Object Repository/Produk/EnglishAcademy/Page_Langganan ruangbelajar/div_Email yang dimasukkan harus valid'))

WebUI.closeBrowser()

