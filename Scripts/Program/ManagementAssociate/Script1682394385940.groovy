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

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/span_'))

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Aplikasi Bimbel Online Interaktif Terb_6681bc/a_Program'))

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Daftar Program Terbaru Ruangguru, Yuk _ccafde/a_Lihat Detail'))

WebUI.scrollToPosition(0, 1500)

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Management AssociateTrainee Program (M_204cf6/button_Next'))

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Management AssociateTrainee Program (M_204cf6/button_Next'))

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Management AssociateTrainee Program (M_204cf6/button_Coaching  Mentorship Program'))

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Management AssociateTrainee Program (M_204cf6/button_Types of Roles'))

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Management AssociateTrainee Program (M_204cf6/button_Selection Process'))

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Management AssociateTrainee Program (M_204cf6/button_Testimony'))

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Management AssociateTrainee Program (M_204cf6/button_FAQ'))

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Management AssociateTrainee Program (M_204cf6/div_Who can apply'))

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Management AssociateTrainee Program (M_204cf6/div_What should I prepare for my application'))

WebUI.click(findTestObject('Object Repository/ManagementAssociate/Page_Management AssociateTrainee Program (M_204cf6/button_About Ruangguru'))

WebUI.closeBrowser()

