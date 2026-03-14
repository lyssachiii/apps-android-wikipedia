package org.wikipedia.homeworks.homework11

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.device.exploit.Exploit
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity
import java.util.Locale

class DeviceControlWikipediaTest : TestCase() {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkDeviceRotation() {
        before {
        }.after {
            device.exploit.setOrientation(Exploit.DeviceOrientation.Portrait)
        }.run {
            step("Проверяет natural orientation в портретной ориентации") {
                assertTrue(device.uiDevice.isNaturalOrientation)
            }

            step("Поворачивает экран") {
                device.exploit.rotate()
                Thread.sleep(2000)
            }

            step("Проверяет, что ориентация больше не natural") {
                assertFalse(device.uiDevice.isNaturalOrientation)
            }
        }
    }

    @Test
    fun checkElementAfterScreenWake() {
        before {
        }.after {
            if (!device.uiDevice.isScreenOn) {
                device.uiDevice.wakeUp()
            }
        }.run {
            step("Проверяет отображение кнопки Skip") {
                OnboardingScreen {
                    skipButton.isDisplayed()
                }
            }

            step("Выключает и включает экран") {
                device.uiDevice.sleep()
                Thread.sleep(2000)
                device.uiDevice.wakeUp()
                Thread.sleep(2000)
            }

            step("Проверяет, что кнопка Skip отображается") {
                OnboardingScreen {
                    skipButton.isDisplayed()
                }
            }
        }
    }

    @Test
    fun checkAppAfterRecents() {
        before {
        }.after {
            device.uiDevice.pressHome()
        }.run {
            step("Проверяет отображение кнопки Skip") {
                OnboardingScreen {
                    skipButton.isDisplayed()
                }
            }

            step("Сворачивает и возвращает приложение через Recent Apps") {
                device.uiDevice.pressHome()
                Thread.sleep(1000)
                repeat(2) {
                    device.uiDevice.pressRecentApps()
                    Thread.sleep(1000)
                }
            }

            step("Проверяет, что кнопка Skip снова отображается") {
                OnboardingScreen {
                    skipButton.isDisplayed()
                }
            }
        }
    }

    @Test
    fun  checkLanguageChange() {
        before {
        }.after {
            device.uiDevice.pressHome()
            device.language.switchInApp(Locale.ENGLISH)
        }.run {
            step("Меняет язык приложения на русский") {
                device.language.switchInApp(Locale.forLanguageTag("ru"))
                Thread.sleep(2000)
            }

            step("Проверяет русский текст кнопки") {
                OnboardingRuScreen {
                    skipButton.isDisplayed()
                }
            }
        }
    }

    @Test
    fun checkMainActivity() {
        before {
        }.after {
            device.uiDevice.pressHome()
        }.run {
            step("Закрывает онбординг") {
                OnboardingScreen {
                    skipButton.click()
                }
            }

            step("Проверяет, что сейчас активна MainActivity") {
                Thread.sleep(2000)
                device.activities.isCurrent(MainActivity::class.java)
            }
        }
    }

    @Test
    fun checkNetworkBehaviour() {
        before {
            device.network.toggleWiFi(false)
        }.after {
            device.network.toggleWiFi(true)
        }.run {
            step("Пропускает онбординг") {
                OnboardingScreen {
                    skipButton.click()
                }
            }

            step("Проверяет, что приложение осталось на MainActivity без сети") {
                Thread.sleep(2000)
                device.activities.isCurrent(MainActivity::class.java)
            }
        }
    }
}