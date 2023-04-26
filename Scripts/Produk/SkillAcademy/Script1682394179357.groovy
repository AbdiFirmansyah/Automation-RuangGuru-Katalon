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

WebUI.click(findTestObject('Object Repository/SkillAcademy/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.click(findTestObject('Object Repository/SkillAcademy/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Produk'))

WebUI.click(findTestObject('Object Repository/SkillAcademy/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/div_Kursus online untuk meningkatkan techni_9040f7'))

WebUI.switchToWindowTitle('Kursus & Kelas Online Bersertifikat Terbaik | Skill Academy')

WebUI.click(findTestObject('Object Repository/SkillAcademy/Page_Kursus  Kelas Online Bersertifikat Ter_36758b/p_'))

WebUI.click(findTestObject('Object Repository/SkillAcademy/Page_Kursus  Kelas Online Bersertifikat Ter_36758b/div_DAFTARMASUK'))

WebUI.setText(findTestObject('Object Repository/SkillAcademy/Page_Skill Academy/input_Masuk ke akun Skill Academy kamu_css-1j6p4yb'), 
    'abdifirmansyah72@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SkillAcademy/Page_Skill Academy/input_Email tidak valid_css-1j6p4yb'), 
    '5P+s+FfPGX+9A6lrdXP7gw==')

WebUI.closeBrowser()

