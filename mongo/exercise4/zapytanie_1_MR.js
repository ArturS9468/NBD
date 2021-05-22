var mapFunction = function() {
    var value = { count: 1, weight: parseFloat(this.weight), height: parseFloat(this.height) };
    emit(this.sex, value);
};

var reduceFunction = function(sexes, objects) {
   reducedVal = { count: 0, weight: 0, height: 0 };

   for (var idx = 0; idx < objects.length; idx++) {
       reducedVal.count += objects[idx].count;
       reducedVal.weight += objects[idx].weight;
       reducedVal.height += objects[idx].height;
   }
   return reducedVal;
};

var finalizeFunction = function (sexes, reducedObject) {
  reducedObject.avgHeight = reducedObject.height/reducedObject.count;
  reducedObject.avgWeight = reducedObject.weight/reducedObject.count;
  return reducedObject;
};

db.people.mapReduce(
   mapFunction,
   reduceFunction,
   {
    out: "map_reduce_weights_new",
    finalize: finalizeFunction,
   }
)

db.map_reduce_weights_new.find()

//ok