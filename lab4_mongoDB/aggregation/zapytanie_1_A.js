var weightHeight = db.people.aggregate({"$group": {
    _id: "$sex",
    "avgWei": { "$avg": { "$toDouble": "$weight" } },
    "avgHei": { "$avg": { "$toDouble": "$height" } }
}}).toArray();
printjson(weightHeight);