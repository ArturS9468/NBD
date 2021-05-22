db.people.count({"first_name":"Antonio", "hobby": "pingpong"})
db.people.update({"first_name": "Antonio"}, {$set: {"hobby": "pingpong"}}, false, true)
db.people.count({"first_name":"Antonio", "hobby": "pingpong"})

//ok