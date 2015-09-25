package core;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sign_Up_Selen {

	public static void main(String[] args) {
				
		WebDriver driver = new FirefoxDriver();
		String text_case_id_01 = "TC-01.01";
		String text_case_id_02 = "TC-02.01";
		String text_case_id_03 = "TC-03.01";
		String text_case_id_04 = "TC-04.01";
		String text_case_id_05 = "TC-05.01";
		String text_case_id_06 = "TC-06.01";
		String text_case_id_07 = "TC-07.01";
		String text_case_id_08 = "TC-08.01";
		String text_case_id_09 = "TC-09.01";
		String text_case_id_10 = "TC-10.01";
		String text_case_id_11 = "TC-11.01";
		String text_case_id_12 = "TC-12.01";
		String text_case_id_13 = "TC-13.01";
		String text_case_id_14 = "TC-14.01";
		String text_case_id_15 = "TC-15.01";
		String text_case_id_16 = "TC-16.01";
		String text_case_id_17_neg = "TC-17.02";
		String text_case_id_18_neg = "TC-18.02";
		String text_case_id_21 = "TC-21.01";
		String text_case_id_22 = "TC-22.01";
		String text_case_id_23 = "TC-23.01";
		String text_case_id_28 = "TC-28.01";
		String text_case_id_30 = "TC-30.01";
		String text_case_id_31 = "TC-31.01";
		String url = "http://learn2test.net/qa/apps/sign_up/v1/";
		String title_sign_up_expected = "Welcome to Sign Up";
		String title_app_expected = "Sign Up";
		String title_confpage_expected = "Confirmation";
		String title_facebook_expected = "Facebook - Log In or Sign Up";
		String error_fname_empty_expected = "Please enter First Name";
		String error_lname_empty_expected = "Please enter Last Name";
		String fname = "John";
		String lname = "Smith";
		String email = "JohnSmith@gmail.com";
		String phone = "(415)-111 2233";

		// TC-01.01

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title_sign_up_actual = driver.getTitle();

		if (title_sign_up_expected.equals(title_sign_up_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_01 + " - PASSED");
			System.out.println("Title Expected/Actual: \t" + title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_01 + " - FAILED");
			System.out.println("Title Expected/Actual: \t" + title_sign_up_expected + "/" + title_sign_up_actual);
			System.out.println("=======================================");
		}

		// TC-02.01
		driver.findElement(By.id("id_f_title")).getText();
		String title_app_actual = driver.findElement(By.id("id_f_title")).getText();
		if (title_app_expected.equals(title_app_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_02 + " - PASSED");
			System.out.println("Title Expected/Actual: \t" + title_app_expected + "/" + title_app_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_02 + " - FAILED");
			System.out.println("Title Expected/Actual: \t" + title_app_expected + "/" + title_app_actual);
			System.out.println("=======================================");
		}

		// TC-03.01

		driver.findElement(By.id("id_quotes")).getText();
		String quote = driver.findElement(By.id("id_quotes")).getText();
		if (quote != null && quote.length() < 103 && quote.length() > 36) {
			System.out.println("Test Case ID: \t\t" + text_case_id_03 + " - PASSED");
			System.out.println("Quote length: " + quote.length());
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_03 + " - FAILED");
			System.out.println("Quote length: " + quote.length());
			System.out.println("=======================================");
		}

		/// TC-04.01
		if (driver.findElements(By.id("id_fname")).size() != 0) {
			System.out.println("Test Case ID: \t\t" + text_case_id_04 + " - PASSED");
			System.out.println("Field First Name exists");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_04 + " - FAILED");
			System.out.println("Field First Name not exists");
			System.out.println("=======================================");
		}

		/// TC-05.01
		if (driver.findElements(By.id("id_g_radio_01")).size() != 0) {
			System.out.println("Test Case ID: \t\t" + text_case_id_05 + " - PASSED");
			System.out.println("Radio button Male exists");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_05 + " - FAILED");
			System.out.println("Radio button Male not exists");
			System.out.println("=======================================");
		}

		/// TC-06.01
		if (driver.findElements(By.id("id_state")).size() != 0) {
			System.out.println("Test Case ID: \t\t" + text_case_id_06 + " - PASSED");
			System.out.println("Page contains drop-down list State");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_06 + " - FAILED");
			System.out.println("Page doesn't contains drop-down list State");
			System.out.println("=======================================");
		}

		/// TC-07.01
		if (driver.findElements(By.id("id_checkbox")).size() != 0) {
			System.out.println("Test Case ID: \t\t" + text_case_id_07 + " - PASSED");
			System.out.println("Page contains checkbox");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_07 + " - FAILED");
			System.out.println("Page doesn't contains checkbox");
			System.out.println("=======================================");
		}

		// TC-08.01

		driver.findElement(By.id("id_img_facebook")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(1));
		String title_facebook_actual = driver.getTitle();
		driver.close();
		driver.switchTo().window(allTabs.get(0));

		if (title_facebook_expected.equals(title_facebook_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_08 + " - PASSED");
			System.out.println("Title Expected/Actual: \t" + title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_08 + " - FAILED");
			System.out.println("Title Expected/Actual: \t" + title_facebook_expected + "/" + title_facebook_actual);
			System.out.println("=======================================");
		}

		/// TC-09.01
		if (driver.findElements(By.id("id_reset_button")).size() != 0) {
			System.out.println("Test Case ID: \t\t" + text_case_id_09 + " - PASSED");
			System.out.println("Page contains button Reset");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_09 + " - FAILED");
			System.out.println("Page doesn't contains button Reset");
			System.out.println("=======================================");
		}

		// TC-10.01
		driver.findElement(By.id("timestamp")).getText();
		String current_day = driver.findElement(By.id("timestamp")).getText();
		if (driver.findElements(By.id("timestamp")).size() != 0) {
			System.out.println("Test Case ID: \t\t" + text_case_id_10 + " - PASSED");
			System.out.println("Page contains dynamic text: " + current_day);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_10 + " - FAILED");
			System.out.println("Page doesn't contains dynamic text 'Current day'");
			System.out.println("=======================================");
		}

		// TC-11.01
		driver.findElement(By.id("copyright")).getText();
		String copyright_act = driver.findElement(By.id("copyright")).getText();
		if (copyright_act.equals("© 2015 learn2test.net")) {
			System.out.println("Test Case ID: \t\t" + text_case_id_11 + " - PASSED");
			System.out.println("Page contains static text: " + copyright_act);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_11 + " - FAILED");
			System.out.println("Page contains static text: " + copyright_act);
			System.out.println("=======================================");
		}

		// TC-12.01
		driver.findElement(By.id("os_browser")).getText();
		String os_browser = driver.findElement(By.id("os_browser")).getText();
		if (driver.findElements(By.id("os_browser")).size() != 0) {
			System.out.println("Test Case ID: \t\t" + text_case_id_12 + " - PASSED");
			System.out.println("Page contains dynamic text: " + os_browser);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_12 + " - FAILED");
			System.out.println("Page doesn't contains dinamic text (Client's OS & Browser)");
			System.out.println("=======================================");
		}

		// TC-13.01
		driver.findElement(By.id("id_current_location")).getText();
		String city_state = driver.findElement(By.id("id_current_location")).getText();
		if (driver.findElements(By.id("id_current_location")).size() != 0) {
			System.out.println("Test Case ID: \t\t" + text_case_id_13 + " - PASSED");
			System.out.println("Page contains dynamic text: " + city_state);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_13 + " - FAILED");
			System.out.println("Page doesn't contains dinamic text (Client's City and State)");
			System.out.println("=======================================");
		}

		// TC -14.01

		if (driver.findElements(By.xpath("/html/body/form/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/"
				+ "tr[1]/td[5]/table/tbody/tr[2]/td[1]/img")).size() != 0) {
			System.out.println("Test Case ID: \t\t" + text_case_id_14 + " - PASSED");
			System.out.println("Page contains dynamic icon Current weather");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_14 + " - FAILED");
			System.out.println("Page doesn't contains dynamic icon Current weather");
			System.out.println("=======================================");
		}

		// TC-15.01
		driver.findElement(By.id("id_temperature")).getText();
		String weather = driver.findElement(By.id("id_temperature")).getText();
		if (driver.findElement(By.id("id_temperature")).getSize() != null) {
			System.out.println("Test Case ID: \t\t" + text_case_id_15 + " - PASSED");
			System.out.println("Page contains dynamic text: " + weather);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_15 + " - FAILED");
			System.out.println("Page doesn't contains dynamic text");
			System.out.println("=======================================");
		}

		// TC-16.01
		driver.findElement(By.id("id_quotes")).getText();
		String quote1 = driver.findElement(By.id("id_quotes")).getText();
		if (quote != null && quote1.length() < 103 && quote1.length() > 36) {
			driver.navigate().refresh();
			driver.findElement(By.id("id_quotes")).getText();
			String quote2 = driver.findElement(By.id("id_quotes")).getText();
			if (quote != null && quote2.length() < 103 && quote2.length() > 36 && quote1 != quote2) {
				System.out.println("Test Case ID: \t\t" + text_case_id_16 + " - PASSED");
				System.out.println("Quote1: " + quote1);
				System.out.println("Quote2: " + quote2);
				System.out.println("=======================================");
			} else {
				System.out.println("Test Case ID: \t\t" + text_case_id_16 + " - FAILED");
				System.out.println("Quote same:" + quote2);
				System.out.println("=======================================");
			}
		}
		// TC-17.02

		driver.findElement(By.id("id_submit_button")).click();
		String error_fname_empty_actual = driver.findElement(By.id("ErrorLine")).getText();
		if (error_fname_empty_expected.equals(error_fname_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_17_neg + " - PASSED");
			System.out
					.println("Error Expected/Actual: \t" + error_fname_empty_expected + "/" + error_fname_empty_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_17_neg + " - FAILED");
			System.out
					.println("Error Expected/Actual: \t" + error_fname_empty_expected + "/" + error_fname_empty_actual);
			System.out.println("=======================================");
		}

		// TC-18.02

		driver.findElement(By.id("id_fname")).sendKeys("John");
		driver.findElement(By.id("id_submit_button")).click();
		String error_lname_empty_actual = driver.findElement(By.id("ErrorLine")).getText();
		if (error_lname_empty_expected.equals(error_lname_empty_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_18_neg + " - PASSED");
			System.out
					.println("Error Expected/Actual: \t" + error_lname_empty_expected + "/" + error_lname_empty_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_18_neg + " - FAILED");
			System.out
					.println("Error Expected/Actual: \t" + error_lname_empty_expected + "/" + error_lname_empty_actual);
			System.out.println("=======================================");
		}

		// TC-21.01
		driver.findElement(By.id("id_state")).click();
		WebElement state = driver.findElement(By.id("id_state"));
		String list = state.getText();
		if (list.length() != 0) {
			System.out.println("Test Case ID: \t\t" + text_case_id_21 + " - PASSED");
			System.out.println("List contains States:" + list);
			System.out.println("=======================================");
		} else {

			System.out.println("Test Case ID: \t\t" + text_case_id_21 + " - FAILED");
			System.out.println("=======================================");
		}

		/// TC-22.01

		driver.findElement(By.className("check_box_table")).click();
		WebElement gender = driver.findElement(By.className("check_box_table"));

		String list1 = gender.getText();
		if (list1.length() != 0) {
			System.out.println("Test Case ID: \t\t" + text_case_id_22 + " - PASSED");
			System.out.println("Checkbox contain options:" + list1);
			System.out.println("=======================================");
		} else {

			System.out.println("Test Case ID: \t\t" + text_case_id_22 + " - FAILED");
			System.out.println("=======================================");
		}
		
		
		/// TC-23.01

				driver.findElement(By.id("id_checkbox")).click();;
				WebElement agree = driver.findElement(By.id("id_checkbox"));

				
				if (agree.isSelected()) {
					System.out.println("Test Case ID: \t\t" + text_case_id_23 + " - PASSED");
					System.out.println("Checkbox selected" );
					System.out.println("=======================================");
				} else {

					System.out.println("Test Case ID: \t\t" + text_case_id_23 + " - FAILED");
					System.out.println("=======================================");
				}
				
		
		//TC-28.01
		driver.navigate().refresh();
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_submit_button")).click();
		
		String title1 = driver.findElement(By.id("id_f_title")).getText();
		if (title_confpage_expected.equals(title1)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_28 + " - PASSED");
			System.out.println("Button 'Submit' redirect to Confirmation page");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_28 + " - FAILED");
			System.out.println("=======================================");
		}

		// TC-30.01
		driver.findElement(By.id("id_back_button")).click();
		driver.navigate().refresh();
		driver.findElement(By.id("id_fname")).sendKeys(fname);
		driver.findElement(By.id("id_lname")).sendKeys(lname);
		driver.findElement(By.id("id_email")).sendKeys(email);
		driver.findElement(By.id("id_phone")).sendKeys(phone);
		driver.findElement(By.id("id_submit_button")).click();
		
		String fname_conf_actual = driver.findElement(By.id("id_fname_conf")).getText();
		String lname_conf_actual = driver.findElement(By.id("id_lname_conf")).getText();
		String email_conf_actual = driver.findElement(By.id("id_email_conf")).getText();
		String phone_conf_actual = driver.findElement(By.id("id_phone_conf")).getText();

		if (fname.equals(fname_conf_actual) && lname.equals(lname_conf_actual) && email.equals(email_conf_actual)
				&& phone.equals(phone_conf_actual)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_30 + " - PASSED");
			System.out.println("First Expected/Actual: \t" + fname + "/" + fname_conf_actual);
			System.out.println("Last Expected/Actual: \t" + lname + "/" + lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/" + email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/" + phone_conf_actual);
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_30 + " - FAILED");
			System.out.println("First Expected/Actual: \t" + fname + "/" + fname_conf_actual);
			System.out.println("Last Expected/Actual: \t" + lname + "/" + lname_conf_actual);
			System.out.println("Email Expected/Actual: \t" + email + "/" + email_conf_actual);
			System.out.println("Phone Expected/Actual: \t" + phone + "/" + phone_conf_actual);
			System.out.println("=======================================");
		}

		// TC-31.01

		driver.findElement(By.id("id_back_button")).click();

		String title = driver.findElement(By.id("id_f_title")).getText();
		if (title_app_expected.equals(title)) {
			System.out.println("Test Case ID: \t\t" + text_case_id_31 + " - PASSED");
			System.out.println("Button 'Back' redirect to main page");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id_31 + " - FAILED");
			System.out.println("=======================================");
		}

		driver.quit();
	}
}
