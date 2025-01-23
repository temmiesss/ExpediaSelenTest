package DemoQA.page;

import org.testng.annotations.Test;

public class TextBox2 extends BaseDemoQA {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    public void testTextBox2() {
        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillUserName("Олег")
                .fillUserEmail("oleg@gmail.com")
                .clickSumbit();
    }
}
