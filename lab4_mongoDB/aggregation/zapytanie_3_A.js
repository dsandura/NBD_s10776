var jobs = db.people.distinct("job");
printjson(jobs);