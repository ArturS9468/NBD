var mapFunction = function() {
    var value = { weight: parseFloat(this.weight), height: parseFloat(this.height) };
    emit(this.sex, value);
};

var reduceFunction = function(sexes, objects) {
    var weights = objects.map(obj => obj.weight);
    var heights = objects.map(obj => obj.height);
    return { avgWeight: Array.avg(weights), avgHeight: Array.avg(heights) };
};

db.people.mapReduce(
   mapFunction,
   reduceFunction,
   { out: "map_reduce_weights" }
 )

db.map_reduce_weights.find()
