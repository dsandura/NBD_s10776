var findOne = db.people.findOne({nationality:"China",sex:"Female"});
printjson(findOne);