projectStage = {
    '$project': { _id: 0, credit: 1 }
};

unwindStage = {
    '$unwind':  '$credit'
};

groupStage = {
    '$group': {
        '_id': '$credit.currency',
        'balanceSum': { '$sum': { '$toDouble': '$credit.balance' } }
    }
};

db.people.aggregate([
  projectStage,
  unwindStage,
  groupStage
])