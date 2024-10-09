package qa.tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.BahrainPlanEvents;
import pageEvents.HomePageEvents;
import pageEvents.KSAPlanEvents;
import pageEvents.KuwaitPlanEvents;
import pageEvents.SelectYourCountryEvents;

public class Testcases extends BaseTest {

	HomePageEvents homepage = new HomePageEvents();
	SelectYourCountryEvents selectcountry = new SelectYourCountryEvents();
	BahrainPlanEvents Bahraincountry = new BahrainPlanEvents();
	KSAPlanEvents KSACountry = new KSAPlanEvents();
	KuwaitPlanEvents KuwaitCounry = new KuwaitPlanEvents();
	

	// Bahrain Validations TestCases
	// ===============================================================================
	
	// Testcase_1 - To verify all subscription types is dispalyed for Bahrain
	// Country

	
	  @Test(priority = 1) public void Testcase_001() { logger.
	  info("Testcase_1 - To verify all subscription types is dispalyed for Bahrain Country"
	  ); logger.info("To Verify Home Page of Stc TV is Loaded");
	  homepage.isdisplayed_StcHomePage();
	  
	  logger.info("To Verify Country Button in Home Page is displayed");
	  homepage.isdisplayed_countrybutton();
	  
	  logger.info("To Click on Country Button"); homepage.click_countrybutton();
	  
	  logger.info("To Click on Bahrain Button"); selectcountry.click_BahrainBtn();
	  
	  logger.
	  info("To Validate All Subscription Types is displayed in Bahrain Country");
	  Bahraincountry.isdisplayed_Types();
	  
	  }
	  
	  // Testcase_2 - Bahrain Country Subscription Types Validations
	  
	  @Test(priority = 2) public void Testcase_002() { logger.info(
	  "Testcase_2 - To validate all subscription types text LITE, CLASSIC, PREMIUM for Bahrain Country"
	  ); logger.info("To Verify Home Page of Stc TV is Loaded");
	  homepage.isdisplayed_StcHomePage();
	  
	  logger.info("To Verify Country Button in Home Page is displayed");
	  homepage.isdisplayed_countrybutton();
	  
	  logger.info("To Click on Country Button"); homepage.click_countrybutton();
	  
	  logger.info("To Click on Bahrain Button"); selectcountry.click_BahrainBtn();
	  
	  logger.
	  info("To Validate All Subsription Types are named correctly in Bahrain Country"
	  ); Bahraincountry.verify_subscriptiontypes();
	  
	  }
	  
	  // Testcase_3 - Bahrain Country Subscription Prices Validations
	  
	  @Test(priority = 3) public void Testcase_003() { logger.
	  info("Testcase_3 - To validate subscription Prices for Bahrain Country");
	  logger.info("To Verify Home Page of Stc TV is Loaded");
	  homepage.isdisplayed_StcHomePage();
	  
	  logger.info("To Verify Country Button in Home Page is displayed");
	  homepage.isdisplayed_countrybutton();
	  
	  logger.info("To Click on Country Button"); homepage.click_countrybutton();
	  
	  logger.info("To Click on Bahrain Button"); selectcountry.click_BahrainBtn();
	  
	  logger.info("To Validate Lite Subsription Prices in Bahrain Country");
	  Bahraincountry.verify_Liteprice();
	  
	  logger.info("To Validate Classic Subsription Prices in Bahrain Country");
	  Bahraincountry.verify_Classicprice();
	  
	  logger.info("To Validate Premium Subsription Prices in Bahrain Country");
	  Bahraincountry.verify_Premiumprice();
	  
	  }
	  
	  // Testcase_4 - Bahrain Country Subscription Currency Validations
	  
	  @Test(priority = 4) public void Testcase_004() {
	  logger.info("Testcase_4 - To validate Currency for Bahrain Country");
	  logger.info("To Verify Home Page of Stc TV is Loaded");
	  homepage.isdisplayed_StcHomePage();
	  
	  logger.info("To Verify Country Button in Home Page is displayed");
	  homepage.isdisplayed_countrybutton();
	  
	  logger.info("To Click on Country Button"); homepage.click_countrybutton();
	  
	  logger.info("To Click on Bahrain Button"); selectcountry.click_BahrainBtn();
	  
	  logger.info("To Verify lite currency of bahrain");
	  Bahraincountry.verify_litecurrency();
	  
	  logger.info("To Verify Classic currency of bahrain");
	  Bahraincountry.verify_classiccurrency();
	  
	  logger.info("To Verify Premium currency of bahrain");
	  Bahraincountry.verify_premiumcurrency();
	  
	  }
	 
	// KSA Validations TestCases
	// ===============================================================================
	
	
	  // Testcase_5 - To verify all subscription types is dispalyed for KSA
	  // Country
	  
	  @Test(priority = 5) public void Testcase_005() { logger.
	  info("Testcase_5 - To verify all subscription types is dispalyed for KSA Country"
	  ); logger.info("To Verify Home Page of Stc TV is Loaded");
	  homepage.isdisplayed_StcHomePage();
	  
	  logger.info("To Verify Country Button in Home Page is displayed");
	  homepage.isdisplayed_countrybutton();
	  
	  logger.info("To Click on Country Button"); homepage.click_countrybutton();
	  
	  logger.info("To Click on KSA Button"); selectcountry.click_KSABtn();
	  
	  logger.info("To Validate All Subscription Types is displayed in KSA Country"
	  ); KSACountry.isdisplayed_Types();
	  
	  }
	  
	  
	  // Testcase_6 - KSA Country Subscription Types Validations
	  
	  @Test(priority = 6) public void Testcase_006() { logger.
	  info("Testcase_6 - To validate all subscription types text LITE, CLASSIC, PREMIUM for KSA Country"
	  ); logger.info("To Verify Home Page of Stc TV is Loaded");
	  homepage.isdisplayed_StcHomePage();
	  
	  logger.info("To Verify Country Button in Home Page is displayed");
	  homepage.isdisplayed_countrybutton();
	  
	  logger.info("To Click on Country Button"); homepage.click_countrybutton();
	  
	  logger.info("To Click on KSA Button"); selectcountry.click_KSABtn();
	  
	  logger.
	  info("To Validate All Subsription Types are named correctly in KSA Country");
	  KSACountry.verify_subscriptiontypes();
	  
	  }
	  
	  
	  // Testcase_7 - Bahrain Country Subscription Prices Validations
	  
	  @Test(priority=7) public void Testcase_007() {
	  logger.info("Testcase_7 - To validate subscription Prices for KSA Country"
	  ); logger.info("To Verify Home Page of Stc TV is Loaded");
	  homepage.isdisplayed_StcHomePage();
	  
	  logger.info("To Verify Country Button in Home Page is displayed");
	  homepage.isdisplayed_countrybutton();
	  
	  logger.info("To Click on Country Button"); homepage.click_countrybutton();
	  
	  logger.info("To Click on KSA Button"); selectcountry.click_KSABtn();
	  
	  logger.info("To Validate Lite Subsription Prices in KSA Country");
	  KSACountry.verify_Liteprice();
	  
	  logger.info("To Validate Classic Subsription Prices in KSA Country");
	  KSACountry.verify_Classicprice();
	  
	  logger.info("To Validate Premium Subsription Prices in KSA Country");
	  KSACountry.verify_Premiumprice();
	  
	  }
	  
	  
	  // Testcase_8 - KSA Country Subscription Currency Validations
	  
	  @Test(priority=8) public void Testcase_008() {
	  logger.info("Testcase_8 - To validate Currency for KSA Country");
	  logger.info("To Verify Home Page of Stc TV is Loaded");
	  homepage.isdisplayed_StcHomePage();
	  
	  logger.info("To Verify Country Button in Home Page is displayed");
	  homepage.isdisplayed_countrybutton();
	  
	  logger.info("To Click on Country Button"); homepage.click_countrybutton();
	  
	  logger.info("To Click on KSA Button"); selectcountry.click_KSABtn();
	  
	  logger.info("To Verify lite currency of KSA");
	  KSACountry.verify_litecurrency();
	  
	  logger.info("To Verify Classic currency of KSA");
	  KSACountry.verify_classiccurrency();
	  
	  logger.info("To Verify Premium currency of KSA");
	  KSACountry.verify_premiumcurrency();
	  
	  }
	 
	// Kuwait Validations TestCases
	  // ===============================================================================

		// Testcase_9 - To verify all subscription types is dispalyed for Kuwait
	
			// Country

			@Test(priority = 9)
			public void Testcase_9() {
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
				KuwaitCounry.isdisplayed_Types();

			}

			
		// Testcase_10 - Kuwait Country Subscription Types Validations

		@Test(priority = 10)
		public void Testcase_10() {
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
			KuwaitCounry.verify_subscriptiontypes();

		}
		
		
		// Testcase_11 - Bahrain Country Subscription Prices Validations

			@Test(priority=11)
			public void Testcase_11() {
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
				KuwaitCounry.verify_Liteprice();

				logger.info("To Validate Classic Subsription Prices in Kuwait Country");
				KuwaitCounry.verify_Classicprice();

				logger.info("To Validate Premium Subsription Prices in Kuwait Country");
				KuwaitCounry.verify_Premiumprice();

			}

			
			// Testcase_12 - Kuwait Country Subscription Currency Validations
			@Test(priority=12)
			public void Testcase_12() {
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
				KuwaitCounry.verify_litecurrency();

				logger.info("To Verify Classic currency of Kuwait");
				KuwaitCounry.verify_classiccurrency();

				logger.info("To Verify Premium currency of Kuwait");
				KuwaitCounry.verify_premiumcurrency();

			}
}
