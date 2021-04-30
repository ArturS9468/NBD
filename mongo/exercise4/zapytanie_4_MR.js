var mapFunction = function() {
    emit(this.nationality, (10000*parseFloat(this.weight))/(parseFloat(this.height)*parseFloat(this.height)));
};


var reduceFunction = function(sexes, bmis) {
    return { avgBmi: Array.avg(bmis), minBmi: Math.min.apply(null, bmis), maxBmi: Math.max.apply(null, bmis) };
};


db.people.mapReduce(
   mapFunction,
   reduceFunction,
   { out: "map_reduce_bmis" }
 )

db.map_reduce_bmis.find()
