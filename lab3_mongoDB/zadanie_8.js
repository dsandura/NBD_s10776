let goodbyeMoscow = db.people.updateMany({ "location.city": "Moscow" }, { $set: { "location.city": "Moskwa" } });
printjsononeline(goodbyeMoscow);