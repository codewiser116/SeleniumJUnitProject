package tests.studymate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.studymate.CommonPage;
import pages.studymate.CoursesPage;
import pages.studymate.LoginPage;
import pages.studymate.TeachersPage;
import utilities.Driver;

import java.time.Duration;

public class CourseCreationTest {

    WebDriver driver;
    CommonPage commonPage;
    LoginPage loginPage;
    TeachersPage teachersPage;
    CoursesPage coursesPage;

    /*
    1. go to  https://codewiser.studymate.us/login
    2. login
    3. click on "Teachers"
    4. click on "Add teacher"
    5. fill out the form and click on Add
    6. click on "Courses"
    7. click on "Add course"
    8. fill out the form and click on Add
    9. open the course which was created
    10. verify teacher and course details
     */

    @Before
    public void setUp(){
        driver = Driver.getDriver();
        commonPage = new CommonPage();
        loginPage = new LoginPage();
        coursesPage = new CoursesPage();
        teachersPage = new TeachersPage();
    }

    @Test
    public void testCourseCreation(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // login
        driver.get(loginPage.url);
        loginPage.login();

        // verify the user landed on analytics page
        wait.until(ExpectedConditions.urlContains(commonPage.url));
        Assert.assertEquals(commonPage.url, driver.getCurrentUrl());

        // click on Teachers, and verify user landed on Teachers page
        commonPage.teachers.click();
        wait.until(ExpectedConditions.urlContains(teachersPage.url));

        teachersPage.addTeacher();



    }




}
