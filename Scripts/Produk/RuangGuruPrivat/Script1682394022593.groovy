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

WebUI.click(findTestObject('Object Repository/RuangGuruPrivat/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.click(findTestObject('Object Repository/RuangGuruPrivat/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Produk'))

WebUI.click(findTestObject('Object Repository/RuangGuruPrivat/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Belajar privat dengan guru terbaik pili_dcddab'))

WebUI.click(findTestObject('Object Repository/RuangGuruPrivat/Page_Cari Guru Les Privat untuk Semua Mata _28037c/img_httpstinyurl.comrequestguru_img-fluid h_e9a8d8'))

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/RuangGuruPrivat/Page_Cari Guru Les Privat untuk Semua Mata _28037c/button_Pesan Sekarang'))

WebUI.scrollToPosition(0, 1500)

WebUI.click(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/input_Pilihan Paket_reward_form_submissions_fcc16d'))

WebUI.click(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/span_Pilih Mapel_1'))

WebUI.setText(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/input_Simpan_select2-search__field'), 
    'Fisika')

WebUI.sendKeys(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/input_Simpan_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/input_Offline hanya tersedia untuk JABODETA_1c5a3e'))

WebUI.click(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/span_Pilih Jenjang_1'))

WebUI.setText(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/input_Simpan_select2-search__field'), 
    '12 SMA IPA')

WebUI.sendKeys(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/input_Simpan_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(1500, 2000)

WebUI.click(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/input_Asik dan Seru_reward_form_submissions_e29ccd'))

WebUI.click(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/span_Pilih Daftar sebagai_1'))

WebUI.setText(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/input_Simpan_select2-search__field'), 
    'Orang Tua')

WebUI.sendKeys(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/input_Simpan_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/input_Nama lengkap_reward_form_submissionsu_ad91f6'), 
    'Viski Arditia')

WebUI.setText(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/input_Nomor WhatsApp_reward_form_submission_53c0bd'), 
    '6287654321')

WebUI.setText(findTestObject('Object Repository/RuangGuruPrivat/Page_Pop Up Notif Rg Privat Flash Sale - Ru_3e9ee4/input_Email_reward_form_submissionsubmissio_b84820'), 
    'viskianjay@gmail.com')

WebUI.closeBrowser()

