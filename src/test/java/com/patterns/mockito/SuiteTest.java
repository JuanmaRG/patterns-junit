package com.patterns.mockito;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.patterns.mockito"})
@SuiteDisplayName("Suite patrones con moquito")
public class SuiteTest {

}
