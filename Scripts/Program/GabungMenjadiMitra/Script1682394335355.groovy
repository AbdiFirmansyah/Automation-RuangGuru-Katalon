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

WebUI.click(findTestObject('Object Repository/Gabung Menjadi Mitra/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.click(findTestObject('Object Repository/Gabung Menjadi Mitra/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Program'))

WebUI.click(findTestObject('Object Repository/Gabung Menjadi Mitra/Page_Daftar Program Terbaru Ruangguru, Yuk _ccafde/a_Lihat Detail'))

WebUI.click(findTestObject('Object Repository/Gabung Menjadi Mitra/Page_Akademia - Ruangguru/button_Register'))

WebUI.click(findTestObject('Object Repository/Gabung Menjadi Mitra/Page_Akademia - Ruangguru/svg_Muat lebih banyak_chakra-icon css-onkibi'))

WebUI.click(findTestObject('Object Repository/Gabung Menjadi Mitra/Page_Akademia - Ruangguru/button_Login'))

WebUI.setText(findTestObject('Object Repository/Gabung Menjadi Mitra/Page_Masuk - Ruang Pengajar Web/input_Ruang Pengajar Web_email'), 
    'abdifirmansyah72@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Gabung Menjadi Mitra/Page_Masuk - Ruang Pengajar Web/input_Ruang Pengajar Web_password'), 
    '5P+s+FfPGX+9A6lrdXP7gw==')

WebUI.closeBrowser()

