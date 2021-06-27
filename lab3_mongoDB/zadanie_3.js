var find = db.people.find({ nationality:"Germany",sex:"Male"}).toArray()
printjson(find);