package com.brandmaker.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("web")
@Feature("Main Page")
@Story("\"Download Report\" button")
public class DonwloadReportButtonTests extends TestBase{

    @Test
    @AllureId("1625")
    @DisplayName("Main page should contain \"Download Report\" button")
    public void downloadReportButtonExistsTest() {
        open("");
        $("#hs-en-cookie-confirmation-buttons-area").find(byText("Accept")).click();


        $(".bm_header_gs_button", 0).shouldHave(text("Download Report"));
    }

    @Test
    @AllureId("1626")
    @DisplayName("\"Download Report\" button should lead to a proper page with \"Download the full report\" button")
    public void downloadReportButtonClickTest() {
        open("");
        $("#hs-en-cookie-confirmation-buttons-area").find(byText("Accept")).click();


        $(".bm_header_gs_button", 0).shouldHave(text("Download Report"));
        $(byText("Download Report")).click();
        $("h1").shouldHave(text("The Forrester Wave™ Report MRM"));
    }
}
