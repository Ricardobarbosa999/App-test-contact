package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ContatosPage {

    private AndroidDriver<MobileElement> driver;

    public ContatosPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void abrirIconeTelefone() {
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Phone\"]").click();
    }
    public void abrirdisknumber() {
        driver.findElementById("com.google.android.dialer:id/dialpad_fab").click();
    }

    public void preencherTelefone(String telefone) {
        driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys(telefone);
    }

    public void clicarNovoContato() {
        driver.findElementByAccessibilityId("Create new contact").click();
    }

    public void clicarAddContato () {
        driver.findElementById("com.google.android.contacts:id/touch_outside").click();
    }

    public void preencherNome(String nome) {
        driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys(nome);
    }

    public void preencherSobrenome(String sobrenome) {
        driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys(sobrenome);
    }

    public void preencherEmail(String email) {
        driver.findElementByXPath("//android.widget.EditText[@text='Email']").sendKeys(email);
    }

    public void salvarContato() {
        driver.findElementById("com.android.contacts:id/editor_menu_save_button").click();
    }

    public String obterNomeContatoSalvo() {
        return driver.findElementById("com.android.contacts:id/large_title").getText();
    }
}
