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

WebUI.navigateToUrl('https://staging-sa-v2.go2joy.vn/hotel/sadmin/login')

WebUI.setText(findTestObject('Object Repository/Page_go2joy_sa/input_Remember Me_el-input__inner'), 'tris.tah')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_go2joy_sa/input_Remember Me_el-input__inner_1'), 'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/Page_go2joy_sa/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Qun l home page/span_ng'))

WebUI.click(findTestObject('Object Repository/Page_Qun l home page/body_strongWere sorry but go2joy_sa doesnt _3033f9'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Qun l home page/body_strongWere sorry but go2joy_sa doesnt _3033f9'))

WebUI.closeBrowser()

