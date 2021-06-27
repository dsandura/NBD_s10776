const mF = function(){this.credit.forEach(c => {
    emit(c.currency,{ count: 1,balance: Number(c.balance)})
})};
const rF = function(currency, balances){
    var sumBal = 0
    var cnt = 0
    balances.forEach(b => {
        sumBal+=b.balance
        cnt+=b.count
    })
    return {count:cnt, bal:sumBal};
};
const fF = function(currency, vals) {return {sum:vals.bal, average:vals.bal/vals.count}}
db.people.mapReduce(mF,rF,{out: "MR5", finalize: fF,
    query: {"$and":[{sex:{"$eq":"Female"}},{nationality: {"$eq": "Poland"}}]}
});
printjson(db.MR5.find().toArray())