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

WebUI.navigateToUrl('https://myih.telkom.co.id/')

WebUI.click(findTestObject('Object Repository/Page_IndiHome/button_MasukDaftar'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_Daftar'))

WebUI.setText(findTestObject('Object Repository/Page_IndiHome/input_Nama lengkap_fullName'), 'Melva Panjaitan')

WebUI.setText(findTestObject('Object Repository/Page_IndiHome/input_Nomor Ponsel_mobileNumber'), '082167448348')

WebUI.setText(findTestObject('Object Repository/Page_IndiHome/input_Email_email'), 'melvaapjtn@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_IndiHome/input_Kata Sandi_password'), '9TjaAaCK7qIfsrOOD+zSsw==')

WebUI.click(findTestObject('Object Repository/Page_IndiHome/button_Daftar Sekarang'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_IndiHome/input_NOMOR PONSEL ATAU EMAIL_loginID'), 'melvaapjtn@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_IndiHome/span_masuk'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_IndiHome/input_KATA SANDI_password (1)'), '9TjaAaCK7qJiyhfBShMYuQ==')

WebUI.click(findTestObject('Object Repository/Page_IndiHome/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/button_Melalui WhatsApp 8348'))

WebUI.setText(findTestObject('Object Repository/Page_IndiHome/input_Masuk Menggunakan Nomor Ponsel_otp1'), '2')

WebUI.setText(findTestObject('Object Repository/Page_IndiHome/input_Masuk Menggunakan Nomor Ponsel_otp2'), '5')

WebUI.setText(findTestObject('Object Repository/Page_IndiHome/input_Masuk Menggunakan Nomor Ponsel_otp3'), '7')

WebUI.setText(findTestObject('Object Repository/Page_IndiHome/input_Masuk Menggunakan Nomor Ponsel_otp4'), '9')

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_Bantuan_fas fa-search content-center'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/img_Beranda_navbar-brand-img'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/ul_BerandaRiwayatBerlanggananBantuanMMasukD_486fa7'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/ul_BerandaRiwayatBerlanggananBantuanMMasukD_486fa7'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_Bantuan_fas fa-search content-center_1'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_Berlangganan'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_EN'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_EN'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_ID'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_Bantuan'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_EN_1'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_EN_1'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_Shop'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_ID'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_Riwayat'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_EN_1_2'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_ID_1'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_ID_1'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_Beranda'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_Bantuan'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_EN_1'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/i_Help_far fa-envelope'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_EN_1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_ID_1_2'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/i_Bantuan_far fa-history'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_EN_1_2'))

WebUI.click(findTestObject('Object Repository/Page_IndiHome/a_EN_1_2'))

