var agg = db.people.aggregate({"$unwind": "$credit"},
  {"$match":  {"sex" : "Female"}},  
  {"$match":  {"nationality" : "Poland"}},
  {"$group": {
    _id: "$credit.currency",
    "balSum": { "$sum":{ "$toDouble": "$credit.balance" }},
    "balAvg" : { "$avg" : { "$toDouble" : "$credit.balance"}}
  }}
).toArray();
printjson(agg);

