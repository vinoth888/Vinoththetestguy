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

WebUI.navigateToUrl('https://lifecharger.org/')

WebUI.click(findTestObject('Object Repository/Page_Life Charger   a new beginning/a_Stretch Zone  Why Nobody talks about this'))

WebUI.click(findTestObject('Object Repository/Page_Stretch Zone  Why Nobody talks about t_090026/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_Life Charger   a new beginning/a_Archives'))

WebUI.click(findTestObject('Object Repository/Page_Archives  Life Charger/h1_Life Charger'))

WebUI.setText(findTestObject('Object Repository/Page_Life Charger   a new beginning/input_Search for_s'), 'life')

WebUI.sendKeys(findTestObject('Object Repository/Page_Life Charger   a new beginning/input_Search for_s'), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

