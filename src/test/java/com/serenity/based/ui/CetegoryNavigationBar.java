package com.serenity.based.ui;

import com.serenity.based.model.Category;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CetegoryNavigationBar extends PageObject {
    public void selectCategory(Category category) {
        $("*[role=navigation] *[role=list]").find(By.linkText(category.name())).click();
    }
}
