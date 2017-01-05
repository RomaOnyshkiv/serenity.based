package com.serenity.based.ui;

import com.serenity.based.model.Category;
import net.serenitybdd.screenplay.targets.Target;

public class NavigationBar {

    public static Target category(Category category) {
        return Target.the(category.name() + " category").locatedBy("*[role=navigation] *[role=list]").of(category.name());

//                .locatedBy("//td[@class='cat]/a[contains(text(), '{0}')]")
//                .of(category.name());
    }
}
