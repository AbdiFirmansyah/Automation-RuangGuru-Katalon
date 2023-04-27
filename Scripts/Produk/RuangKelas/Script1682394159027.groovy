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

WebUI.click(findTestObject('Object Repository/Produk/RuangKelas/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.mouseOver(findTestObject('Object Repository/Produk/RuangKelas/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Produk'))

WebUI.click(findTestObject('Object Repository/Produk/RuangKelas/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Sistem Kelola Pembelajaran Jarak Jauh GRATIS'))

WebUI.click(findTestObject('Object Repository/Produk/RuangKelas/Page_Aplikasi LMS Online 1 di Indonesia  Ru_8b22ce/a_Coba ruangkelas Gratis'))

WebUI.switchToWindowTitle('ruangkelas')

WebUI.click(findTestObject('Object Repository/Produk/RuangKelas/Page_ruangkelas/div_Masuk'))

WebUI.setText(findTestObject('Object Repository/Produk/RuangKelas/Page_Masuk - ruangkelas/input_ruangkelas_email'), 'abcd')

WebUI.setEncryptedText(findTestObject('Object Repository/Produk/RuangKelas/Page_Masuk - ruangkelas/input_ruangkelas_password'), 
    'vboZJ1Yxnwj8EMcDNoezWQ==')

WebUI.click(findTestObject('Object Repository/Produk/RuangKelas/Page_Masuk - ruangkelas/svg_ruangkelas_css-0'))

WebUI.click(findTestObject('Object Repository/Produk/RuangKelas/Page_Masuk - ruangkelas/span_ruangkelas_chakra-checkbox__control cs_5c7b1d'))

WebUI.click(findTestObject('Object Repository/Produk/RuangKelas/Page_Masuk - ruangkelas/button_Masuk'))

WebUI.closeBrowser()

