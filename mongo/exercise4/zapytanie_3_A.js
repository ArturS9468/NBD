projectStage = {
    '$project': { _id: 0, job: 1 }
};

groupStage = {
    '$group': {
        '_id': '$job',
        'count': { '$sum': 1 }
    }
};

db.people.aggregate([
  projectStage,
  groupStage
])