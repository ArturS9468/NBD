db.people.count({"location.city": "Moscow"})
db.people.count({"location.city": "Moskwa"})
db.people.update({"location.city": "Moscow"}, {$set: {"location.city": "Moskwa"}}, false, true)
db.people.count({"location.city": "Moscow"})
db.people.count({"location.city": "Moskwa"})

//ok