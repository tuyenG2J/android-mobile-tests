import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

Mobile.startApplication('/Users/tuyen/Downloads/app-staging (191).apk', true)

Mobile.tap(findTestObject('Object Repository/mobile objects/android.widget.TextView - Confirm'), 0)

Mobile.tap(findTestObject('Object Repository/mobile objects/android.widget.TextView - Choose location'), 0)

Mobile.tap(findTestObject('Object Repository/mobile objects/android.widget.TextView - H Ch Minh'), 0)

Mobile.tap(findTestObject('Object Repository/mobile objects/androidx.cardview.widget.CardView'), 0)

Mobile.tap(findTestObject('Object Repository/mobile objects/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/mobile objects/android.widget.TextView - Near you'), 0)

Mobile.tap(findTestObject('Object Repository/mobile objects/android.widget.TextView - Find around H Ch Minh'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/mobile objects/android.widget.TextView - Near you collection'), 
    0)

Mobile.closeApplication()

