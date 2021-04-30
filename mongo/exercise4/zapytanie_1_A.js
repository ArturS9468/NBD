groupStage = {
    '$group': {
        '_id': '$sex',
        'avgWeight': { '$avg': { '$toDouble': '$weight' } },
        'avgHeight': { '$avg': { '$toDouble': '$height' } }
    }
};


db.people.aggregate([
  groupStage
])