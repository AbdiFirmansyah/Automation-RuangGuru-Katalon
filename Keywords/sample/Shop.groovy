package sample


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Shop {

	@Keyword
	def static void navigatetoDetailPage(String productName,String urlProduct){
		String temp = '/' + productName.replaceAll(" ", "-").toLowerCase()
		String urlDetail = urlProduct + temp
		WebUI.navigateToUrl(urlDetail)
	}
	@Keyword
	def static void addToCart(String productName,String urlProduct){
		navigatetoDetailPage(productName, urlProduct)
		WebUI.waitForElementPresent(findTestObject('Pages/Shop page/btnAddToCart'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Pages/Shop page/btnAddToCart'))

		WebUI.waitForElementPresent(findTestObject('Pages/Shop page/lnkViewCart'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Pages/Shop page/lnkViewCart'))

		WebUI.verifyElementPresent(findTestObject('Pages/Shop page/btnProceed'), GlobalVariable.waitPresentTimeout)
	}

	@Keyword
	def static void applyCouponAndAddToCart(String productName,String urlProduct,String coupon){
		navigatetoDetailPage(productName, urlProduct)
		WebUI.delay(5)

		WebUI.waitForElementPresent(findTestObject('Pages/Shop page/btnAddToCart'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Pages/Shop page/btnAddToCart'))

		WebUI.waitForElementPresent(findTestObject('Pages/Shop page/lnkViewCart'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Pages/Shop page/lnkViewCart'))

		WebUI.setText(findTestObject('Pages/Shop page/txtCoupon'), coupon)
		WebUI.click(findTestObject('Pages/Shop page/btnApply'))
	}

	@Keyword
	def static void addToCartWithGlobalVariable(){
		addToCart(GlobalVariable.productName,GlobalVariable.urlProduct)
	}

	@Keyword
	def static void applyCouponAndAddToCartWithGlobalVariable(){
		applyCouponAndAddToCart(GlobalVariable.productName, GlobalVariable.urlProduct, GlobalVariable.coupon)
	}
}
