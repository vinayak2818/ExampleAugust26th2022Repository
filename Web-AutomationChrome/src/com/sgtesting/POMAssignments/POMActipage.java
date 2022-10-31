package com.sgtesting.POMAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActipage {

	public POMActipage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//Create WebElements for UserNmae Field
	private WebElement username;
	public WebElement insertuser()
	{
		return username;
	}
	//Create WebElements for Password Field
	private WebElement pwd;
	public WebElement insertpassword()
	{
		return pwd;
	}
	//Create WebElements for Click on Login
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement aLogin;
	public WebElement clickLogin()
	{
		return aLogin;
	}
	//Create WebElements for Minimize
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement clickminimize()
	{
		return gettingStartedShortcutsPanelId;
	}
	//Create WebElements for Click on Logout
	@FindBy(linkText = "Logout")
	private WebElement logoutLink;
	public WebElement logout()
	{
		return logoutLink;
	}
	//Create WebElements for Select the Users
	@FindBy(linkText = "USERS")
	private WebElement auser;
	public WebElement clickuser()
	{
		return auser;
	}
	//Create WebElements for Add User
	@FindBy(xpath = "//div[text()='Add User']")
	private WebElement user;
	public WebElement adduser()
	{
		return user;
	}
	//Create WebElements for Add First Name
	private WebElement firstName;
	public WebElement addfirstname()
	{
		return firstName;
	}
	//Create WebElements for Add Middle Name
	private WebElement middleName;
	public WebElement addMiddlename()
	{
		return middleName;
	}
	//Create WebElements for Add Last Name
	private WebElement  lastName;
	public WebElement addLastname()
	{
		return lastName;
	}
	//Create WebElements for Add Email
	private WebElement email;
	public WebElement addEmail()
	{
		return email;
	}
	//Create WebElements for Add User Name
	private WebElement userDataLightBox_usernameField;
	public WebElement addUsername()
	{
		return userDataLightBox_usernameField;
	}
	//Create WebElements for Add Password
	private WebElement userDataLightBox_passwordField;
	public WebElement addPassword()
	{
		return userDataLightBox_passwordField;
	}
	//Create WebElements for Add PasswordCopy
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement addPasswordcopy()
	{
		return userDataLightBox_passwordCopyField;
	}
	//Create WebElements for Click on Create User
	@FindBy(xpath = "//span[text()='Create User']")
	private WebElement createuser;
	public WebElement ClickCreateuser()
	{
		return createuser;
	}
	//Create WebElements for Click on User to select
	@FindBy(xpath = "//span[text()='niki, vini v.']")
	private WebElement clickUser;
	public WebElement clickonUser()
	{
		return clickUser;
	}
	//Create WebElements for Click on Delete Button
	private WebElement userDataLightBox_deleteBtn;
	public WebElement DeleteUser()
	{
		return userDataLightBox_deleteBtn;
	}
	//Create WebElements for Save changes 
	@FindBy(xpath = "//*[@id='userDataLightBox_commitBtn']/div")
	private WebElement savechanges;
	public WebElement Saveuserchanges()
	{
		return savechanges;
	}
	//Create WebElements for Save changes for user1(Second Assignment)
	@FindBy(xpath = "//span[text()='vini, niki n.']")
	private WebElement clickmodifiedUser;
	public WebElement clickModifiedUser()
	{
		return clickmodifiedUser;
	}
	//Create WebElements for Skip Video
	@FindBy(xpath = "//span[text()='Start exploring actiTIME']")
	private WebElement VideoMinimize;
	public WebElement StartExplore()
	{
		return VideoMinimize;
	}
	//Create WebElements for select User1(Third Assignments)
	@FindBy(xpath = "//span[text()='user1, demo1 v.']")
	private WebElement User1;
	public WebElement clickUser1()
	{
		return User1;
	}
	//Create WebElements for select User2(Third Assignments)
	@FindBy(xpath = "//span[text()='user2, demo2 s.']")
	private WebElement User2;
	public WebElement clickUser2()
	{
		return User2;
	}
	//Create WebElements for select User3(Third Assignments)
	@FindBy(xpath = "//span[text()='user3, demo3 n.']")
	private WebElement User3;
	public WebElement clickUser3()
	{
		return User3;
	}
	
	
}