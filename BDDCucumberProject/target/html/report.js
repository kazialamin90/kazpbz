$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/KaziPBZ/Documents/workspace/BDDCucumberProject/page.feature");
formatter.feature({
  "line": 1,
  "name": "purchase product",
  "description": "",
  "id": "purchase-product",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "purchase-product;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@buyproduct"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "i open eshopper24.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i click men",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "i should be manpage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "24",
      "offset": 15
    }
  ],
  "location": "PagestepDefinition.i_open_eshopper_com(int)"
});
formatter.result({
  "duration": 200564463,
  "error_message": "java.lang.NullPointerException\n\tat PagestepDefinition.i_open_eshopper_com(PagestepDefinition.java:15)\n\tat ✽.Given i open eshopper24.com(/Users/KaziPBZ/Documents/workspace/BDDCucumberProject/page.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "PagestepDefinition.i_click_men()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PagestepDefinition.i_should_be_manpage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});