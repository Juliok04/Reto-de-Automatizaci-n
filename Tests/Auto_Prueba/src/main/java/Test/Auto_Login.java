package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;



public class Auto_Login {

    public static void main(String[] args) throws InterruptedException {
        // To open Google Chrome, you can choose any other browser, you would just need to download the corresponding browser driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

// The page where we will perform the automation test
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

// To find the fields to enter the username and password, then enter the information in each field
        WebElement usernamebox = driver.findElement(By.name("username"));
        usernamebox.sendKeys("Admin"); // Entering information

        WebElement passwordbox = driver.findElement(By.name("password"));
        passwordbox.sendKeys("admin123"); // Entering information

// Find the Login button
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginbutton.click(); // To click the button

        Thread.sleep(3000);


// Find the Recruitment button
        WebElement recruiment = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']"));
        recruiment.click(); // To click the button

        Thread.sleep(3000);

// Find the Add button
        WebElement addbutton = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
        addbutton.click(); // To click the button


// Enter candidate information

        WebElement Fname = driver.findElement(By.name("firstName"));  // First Name
        Fname.sendKeys("Kevin"); // Entering information

        WebElement Mname = driver.findElement(By.name("middleName")); // Middle Name
        Mname.sendKeys("Esteban"); // Entering information

        WebElement Lname = driver.findElement(By.name("lastName")); // Last Name
        Lname.sendKeys("Davis");

// Vacancy options

        WebElement vacancy = driver.findElement(By.xpath("//html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[2]"));
        vacancy.click();

        Thread.sleep(2000);

        WebElement dropdownItem = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[3]"));
        dropdownItem.click();

        WebElement email = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")); // Email
        email.sendKeys("Davis@gmail.com");

        Thread.sleep(2000);

        WebElement number = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")); // Contact number
        number.sendKeys("72197403");

        WebElement keyword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input")); // Keywords
        keyword.sendKeys("QA, Automation, tests");


        WebElement notes = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea")); // Notes
        notes.sendKeys("I really like to walk in the morning");

        Thread.sleep(3000);

        WebElement consent = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span/i"));
        consent.click();

        Thread.sleep(3000);

        WebElement upload = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/input"));
        upload.sendKeys("C:\\Users\\julio\\Documents\\Reto de Automatizacion\\Reto-de-Automatizaci-n\\Tests\\Auto_Prueba\\src\\main\\resources\\CV\\CV_prueba.pdf");

        Thread.sleep(3000);

        // Here you press the button to save the information
        WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]"));
        save.click();

        Thread.sleep(4000);

        //Shortlist
        WebElement shortlist = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"));
        shortlist.click();

        Thread.sleep(3000);

        //Save botton for the shortlist
        WebElement save2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
        save2.click();

        Thread.sleep(3000);

        //Option to schedule
        WebElement schedule = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"));
        schedule.click();

        Thread.sleep(3000);

        WebElement title = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
        title.sendKeys("Final Interview");


        // Interviewer textbox

        WebElement interviewer = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div[1]/input"));
        interviewer.sendKeys("Peter Mac Anderson");

        Thread.sleep(2000);

        // Interviewer textbox
        WebElement pick = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div[2]"));
        pick.click();

        WebElement Date = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/div/div/input")); // Date
        Date.sendKeys("2024-11-12");


        WebElement note2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[5]/div/div[2]/textarea")); // note textbox
        note2.sendKeys("It does not let me pick the Interviewer");


        WebElement save3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")); //button to save the schedule
        save3.click();

        Thread.sleep(4000);

        WebElement passed = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]")); // the candidate passed button
        passed.click();

        Thread.sleep(4000);

        WebElement save4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")); // Save button
        save4.click();

        Thread.sleep(4000);

        WebElement offer = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]")); // To offer a job position for the candidate
        offer.click();

        Thread.sleep(4000);

        WebElement save5 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")); // save button
        save5.click();
        Thread.sleep(4000);

        WebElement hire = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]")); // To hire the candidate
        hire.click();
        Thread.sleep(4000);

        WebElement save6 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")); // save button
        save6.click();

        Thread.sleep(3000);


        WebElement candidates = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a")); //  Look fo the candidates
        candidates.click();

        Thread.sleep(2000);

        WebElement status = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div"));  //  Look for the status
        status.click();

        Thread.sleep(2000);

        WebElement dropdownStatus = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[10]")); //  select the status
        dropdownStatus.click();

        WebElement search = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]"));  //to look for tha status selected
        search.click();

    }
}