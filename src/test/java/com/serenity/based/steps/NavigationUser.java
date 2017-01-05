package com.serenity.based.steps;

import com.serenity.based.model.Category;
import com.serenity.based.ui.CetegoryNavigationBar;
import com.serenity.based.ui.CurrentPage;
import com.serenity.based.ui.EbayHomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigationUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    CetegoryNavigationBar categoryNavigationBar;

    @Step
    public void isOnTheHomePage() {
        ebayHomePage.open();
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }

    @Step
    public void navigatestToTheCategory(Category category) {
        categoryNavigationBar.selectCategory(category);
    }
}
