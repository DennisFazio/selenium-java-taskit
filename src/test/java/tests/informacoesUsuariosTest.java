package tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class informacoesUsuariosTest {

    @Test
    public void testAdicionarUmaInformacaoSoUsario(){
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\chromedriver.exe" );
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();

        //Abrindo a pagina
        navegador.get("http://www.juliodelima.com.br/taskit/");
        assertEquals(1,1);

        // Mapeando os elementos
        WebElement btnSignIn = navegador.findElement(By.linkText("Sign in"));
        WebElement boxSigIn = navegador.findElement(By.id("signinbox"));
        WebElement boxSigInInputUser = boxSigIn.findElement(By.name("login"));
        WebElement boxSigInInputPassword = boxSigIn.findElement(By.name("password"));
        WebElement boxSigInBtnSignIn = navegador.findElement(By.linkText("SIGN IN"));


        //Clicar no link do texto "Sign In"
        btnSignIn.click();

        //Digitar no campo com nome "Login" que está dentro do formulario de id "signinbox" o texto "dfazio"
        boxSigInInputUser.sendKeys("dfazio");

        //Digitar no campo com nome "Password" que está dentro do formulario de id "signinbox" o texto "*Ab123456"
        boxSigInInputPassword.sendKeys("*Ab123456");

        // Clicar no botão Sign In
        boxSigInBtnSignIn.click();

        // Validar se o campo class "me" possui o texto "Hi, Dedera Fazio"

        //Fechar Navegador
        navegador.close();

    }

}
