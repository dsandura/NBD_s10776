var find = db.people.find({ birth_date: { "$gte": "2001-01-01T00:00:00Z", "$lte": "2100-12-31T23:59:59Z" } }).toArray();
printjson(find);