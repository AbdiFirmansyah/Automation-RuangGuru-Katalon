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

WebUI.click(findTestObject('Object Repository/Produk/RuangUji/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/button_Kelas 12 IPS'))

WebUI.mouseOver(findTestObject('Object Repository/Produk/RuangUji/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Produk'))

WebUI.click(findTestObject('Object Repository/Produk/RuangUji/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Ikut tryout online dan lihat hasilnya di sini'))

WebUI.click(findTestObject('Object Repository/Produk/RuangUji/Page_Try Out UTBK-SNBT 2023 Online, Persiap_4932d4/button_Beli Paket'))

WebUI.switchToWindowTitle('Langganan ruangbelajar')

WebUI.click(findTestObject('Object Repository/Produk/RuangUji/Page_Langganan ruangbelajar/button_Beli'))

WebUI.setText(findTestObject('Object Repository/Produk/RuangUji/Page_Langganan ruangbelajar/input_atau masukkan_guestIdentity'), 
    '089655327868')

WebUI.click(findTestObject('Object Repository/Produk/RuangUji/Page_Langganan ruangbelajar/div_Nomor HP atau email siswa akan digunaka_559a1a'))

WebUI.setText(findTestObject('Object Repository/Produk/RuangUji/Page_Langganan ruangbelajar/input_Kirim informasi pembelian ke orang tu_624cd8'), 
    '089655327868')

WebUI.click(findTestObject('Object Repository/Produk/RuangUji/Page_Langganan ruangbelajar/button_Pilih Metode Bayar'))

WebUI.setText(findTestObject('Object Repository/Produk/RuangUji/Page_Langganan ruangbelajar/input_Nomor ini sudah terdaftar_buyerIdentity'), 
    'iniakunsalah')

WebUI.click(findTestObject('Object Repository/Produk/RuangUji/Page_Langganan ruangbelajar/button_Konfirmasi Kepemilikan Akun'))

WebUI.click(findTestObject('Object Repository/Produk/RuangUji/Page_Langganan ruangbelajar/div_Email tidak valid'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

