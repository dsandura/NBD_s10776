const mF = function(){this.credit.forEach(c => {emit(c.currency,Number(c.balance))})};
const rF = function(currency,balances){return Array.sum(balances)};
db.people.mapReduce(mF,rF,{out:"MR2"});
printjson(db.MR2.find().toArray());