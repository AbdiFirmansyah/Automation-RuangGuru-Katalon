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

WebUI.click(findTestObject('Object Repository/Robo Guru Plus/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.click(findTestObject('Object Repository/Robo Guru Plus/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Produk'))

WebUI.click(findTestObject('Object Repository/Robo Guru Plus/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Konsultasikan soal tersulit kamu sebany_33667e'))

WebUI.click(findTestObject('Object Repository/Robo Guru Plus/Page_Platform Tanya  Jawab Soal Semua Pelaj_5970be/a_Langganan Sekarang'))

WebUI.switchToWindowTitle('Langganan ruangbelajar')

WebUI.click(findTestObject('Object Repository/Robo Guru Plus/Page_Langganan ruangbelajar/div_SD'))

WebUI.click(findTestObject('Object Repository/Robo Guru Plus/Page_Langganan ruangbelajar/div_Kelas 2'))

WebUI.click(findTestObject('Object Repository/Robo Guru Plus/Page_Langganan ruangbelajar/svg_Data produk tidak ditemukan, coba pilih_d90cd4'))

WebUI.closeBrowser()

