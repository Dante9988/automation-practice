$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/hxro.feature");
formatter.feature({
  "name": "Smoke steps",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@hxro"
    }
  ]
});
formatter.scenario({
  "name": "Simple user interactions in TixWix",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hxro"
    },
    {
      "name": "@hxro1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open \"hxro\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "HxroStepDefs.iOpenPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify elements on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "HxroStepDefs.iVerifyElementsOnThePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"tixwix\"",
  "keyword": "And "
});
formatter.match({
  "location": "HxroStepDefs.iSelect(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify elements on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "HxroStepDefs.iVerifyElementsOnThePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select contracts available dates",
  "keyword": "And "
});
formatter.match({
  "location": "HxroStepDefs.iSelectContractsAvailableDates()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify expiration date",
  "keyword": "When "
});
formatter.match({
  "location": "HxroStepDefs.iVerifyExpirationDate()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Sign up steps",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hxro"
    },
    {
      "name": "@hxro2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open \"hxro\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "HxroStepDefs.iOpenPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register button",
  "keyword": "And "
});
formatter.match({
  "location": "HxroStepDefs.iClickOnButton()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat pages.HxroPage.clickRegisterButton(HxroPage.java:30)\n\tat definitions.HxroStepDefs.iClickOnButton(HxroStepDefs.java:71)\n\tat ✽.I click on register button(file:src/test/resources/features/hxro.feature:16)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});