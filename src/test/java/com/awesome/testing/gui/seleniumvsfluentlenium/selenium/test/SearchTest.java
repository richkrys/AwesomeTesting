package com.awesome.testing.gui.seleniumvsfluentlenium.selenium.test;

import com.awesome.testing.gui.seleniumvsfluentlenium.selenium.pages.MainPage;
import com.awesome.testing.gui.seleniumvsfluentlenium.selenium.pages.SearchResultsPage;
import org.junit.Test;

public class SearchTest extends SeleniumTest {

    private static final String BLOG = "https://www.awesome-testing.com";

    @Test
    public void shouldSuccessfullySearchForPosts() {
        driver.get(BLOG);
        MainPage mainPage = new MainPage(driver);
        mainPage.isInitialized();
        mainPage.searchFor("FluentLenium");

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.isInitialized();
        searchResultsPage.assertThatPostsAreDisplayed();
    }
}