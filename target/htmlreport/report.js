$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/featurefile4.feature");
formatter.feature({
  "name": "TestMe Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to the application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "user enters the credentials",
  "keyword": "* "
});
formatter.match({
  "location": "demo3_specificScenario.user_enters_the_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search the product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Search"
    }
  ]
});
formatter.step({
  "name": "user enters the product name on serach bar which is to be searched",
  "keyword": "* "
});
formatter.match({
  "location": "demo3_specificScenario.user_enters_the_product_name_on_serach_bar_which_is_to_be_searched()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add to cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Add"
    }
  ]
});
formatter.step({
  "name": "user adds the product to the cart",
  "keyword": "* "
});
formatter.match({
  "location": "demo3_specificScenario.user_adds_the_product_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "payment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Payment"
    }
  ]
});
formatter.step({
  "name": "user makes the payment",
  "keyword": "* "
});
formatter.match({
  "location": "demo3_specificScenario.user_makes_the_payment()"
});
formatter.result({
  "status": "passed"
});
});