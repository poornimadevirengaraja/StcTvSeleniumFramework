package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.AllcountryPlanEvents;
import pageEvents.HomePageEvents;
import pageEvents.SelectYourCountryEvents;

public class Testcases extends BaseTest {

	HomePageEvents homepage = new HomePageEvents();
	SelectYourCountryEvents selectcountry = new SelectYourCountryEvents();
	AllcountryPlanEvents allcountryevents = new AllcountryPlanEvents();


	// Bahrain Validations TestCases
	// ===============================================================================

	// Testcase_1 - To verify all subscription types is dispalyed for Bahrain
	// Country

	@Test(priority = 1)
	public void Testcase1_Bahrain_subscriptiontypesaredisplayed() {
		logger.info("Testcase_1 - To verify all subscription types are dispalyed for Bahrain Country");

		logger.info("Verify Home Page of Stc TV is Loaded");
		homepage.isdisplayed_StcHomePage();

		logger.info("Verify Country Button in Home Page is displayed");
		homepage.isdisplayed_countrybutton();

		logger.info("Click on Country Button");
		homepage.click_countrybutton();

		logger.info("Click on Bahrain Button");
		selectcountry.click_BahrainBtn();

		logger.info("Validate all Subscription Types are displayed for Bahrain Country");
		allcountryevents.isdisplayed_Types();

	}

	// Testcase_2 - Bahrain Country Subscription Types Validations

	@Test(priority = 2)
	public void Testcase_2_Bahrain_validatesubsriptionTypes() {
		logger.info("Testcase_2 - To validate all subscription types text LITE, CLASSIC, PREMIUM for Bahrain Country");

		logger.info("Verify Home Page of Stc TV is Loaded");
		homepage.isdisplayed_StcHomePage();

		logger.info("Verify Country Button in Home Page is displayed");
		homepage.isdisplayed_countrybutton();

		logger.info("Click on Country Button");
		homepage.click_countrybutton();

		logger.info("Click on Bahrain Button");
		selectcountry.click_BahrainBtn();

		logger.info("Validate all Subsription Types are named correctly for Bahrain Country");
		allcountryevents.verify_litesubscriptiontypetxt();
		allcountryevents.verify_classicsubscriptiontypetxt();
		allcountryevents.verify_premiumsubscriptiontypetxt();
	}

	// Testcase_3 - Bahrain Country Subscription Prices Validations

	@Test(priority = 3)
	public void Testcase3_Bahrain_Validatesubscriptionprices() {
		logger.info("Testcase_3 - To validate subscription Prices for Bahrain Country");
		logger.info("To Verify Home Page of Stc TV is Loaded");
		homepage.isdisplayed_StcHomePage();

		logger.info("To Verify Country Button in Home Page is displayed");
		homepage.isdisplayed_countrybutton();

		logger.info("To Click on Country Button");
		homepage.click_countrybutton();

		logger.info("To Click on Bahrain Button");
		selectcountry.click_BahrainBtn();

		logger.info("To Validate Lite Subsription Prices in Bahrain Country");
		allcountryevents.verify_Liteprice();

		logger.info("To Validate Classic Subsription Prices in Bahrain Country");
		allcountryevents.verify_Classicprice();

		logger.info("To Validate Premium Subsription Prices in Bahrain Country");
		allcountryevents.verify_Premiumprice();

	}

	// Testcase_4 - Bahrain Country Subscription Currency Validations

	@Test(priority = 4)
	public void Testcase4_Bahrain_Validatesubsriptioncurrency() {
		logger.info("Testcase_4 - To validate Currency for Bahrain Country");
		logger.info("To Verify Home Page of Stc TV is Loaded");
		homepage.isdisplayed_StcHomePage();

		logger.info("To Verify Country Button in Home Page is displayed");
		homepage.isdisplayed_countrybutton();

		logger.info("To Click on Country Button");
		homepage.click_countrybutton();

		logger.info("To Click on Bahrain Button");
		selectcountry.click_BahrainBtn();

		logger.info("To Verify lite currency of bahrain");
		allcountryevents.verify_litecurrency();

		logger.info("To Verify Classic currency of bahrain");
		allcountryevents.verify_classiccurrency();

		logger.info("To Verify Premium currency of bahrain");
		allcountryevents.verify_premiumcurrency();

	}

	// KSA Validations TestCases
	// ===============================================================================

	// Testcase_5 - To verify all subscription types is dispalyed for KSA
	// Country

	@Test(priority = 5)
	public void Testcase5_KSA_subscriptiontypesaredisplayed() {
		logger.info("Testcase_5 - To verify all subscription types is dispalyed for KSA Country");
		logger.info("To Verify Home Page of Stc TV is Loaded");
		homepage.isdisplayed_StcHomePage();

		logger.info("To Verify Country Button in Home Page is displayed");
		homepage.isdisplayed_countrybutton();

		logger.info("To Click on Country Button");
		homepage.click_countrybutton();

		logger.info("To Click on KSA Button");
		selectcountry.click_KSABtn();

		logger.info("To Validate All Subscription Types is displayed in KSA Country");
		allcountryevents.isdisplayed_Types();

	}

	// Testcase_6 - KSA Country Subscription Types Validations

	@Test(priority = 6)
	public void Testcase6_KSA_validatesubsriptionTypes() {
		logger.info("Testcase_6 - To validate all subscription types text LITE, CLASSIC, PREMIUM for KSA Country");
		logger.info("To Verify Home Page of Stc TV is Loaded");
		homepage.isdisplayed_StcHomePage();

		logger.info("To Verify Country Button in Home Page is displayed");
		homepage.isdisplayed_countrybutton();

		logger.info("To Click on Country Button");
		homepage.click_countrybutton();

		logger.info("To Click on KSA Button");
		selectcountry.click_KSABtn();

		logger.info("To Validate All Subsription Types are named correctly in KSA Country");
		allcountryevents.verify_litesubscriptiontypetxt();
		allcountryevents.verify_classicsubscriptiontypetxt();
		allcountryevents.verify_premiumsubscriptiontypetxt();
	}

	// Testcase_7 - Bahrain Country Subscription Prices Validations

	@Test(priority = 7)
	public void Testcase7_KSA_Validatesubscriptionprices() {
		logger.info("Testcase_7 - To validate subscription Prices for KSA Country");
		logger.info("To Verify Home Page of Stc TV is Loaded");
		homepage.isdisplayed_StcHomePage();

		logger.info("To Verify Country Button in Home Page is displayed");
		homepage.isdisplayed_countrybutton();

		logger.info("To Click on Country Button");
		homepage.click_countrybutton();

		logger.info("To Click on KSA Button");
		selectcountry.click_KSABtn();

		logger.info("To Validate Lite Subsription Prices in KSA Country");
		allcountryevents.verify_Liteprice();

		logger.info("To Validate Classic Subsription Prices in KSA Country");
		allcountryevents.verify_Classicprice();

		logger.info("To Validate Premium Subsription Prices in KSA Country");
		allcountryevents.verify_Premiumprice();

	}

	// Testcase_8 - KSA Country Subscription Currency Validations

	@Test(priority = 8)
	public void Testcase8_KSA_Validatesubsriptioncurrency() {
		logger.info("Testcase_8 - To validate Currency for KSA Country");
		logger.info("To Verify Home Page of Stc TV is Loaded");
		homepage.isdisplayed_StcHomePage();

		logger.info("To Verify Country Button in Home Page is displayed");
		homepage.isdisplayed_countrybutton();

		/*
		 * logger.info("To Click on Country Button"); 
		 * homepage.click_countrybutton();
		 * 
		 * logger.info("To Click on KSA Button"); 
		 * selectcountry.click_KSABtn();
		 */

		logger.info("To Verify lite currency of KSA");
		allcountryevents.verify_litecurrency();

		logger.info("To Verify Classic currency of KSA");
		allcountryevents.verify_classiccurrency();

		logger.info("To Verify Premium currency of KSA");
		allcountryevents.verify_premiumcurrency();

	}

	// Kuwait Validations TestCases
	// ===============================================================================

	// Testcase_9 - To verify all subscription types is dispalyed for Kuwait

	// Country

	@Test(priority = 9)
	public void Testcase9_Kuwait_subscriptiontypesaredisplayed() {
		logger.info("Testcase_9 - To verify all subscription types is dispalyed for Kuwait Country");
		logger.info("To Verify Home Page of Stc TV is Loaded");
		homepage.isdisplayed_StcHomePage();

		logger.info("To Verify Country Button in Home Page is displayed");
		homepage.isdisplayed_countrybutton();

		logger.info("To Click on Country Button");
		homepage.click_countrybutton();

		logger.info("To Click on Kuwait Button");
		selectcountry.click_KuwaitBtn();

		logger.info("To Validate All Subscription Types is displayed in Kuwait Country");
		allcountryevents.isdisplayed_Types();

	}

	// Testcase_10 - Kuwait Country Subscription Types Validations

	@Test(priority = 10)
	public void Testcase_10_Kuwait_validatesubsriptionTypes() {
		logger.info("Testcase_10 - To validate all subscription types text LITE, CLASSIC, PREMIUM for Kuwait Country");
		logger.info("To Verify Home Page of Stc TV is Loaded");
		homepage.isdisplayed_StcHomePage();

		logger.info("To Verify Country Button in Home Page is displayed");
		homepage.isdisplayed_countrybutton();

		logger.info("To Click on Country Button");
		homepage.click_countrybutton();

		logger.info("To Click on Kuwait Button");
		selectcountry.click_KuwaitBtn();

		logger.info("To Validate All Subsription Types are named correctly in Kuwait Country");
		allcountryevents.verify_litesubscriptiontypetxt();
		allcountryevents.verify_classicsubscriptiontypetxt();
		allcountryevents.verify_premiumsubscriptiontypetxt();

	}

	// Testcase_11 - Bahrain Country Subscription Prices Validations

	@Test(priority = 11)
	public void Testcase11_Kuwait_Validatesubscriptionprices() {
		logger.info("Testcase_11 - To validate subscription Prices for Kuwait Country");
		logger.info("To Verify Home Page of Stc TV is Loaded");
		homepage.isdisplayed_StcHomePage();

		logger.info("To Verify Country Button in Home Page is displayed");
		homepage.isdisplayed_countrybutton();

		logger.info("To Click on Country Button");
		homepage.click_countrybutton();

		logger.info("To Click on Kuwait Button");
		selectcountry.click_KuwaitBtn();

		logger.info("To Validate Lite Subsription Prices in Kuwait Country");
		allcountryevents.verify_Liteprice();

		logger.info("To Validate Classic Subsription Prices in Kuwait Country");
		allcountryevents.verify_Classicprice();

		logger.info("To Validate Premium Subsription Prices in Kuwait Country");
		allcountryevents.verify_Premiumprice();

	}

	// Testcase_12 - Kuwait Country Subscription Currency Validations

	@Test(priority = 12)
	public void Testcase12_Kuwait_Validatesubsriptioncurrency() {
		logger.info("Testcase_12- To validate Currency for Kuwait Country");
		logger.info("To Verify Home Page of Stc TV is Loaded");
		homepage.isdisplayed_StcHomePage();

		logger.info("To Verify Country Button in Home Page is displayed");
		homepage.isdisplayed_countrybutton();

		logger.info("To Click on Country Button");
		homepage.click_countrybutton();

		logger.info("To Click on Kuwait Button");
		selectcountry.click_KuwaitBtn();

		logger.info("To Verify lite currency of Kuwait");
		allcountryevents.verify_litecurrency();

		logger.info("To Verify Classic currency of Kuwait");
		allcountryevents.verify_classiccurrency();

		logger.info("To Verify Premium currency of Kuwait");
		allcountryevents.verify_premiumcurrency();

	}

}
