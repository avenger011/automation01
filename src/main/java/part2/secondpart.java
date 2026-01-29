package part2;

import org.openqa.selenium.By;

public class secondpart extends startpart {
    secondpart() {
        driver.findElement(By.xpath("(//textarea[@id='APjFqb'])[1]")).sendKeys("dog");
    }
}