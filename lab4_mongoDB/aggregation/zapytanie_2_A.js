var balSum = db.people.aggregate({ "$unwind": "$credit" }, { "$group": {
  _id: "$credit.currency",
  "balSum": { "$sum": { "$toDouble": "$credit.balance" } }
}}).toArray();
printjson(balSum);