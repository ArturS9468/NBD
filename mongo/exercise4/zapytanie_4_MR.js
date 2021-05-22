var mapFunction = function() {
    var value = { count: 1, bmi: (10000*parseFloat(this.weight))/(parseFloat(this.height)*parseFloat(this.height)) };
    emit(this.nationality, value);
};

var reduceFunction = function(sexes, objects) {
   reducedVal = { count: 0, bmi: 0, minBmi: 9999, maxBmi: 0};

   for (var idx = 0; idx < objects.length; idx++) {
       reducedVal.count += objects[idx].count;
       reducedVal.bmi += objects[idx].bmi;

       if(objects[idx].bmi > reducedVal.maxBmi){
        reducedVal.maxBmi = objects[idx].bmi;
       }

       if(objects[idx].bmi < reducedVal.minBmi){
        reducedVal.minBmi = objects[idx].bmi;
       }
   }
   return reducedVal;
};

var finalizeFunction = function (sexes, reducedObject) {
  reducedObject.avgBmi = reducedObject.bmi/reducedObject.count;
  return reducedObject;
};

db.people.mapReduce(
   mapFunction,
   reduceFunction,
   {
    out: "map_reduce_bmis",
    finalize: finalizeFunction,
   }
)

db.map_reduce_bmis.find()

//ok