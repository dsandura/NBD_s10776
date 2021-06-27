const mF = function(){emit(this.sex, {
  count : 0,
  height: Number(this.height),
  weight: Number(this.weight)
})};
const rF = function(sex, vals){
    var r = {count:0,height:0,weight:0}
    vals.forEach(v => {
      r.count+=1;
      r.height+=v.height;
      r.weight+=v.weight
    });
  return r;
};
const fF = function(sex, vals) { return {
  avgWei : vals.weight/vals.count,
  avgHei : vals.height/vals.count
}};
db.people.mapReduce(mF,rF,{out:"MR1",finalize: fF});
printjson(db.MR1.find().toArray());