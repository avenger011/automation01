package org.example.clssexp;

import org.openqa.selenium.By;

class runner extends part1 {
void runner1()
{
    driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("dog");
}

public static void main(String[] args)
{
    runner r1=new runner();
    r1.runner1();

}
}
