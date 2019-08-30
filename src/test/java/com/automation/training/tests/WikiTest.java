package com.automation.training.tests;

import com.automation.training.pages.ArticlePage;
import com.automation.training.pages.WikiHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiTest extends BaseTest {
    @Test
    public void testWikiSearch(){
        WikiHomePage home = getWikiHomePage();
        ArticlePage articlePage = home.buscar("java");
        Assert.assertEquals(articlePage.getPageTitle(),"java");
    }
}
