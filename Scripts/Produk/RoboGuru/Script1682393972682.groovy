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

WebUI.click(findTestObject('Object Repository/Robo Guru/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.click(findTestObject('Object Repository/Robo Guru/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Produk'))

WebUI.click(findTestObject('Object Repository/Robo Guru/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Foto dan upload soal susahmu dan dapatk_69f96b'))

WebUI.click(findTestObject('Object Repository/Robo Guru/Page_Solusi Pengerjaan Soal Pelajaran Sulit_e31362/svg_Bantu Kamu Jawab Soal dengan Tepat, Cep_ad866d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Robo Guru/Page_Solusi Pengerjaan Soal Pelajaran Sulit_e31362/select_SDSMPSMAUTBKSNBT'), 
    'XHAGLMC2TA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Robo Guru/Page_Solusi Pengerjaan Soal Pelajaran Sulit_e31362/select_MatematikaFisikaBiologiBahasa Indone_d51509'), 
    'bahasa-indonesia', true)

WebUI.click(findTestObject('Object Repository/Robo Guru/Page_Solusi Pengerjaan Soal Pelajaran Sulit_e31362/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Robo Guru/Page_Ruangguru/div_Masukkan nomor HP atau email'))

WebUI.setText(findTestObject('Object Repository/Robo Guru/Page_Ruangguru/input_Masukkan nomor HP atau email_emailOrPhone'), 
    'abdifirmansyah72@gmail.com')

WebUI.closeBrowser()

