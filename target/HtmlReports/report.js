$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Parametrization.feature");
formatter.feature({
  "name": "To test the Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check whether the login credentials are working or not",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Website is opened using url",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters the \u003cname\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on the Login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "password"
      ]
    },
    {
      "cells": [
        "Rohan",
        "12345"
      ]
    },
    {
      "cells": [
        "Mohit",
        "12345"
      ]
    },
    {
      "cells": [
        "Priya",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check whether the login credentials are working or not",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Website is opened using url",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Definations.Parametrization_Steps.website_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the Rohan and 12345",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definations.Parametrization_Steps.user_enters_the_name_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definations.Parametrization_Steps.user_clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check whether the login credentials are working or not",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Website is opened using url",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Definations.Parametrization_Steps.website_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the Mohit and 12345",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definations.Parametrization_Steps.user_enters_the_name_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definations.Parametrization_Steps.user_clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check whether the login credentials are working or not",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Website is opened using url",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Definations.Parametrization_Steps.website_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the Priya and 12345",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definations.Parametrization_Steps.user_enters_the_name_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definations.Parametrization_Steps.user_clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
});