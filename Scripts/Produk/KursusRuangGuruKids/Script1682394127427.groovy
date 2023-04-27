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

WebUI.click(findTestObject('Object Repository/KursusRuangGuruKids/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.click(findTestObject('Object Repository/KursusRuangGuruKids/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Produk'))

WebUI.click(findTestObject('Object Repository/KursusRuangGuruKids/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Kursus online untuk anak 4-7 tahun deng_0adff5'))

WebUI.click(findTestObject('Object Repository/KursusRuangGuruKids/Page_KursusLes Terbaik untuk Anak Usia Dini_85566f/a_Lihat Detail'))

WebUI.setText(findTestObject('Object Repository/KursusRuangGuruKids/Page_KursusLes Matematika, Bahasa Inggris  _024921/input__firstname'), 
    'Viski Arditia')

WebUI.setText(findTestObject('Object Repository/KursusRuangGuruKids/Page_KursusLes Matematika, Bahasa Inggris  _024921/input__email'), 
    'viskianjay@gmail.com')

WebUI.setText(findTestObject('Object Repository/KursusRuangGuruKids/Page_KursusLes Matematika, Bahasa Inggris  _024921/input__phone-07ec13ea-342b-46c1-8ea0-44bc333c5190'), 
    '87654321')

WebUI.setText(findTestObject('Object Repository/KursusRuangGuruKids/Page_KursusLes Matematika, Bahasa Inggris  _024921/input__asal_kota'), 
    'Jakarta Selatan')

WebUI.setText(findTestObject('Object Repository/KursusRuangGuruKids/Page_KursusLes Matematika, Bahasa Inggris  _024921/input__student_name'), 
    'miya kusuma')

WebUI.closeBrowser()

