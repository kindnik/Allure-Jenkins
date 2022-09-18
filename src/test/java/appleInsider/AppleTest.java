package appleInsider;


import core.BaseSelenideTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;

import static appleInsider.Записаться_на_курс.ПоляФормы.*;


public class AppleTest extends BaseSelenideTest {

    private final static String BASE_URL = "https://www.luxoft-training.ru/";
    private final static String SEARCH_STRING = "java";

    @Owner("Oshurkov")
    @Description("Test_1")
    @Test
    public void checkHref() {
//        MainPage mainPage = new MainPage(BASE_URL);
//        SearchPage search = mainPage.search(SEARCH_STRING);

        new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .searchKurs()
                .searchJunior()
                .clickButton()
                .filNewData(ФИО, "Ошурков Никита Юрьевич")
                .filNewData(КОМПАНИЯ, "Моя Компания мечты")
                .filNewData(MAIL, "Компания25@mail")
                .filNewData(ТЕЛЕФОН, "89990001485")
                .filNewData(ГОРОД, "Санкт-Петербург")
                .fieldRole();
    }
}
