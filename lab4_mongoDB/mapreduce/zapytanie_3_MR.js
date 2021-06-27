const mF = function(){emit(this.job,"")};
const rF = function(job, val){return job};
db.people.mapReduce(mF,rF,{out:"MR3"});
printjson(db.MR3.find().toArray());