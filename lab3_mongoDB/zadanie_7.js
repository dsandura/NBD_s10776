var deleted = db.people.deleteMany({height:{"$gte":"191"}});
printjsononeline(deleted);