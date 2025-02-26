var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":16,"id":0,"methods":[{"el":10,"sc":5,"sl":8},{"el":15,"sc":5,"sl":13}],"name":"EmptyListException","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_13":{"methods":[{"sl":8}],"name":"testPopSurListeVide","pass":true,"statements":[{"sl":9}]},"test_5":{"methods":[{"sl":13}],"name":"testPopLastSurListeVide","pass":true,"statements":[{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [13], [13], [], [], [], [5], [5], [], []]
