# 📱 Automação de Contatos Android

&#x20;&#x20;

## Descrição

Automação de testes para o app de **contatos e discagem** Android usando **Java, Appium e Selenium**. Valida a criação de contatos e a discagem de números.

---

## Funcionalidades

- Abrir o app de contatos
- Adicionar novo contato (nome, sobrenome, telefone, e-mail)
- Validar dados do contato criado
- Abrir discador e preencher número `11999999999` (opcional)

---

## Setup Rápido

1. Instalar **Java 21** e **Maven**
2. Instalar **Android Studio** e criar um emulador Android
3. Instalar **Appium 2.19.0**
   ```bash
   npm install -g appium@2.19.0
   appium
   ```
4. JSON de Desired Capabilities no Appium Inspector:

```json
{
  "platformName": "Android",
  "platformVersion": "16.0",
  "deviceName": "emulator-5554",
  "automationName": "UiAutomator2",
  "appPackage": "com.android.contacts",
  "appActivity": "com.android.contacts.PeopleActivity",
  "noReset": true
}
```







