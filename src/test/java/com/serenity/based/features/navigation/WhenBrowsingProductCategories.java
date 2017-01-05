package com.serenity.based.features.navigation;

import com.serenity.based.model.Category;
import com.serenity.based.steps.NavigationUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {

    @Steps
    NavigationUser mark;

    @Managed
    WebDriver browser;

    @Test
    public void shouldBeAbleToNavigateToMotorsCategory(){


        //        Given
        mark.isOnTheHomePage();

        //        When
        mark.navigatestToTheCategory(Category.Motors);

        //        Then
        mark.shouldSeePageTitleContaining("eBay Motors | eBay");
    }

    @Test
    public void shouldBeAbleToNavigateToElectronicsCategory(){

        //        Given
        mark.isOnTheHomePage();

        //        When
        mark.navigatestToTheCategory(Category.Electronics);

        //        Then
        mark.shouldSeePageTitleContaining("Buy Electronics Online - Phones, TVs, Computers, Tablets, Video Games | eBay");
    }
}
