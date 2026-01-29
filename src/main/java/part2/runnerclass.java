package part2;

import org.openqa.selenium.By;

public class runnerclass extends secondpart {
    runnerclass(){
        driver.findElement(By.xpath("//div[@class=\"u4Uk3c\"]")).click();

    }
    public static void main(String[] args){
    runnerclass r1=new runnerclass();

    }
}
