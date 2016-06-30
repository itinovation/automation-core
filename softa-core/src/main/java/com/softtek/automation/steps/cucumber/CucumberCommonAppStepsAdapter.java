/*=====================================================================================================
                          LEGAL NOTICE
------------------------------------------------------------------
Company Name: Softtek
Copyright Legend: � 2016 Softtek, Publisher.  All rights reserved.
No part of this publication may be reproduced, stored in a retrieval system, or transmitted in any form or by any means, electronic, 
mechanical, photocopy, recording or otherwise, without the prior written consent of the Publisher 
------------------------------------------------------------------
*/
package com.softtek.automation.steps.cucumber;

import com.softtek.automation.ConstantsUtils;
import com.softtek.automation.steps.AbstractCommonAppSteps;

import cucumber.api.java.en.When;

public class CucumberCommonAppStepsAdapter extends AbstractCommonAppSteps {

	@When("^(?i:I open application) '(.+)'$")
	public void i_open_application(String appName) {
		this.openApplication(appName);
	}

	@When("^(?i:I open default application)$")
	public void i_open_default_application() {
		this.openDefault();
	}

	
	@When("^(?i:I wait) '([0-9]*)' (?i:seconds)$")
	public void i_wait_seconds(final String seconds) throws Exception {
		this.waitForSeconds(seconds);
	}
	
	@When("^(?i:I close current application)$")
	public void i_close_current_application() {
		this.closeCurrentApp();;
	}
}
