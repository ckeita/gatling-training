var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "40",
        "ok": "10",
        "ko": "30"
    },
    "minResponseTime": {
        "total": "16",
        "ok": "50",
        "ko": "16"
    },
    "maxResponseTime": {
        "total": "142",
        "ok": "142",
        "ko": "100"
    },
    "meanResponseTime": {
        "total": "54",
        "ok": "106",
        "ko": "37"
    },
    "standardDeviation": {
        "total": "41",
        "ok": "39",
        "ko": "23"
    },
    "percentiles1": {
        "total": "40",
        "ok": "135",
        "ko": "27"
    },
    "percentiles2": {
        "total": "71",
        "ok": "137",
        "ko": "44"
    },
    "percentiles3": {
        "total": "137",
        "ok": "141",
        "ko": "83"
    },
    "percentiles4": {
        "total": "141",
        "ok": "142",
        "ko": "97"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 10,
        "percentage": 25
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group4": {
        "name": "failed",
        "count": 30,
        "percentage": 75
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "20",
        "ok": "5",
        "ko": "15"
    }
},
contents: {
"req_form-d359c": {
        type: "REQUEST",
        name: "Form",
path: "Form",
pathFormatted: "req_form-d359c",
stats: {
    "name": "Form",
    "numberOfRequests": {
        "total": "10",
        "ok": "10",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "50",
        "ok": "50",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "142",
        "ok": "142",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "106",
        "ok": "106",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "39",
        "ok": "39",
        "ko": "-"
    },
    "percentiles1": {
        "total": "135",
        "ok": "135",
        "ko": "-"
    },
    "percentiles2": {
        "total": "137",
        "ok": "137",
        "ko": "-"
    },
    "percentiles3": {
        "total": "141",
        "ok": "141",
        "ko": "-"
    },
    "percentiles4": {
        "total": "142",
        "ok": "142",
        "ko": "-"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 10,
        "percentage": 100
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group4": {
        "name": "failed",
        "count": 0,
        "percentage": 0
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "5",
        "ok": "5",
        "ko": "-"
    }
}
    },"req_post-03d94": {
        type: "REQUEST",
        name: "Post",
path: "Post",
pathFormatted: "req_post-03d94",
stats: {
    "name": "Post",
    "numberOfRequests": {
        "total": "30",
        "ok": "0",
        "ko": "30"
    },
    "minResponseTime": {
        "total": "16",
        "ok": "-",
        "ko": "16"
    },
    "maxResponseTime": {
        "total": "100",
        "ok": "-",
        "ko": "100"
    },
    "meanResponseTime": {
        "total": "37",
        "ok": "-",
        "ko": "37"
    },
    "standardDeviation": {
        "total": "23",
        "ok": "-",
        "ko": "23"
    },
    "percentiles1": {
        "total": "27",
        "ok": "-",
        "ko": "27"
    },
    "percentiles2": {
        "total": "44",
        "ok": "-",
        "ko": "44"
    },
    "percentiles3": {
        "total": "83",
        "ok": "-",
        "ko": "83"
    },
    "percentiles4": {
        "total": "97",
        "ok": "-",
        "ko": "97"
    },
    "group1": {
        "name": "t < 800 ms",
        "count": 0,
        "percentage": 0
    },
    "group2": {
        "name": "800 ms < t < 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group3": {
        "name": "t > 1200 ms",
        "count": 0,
        "percentage": 0
    },
    "group4": {
        "name": "failed",
        "count": 30,
        "percentage": 100
    },
    "meanNumberOfRequestsPerSecond": {
        "total": "15",
        "ok": "-",
        "ko": "15"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
