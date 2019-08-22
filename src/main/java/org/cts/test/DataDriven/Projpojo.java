package org.cts.test.DataDriven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Projpojo { 
	
	@FindBy(id="airport-select-origin")
	private WebElement source;
	@FindBy(id="airport-select-destination")
	private WebElement  destination;
	@FindBy(xpath="//span[text()='Return']")
	private WebElement bothways;
	@FindBy(xpath="//span[text()='One-way']")
	private WebElement oneway;
	@FindBy(className="calendar__input")
	private WebElement calenderinput;
	@FindBy(xpath="(//span[text()='23'])[1]")
	private WebElement fromdate;
	@FindBy(xpath="(//span[text()='20'])[1]")
	private WebElement invalidfromdate;
	@FindBy(xpath="(//span[text()='20'])[2]")
	private WebElement invalidtodate;
	@FindBy(xpath="(//span[text()='26'])[2]")
	private WebElement todate;
	@FindBy(id="searchButton")
	private WebElement search;
	@FindBy(xpath="//span[text()='Show Low Fare Calendar']")
	private WebElement lowfareselector;
	
	//constructor
	public Projpojo() {
		
		PageFactory.initElements(ProjBaseclass.driver,this);
	}
	
	//getters and setters
	public WebElement getSource() {
		return source;
	}

	public void setSource(WebElement source) {
		this.source = source;
	}

	public WebElement getDestination() {
		return destination;
	}

	public void setDestination(WebElement destination) {
		this.destination = destination;
	}

	public WebElement getCalenderinput() {
		return calenderinput;
	}

	public void setCalenderinput(WebElement calenderinput) {
		this.calenderinput = calenderinput;
	}

	public WebElement getFromdate() {
		return fromdate;
	}

	public void setFromdate(WebElement fromdate) {
		this.fromdate = fromdate;
	}

	public WebElement getTodate() {
		return todate;
	}

	public void setTodate(WebElement todate) {
		this.todate = todate;
	}

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}	
	public WebElement getBothways() {
		return bothways;
	}

	public void setBothways(WebElement bothways) {
		this.bothways = bothways;
	}

	public WebElement getOneway() {
		return oneway;
	}

	public void setOneway(WebElement oneway) {
		this.oneway = oneway;
	}

	public WebElement getInvalidfromdate() {
		return invalidfromdate;
	}

	public void setInvalidfromdate(WebElement invalidfromdate) {
		this.invalidfromdate = invalidfromdate;
	}

	public WebElement getInvalidtodate() {
		return invalidtodate;
	}

	public void setInvalidtodate(WebElement invalidtodate) {
		this.invalidtodate = invalidtodate;
		
	}

	public WebElement getLowfareselector() {
		return lowfareselector;
	}

	public void setLowfareselector(WebElement lowfareselector) {
		this.lowfareselector = lowfareselector;
	}

	

}
