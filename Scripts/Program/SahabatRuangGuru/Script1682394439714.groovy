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

WebUI.click(findTestObject('Object Repository/SahabatRuangGuru/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.click(findTestObject('Object Repository/SahabatRuangGuru/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Program'))

WebUI.scrollToPosition(0, 1500)

WebUI.click(findTestObject('Object Repository/SahabatRuangGuru/Page_Daftar Program Terbaru Ruangguru, Yuk _ccafde/a_Lihat Detail'))

WebUI.scrollToPosition(0, 3200)

WebUI.click(findTestObject('Object Repository/SahabatRuangGuru/Page_Program Sahabat Ruangguru, Bagikan Kod_0b7189/button_Daftar                    Sekarang'))

WebUI.switchToWindowTitle('Form')

WebUI.setText(findTestObject('Object Repository/SahabatRuangGuru/Page_Form/input_Nama_firstname'), 'Viski Arditia')

WebUI.setText(findTestObject('Object Repository/SahabatRuangGuru/Page_Form/input_Mohon diisi sesuai dengan email aktif_a97e45'), 
    'ViskiAnjaay@gmail.com')

WebUI.setText(findTestObject('Object Repository/SahabatRuangGuru/Page_Form/input_Nomor HP (Terhubung ke Whatsapp)_phone'), 
    '087654321')

WebUI.selectOptionByValue(findTestObject('Object Repository/SahabatRuangGuru/Page_Form/select_Please SelectSiswa SD-SMAMahasiswaIb_fd9846'), 
    'Content creator, contoh: Youtuber/Tiktoker/Blogger/Influencer', true)

WebUI.setText(findTestObject('Object Repository/SahabatRuangGuru/Page_Form/input_Username Akun Social Media Kamu_social_media'), 
    '@viskiarditia')

WebUI.click(findTestObject('Object Repository/SahabatRuangGuru/Page_Form/input_Sudah_apakah_kamu_sudah_memiliki_acco_755d60'))

WebUI.click(findTestObject('Object Repository/SahabatRuangGuru/Page_Form/input_Belum_apakah_anda_bekerja_sebagai_peg_8905cc'))

WebUI.click(findTestObject('Object Repository/SahabatRuangGuru/Page_Form/input_Tidak_saya_telah_membaca_dan_menyetuj_36fb98'))

WebUI.closeBrowser()

