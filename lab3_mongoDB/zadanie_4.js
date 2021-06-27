var find = db.people.find({ weight: { "$gte": "68", "$lte": "71.49" } }).toArray()
printjson(find);