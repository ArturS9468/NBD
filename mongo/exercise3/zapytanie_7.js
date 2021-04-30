db.people.deleteMany({"height" : {$gt : "190"}})
db.people.count({"height" : {$gt : "190"}})