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
        "total": "17",
        "ok": "35",
        "ko": "17"
    },
    "maxResponseTime": {
        "total": "184",
        "ok": "184",
        "ko": "39"
    },
    "meanResponseTime": {
        "total": "48",
        "ok": "121",
        "ko": "24"
    },
    "standardDeviation": {
        "total": "50",
        "ok": "54",
        "ko": "7"
    },
    "percentiles1": {
        "total": "26",
        "ok": "141",
        "ko": "21"
    },
    "percentiles2": {
        "total": "36",
        "ok": "171",
        "ko": "30"
    },
    "percentiles3": {
        "total": "175",
        "ok": "182",
        "ko": "35"
    },
    "percentiles4": {
        "total": "182",
        "ok": "184",
        "ko": "38"
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
        "total": "35",
        "ok": "35",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "184",
        "ok": "184",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "121",
        "ok": "121",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "54",
        "ok": "54",
        "ko": "-"
    },
    "percentiles1": {
        "total": "141",
        "ok": "141",
        "ko": "-"
    },
    "percentiles2": {
        "total": "171",
        "ok": "171",
        "ko": "-"
    },
    "percentiles3": {
        "total": "182",
        "ok": "182",
        "ko": "-"
    },
    "percentiles4": {
        "total": "184",
        "ok": "184",
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
        "total": "17",
        "ok": "-",
        "ko": "17"
    },
    "maxResponseTime": {
        "total": "39",
        "ok": "-",
        "ko": "39"
    },
    "meanResponseTime": {
        "total": "24",
        "ok": "-",
        "ko": "24"
    },
    "standardDeviation": {
        "total": "7",
        "ok": "-",
        "ko": "7"
    },
    "percentiles1": {
        "total": "21",
        "ok": "-",
        "ko": "21"
    },
    "percentiles2": {
        "total": "30",
        "ok": "-",
        "ko": "30"
    },
    "percentiles3": {
        "total": "35",
        "ok": "-",
        "ko": "35"
    },
    "percentiles4": {
        "total": "38",
        "ok": "-",
        "ko": "38"
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
