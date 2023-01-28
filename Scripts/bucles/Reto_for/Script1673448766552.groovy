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

WebUI.navigateToUrl('https://demoqa.com/text-box')

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 250)

for (x=1; x<=5; x++) {
	
	//Para utilizar numeros aleatorios
	//int num= (Math.random() * (100) as int)
	
	//Arreglo para hacer el recorrido con nombre reales utilizando el random (en los campos nombre y email)
	def z = ["Carlos", "Erika", "Paco", "Rodrigo", "Josefina"]
	Random rn= new Random()
	tx_nombre= z[rn.nextInt(z.size)] 
	

	WebUI.setText(findTestObject('Object Repository/Reto_for/Page_ToolsQA/input_Full Name_userName'), tx_nombre)
	
	WebUI.setText(findTestObject('Object Repository/Reto_for/Page_ToolsQA/input_Email_userEmail'), tx_nombre + '@gmail.com')
	
	WebUI.setText(findTestObject('Object Repository/Reto_for/Page_ToolsQA/textarea_Current Address_currentAddress'), 'Direccion' + x)
	
	WebUI.setText(findTestObject('Object Repository/Reto_for/Page_ToolsQA/textarea_Permanent Address_permanentAddress'), 'Direccion' + x)
	
	WebUI.click(findTestObject('Object Repository/Reto_for/Page_ToolsQA/button_Submit'))
	
	WebUI.delay(2)
}

WebUI.closeBrowser()

