var mF = function(){
  var bmi = this.weight/(this.height*this.height);
  emit(this.nationality,{bmiSum:bmi,minBmi:bmi,maxBmi:bmi,count:1});
};
var rF = function(job, bmi){
  var sum = 0;
  var cnt = 0;
  var min = bmi[0].minBmi;
  var max = bmi[0].maxBmi;
  bmi.forEach(b => {
    cnt += b.count;
    sum += b.bmiSum;
    if(b.minBmi<min)min=b.minBmi;
    if(b.maxBmi>max)max=b.maxBmi;
  });
  return {bmiSum:sum,BmiMin:min,BmiMax:max,count:cnt};
};
var fF = function(nationality, rVals) { return {
  minBmi: rVals.BmiMin,
  maxBmi: rVals.BmiMax,
  aveBMI: rVals.bmiSum/rVals.count
}};
db.people.mapReduce(mF,rF,{out:"MR4",finalize:fF});
printjson(db.MR4.find().sort( { _id: 1 } ).toArray());