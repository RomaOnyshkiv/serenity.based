package com.serenity.based.features.navigation;

import com.serenity.based.steps.NavigationUser;
import com.serenity.based.tasks.NavigateTo;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static com.serenity.based.model.Category.Motors;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.Matchers.containsString;

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
        mark.navigatestToTheCategory(Motors);

        //        Then
        mark.shouldSeePageTitleContaining("eBay Motors | eBay");
    }

    @Test
    public void shouldBeAbleToViewMotorProducts(){

        Actor mike = Actor.named("Mike");
        mike.can(BrowseTheWeb.with(browser));

        when(mike).attemptsTo(NavigateTo.theCategory(Motors));

        then(mike).should(seeThat(TheWebPage.title(), containsString("eBay Motors | eBay")));
    }
}
