var mapFunction = function() {
    emit(this.job, 1);
};


var reduceFunction = function(jobs, numbers) {
    return Array.sum(numbers);
};


db.people.mapReduce(
   mapFunction,
   reduceFunction,
   { out: "map_reduce_jobs" }
 )

db.map_reduce_jobs.find()