$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/LaunchKayak.feature");
formatter.feature({
  "line": 3,
  "name": "Launch Kayak application",
  "description": "",
  "id": "launch-kayak-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "open browser",
  "description": "",
  "id": "launch-kayak-application;open-browser",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "pass url as \"https://www.kayak.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Click on \"Flights\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "pass  Destination Airport \"anywhere\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "enter deptDate and returnDate",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click on search",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.kayak.com/",
      "offset": 13
    }
  ],
  "location": "Loginstepclass.pass_url_as(String)"
});
formatter.result({
  "duration": 5665241798,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Flights",
      "offset": 10
    }
  ],
  "location": "Loginstepclass.click_on(String)"
});
formatter.result({
  "duration": 1901271800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anywhere",
      "offset": 27
    }
  ],
  "location": "Loginstepclass.pass_Destination_Airport(String)"
});
formatter.result({
  "duration": 4779844735,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepclass.enter_deptDate_and_returnDate()"
});
formatter.result({
  "duration": 6281251676,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepclass.click_on_search()"
});
formatter.result({
  "duration": 9789824597,
  "status": "passed"
});
});