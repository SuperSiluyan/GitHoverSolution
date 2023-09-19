import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByTagAndText;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class HoverSolutin {

    @Test
    void hoverSolutionToEnterprize() {

        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

        open("https://github.com/");
        $(withText("Solutions")).hover();
        $(byText("Enterprise")).shouldBe(Condition.visible);
        $(byText("Enterprise")).click();
        $(".enterprise-hero").shouldHave(Condition.text("Build like the best"));


    }


}
