$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test_Scripts/PestR.feature");
formatter.feature({
  "line": 1,
  "name": "Customer creation",
  "description": "",
  "id": "customer-creation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Validate customer creation",
  "description": "",
  "id": "customer-creation;validate-customer-creation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I sign in to pestroutes domain",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I create customer with \"\u003cfirst name\u003e\", \"\u003clast name\u003e\", \"\u003caddress\u003e\" and \"\u003czipcode\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I validate if \"\u003cfirst name\u003e\" \"\u003clast name\u003e\" and \"\u003caddress\u003e\" match in overview tab",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "customer-creation;validate-customer-creation;",
  "rows": [
    {
      "cells": [
        "first name",
        "last name",
        "address",
        "zipcode",
        "customer name"
      ],
      "line": 11,
      "id": "customer-creation;validate-customer-creation;;1"
    },
    {
      "cells": [
        "Rakesh",
        "Doshi",
        "3600 carlos St",
        "75070",
        "Rakesh Doshi"
      ],
      "line": 12,
      "id": "customer-creation;validate-customer-creation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Validate customer creation",
  "description": "",
  "id": "customer-creation;validate-customer-creation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I sign in to pestroutes domain",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I create customer with \"Rakesh\", \"Doshi\", \"3600 carlos St\" and \"75070\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I validate if \"Rakesh\" \"Doshi\" and \"3600 carlos St\" match in overview tab",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});