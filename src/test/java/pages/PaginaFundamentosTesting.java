package pages;

public class PaginaFundamentosTesting extends BasePage{
    private String introductionTestingLink = "//a[normalize-space()='Introducción al Testing de Software']";
    
 
    public PaginaFundamentosTesting() {
        super(driver);
    }
 
    public void clickIntroductionTestingLink() {
        clickElement(introductionTestingLink);
    }
}
