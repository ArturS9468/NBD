projectStage = {
    '$project': { _id: 0, nationality: 1, weight: 1, height: 1 }
};

groupStage = {
    '$group': {
        '_id': '$nationality',
        'avgBmi': {
            '$avg': {
                '$divide' : [
                    {'$multiply' : [ {'$toDouble': '$weight'}, 10000]},
                    {'$multiply' : [ {'$toDouble': '$height'}, {'$toDouble': '$height'}]}
                ]
            }
        },
        'minBmi': {
            '$min': {
                '$divide' : [
                    {'$multiply' : [ {'$toDouble': '$weight'}, 10000]},
                    {'$multiply' : [ {'$toDouble': '$height'}, {'$toDouble': '$height'}]}
                ]
            }
        },
        'maxBmi': {
            '$max': {
                '$divide' : [
                    {'$multiply' : [ {'$toDouble': '$weight'}, 10000]},
                    {'$multiply' : [ {'$toDouble': '$height'}, {'$toDouble': '$height'}]}
                ]
            }
        }
    }
};

db.people.aggregate([
  projectStage,
  groupStage
])


/*        'minBmi': { '$avg': { '$toDouble': '$height' } }
        'maxBmi': { '$avg': { '$toDouble': '$height' } }*/