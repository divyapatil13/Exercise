package com.mm.exercise.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mm.exercise.utils.BaseClass;

public class ExercisePage extends BaseClass {
	WebDriver driver;

	public ExercisePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* Declaration of locators *****/
	@FindBy(how = How.ID, using = "lbl_val_1")
	private WebElement value1;
	@FindBy(how = How.ID, using = "lbl_val_2")
	private WebElement value2;
	@FindBy(how = How.ID, using = "lbl_val_3")
	private WebElement value3;
	@FindBy(how = How.ID, using = "lbl_val_4")
	private WebElement value4;
	@FindBy(how = How.ID, using = "lbl_val_5")
	private WebElement value5;
	@FindBy(how = How.ID, using = "lbl_ttl_val")
	private WebElement totalbalance;
	@FindBy(how = How.ID, using = "txt_val_1")
	private WebElement amount1;
	@FindBy(how = How.ID, using = "txt_val_2")
	private WebElement amount2;
	@FindBy(how = How.ID, using = "txt_val_4")
	private WebElement amount3;
	@FindBy(how = How.ID, using = "txt_val_5")
	private WebElement amount4;
	@FindBy(how = How.ID, using = "txt_val_6")
	private WebElement amount5;
	@FindBy(how = How.ID, using = "txt_ttl_val")
	private WebElement totalamount;

	public float convertStringtoFloat(String value) {
		value = value.replaceAll("\\$", "");
		value = value.replaceAll(",", "");
		float val = 0;
		if (!value.isEmpty()) {
			val = Float.parseFloat(value);
			System.out.println(val);
		}
		return val;

	}

	float val1 = convertStringtoFloat(amount1.getText());
	float val2 = convertStringtoFloat(amount2.getText());
	float val3 = convertStringtoFloat(amount3.getText());
	float val4 = convertStringtoFloat(amount4.getText());
	float val5 = convertStringtoFloat(amount5.getText());
	float total = convertStringtoFloat(totalamount.getText());

	public void noofValues() {
		if (value1 != null && value2 != null && value3 != null && value4 != null && value5 != null) {
			System.out.println("There are five values on the screen");
		} else {
			System.out.println("All five values are not present on the screen");
		}
	}

	public void valuesgreaterthanzero() {
		if (val1 > 0 && val2 > 0 && val3 > 0 && val4 > 0 && val5 > 0) {
			System.out.println("All the values are greater than zero");
		} else {
			System.out.println("Not all the values are greater than zero");
		}

	}

	public void totalbalance() {
		float sum = val1 + val2 + val3 + val4 + val5;
		if (sum == total) {
			System.out.println("Total balance is correct based on the values listed on the screen");
		} else {
			System.out.println("Total balance is not correct based on the values listed on the screen");
		}
	}

	public void valueascurrency() {
		java.text.NumberFormat format = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.US);
		String str1 = format.format(val1);
		String str2 = format.format(val2);
		String str3 = format.format(val3);
		String str4 = format.format(val4);
		String str5 = format.format(val5);
		if (str1 == value1.getText() && str2 == value2.getText() && str3 == value3.getText() && str4 == value4.getText()
				&& str5 == value5.getText()) {
			System.out.println("Values are formatted as currencies");
		} else {
			System.out.println("Values are not formatted as currencies");
		}
	}

	public void balanceandvaluetotal() {
		float sum = val1 + val2 + val3 + val4 + val5;
		if (sum == total) {
			System.out.println("Total balance matches the sum of the values");
		} else {
			System.out.println("Total balance doesn't matche with the sum of the values");
		}

	}
}