matchStage = {
    '$match': { sex: 'Female', nationality : 'Poland' }
};

projectStage = {
    '$project': { _id: 0, credit: 1, sex: 1, nationality: 1 }
};

unwindStage = {
    '$unwind':  '$credit'
};

groupStage = {
    '$group': {
        '_id': '$credit.currency',
        'balanceSum': {
            '$sum': { '$toDouble': '$credit.balance' }
        },
        'avgSum': {
            '$avg': { '$toDouble': '$credit.balance' }
        }
    }
};

db.people.aggregate([
  matchStage,
  projectStage,
  unwindStage,
  groupStage
])